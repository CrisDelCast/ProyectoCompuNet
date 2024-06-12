package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.CredencialesDTO;

import co.edu.icesi.viajes.dto.UsuarioDTO;
import co.edu.icesi.viajes.dto.UsuarioResponseDTO;
import co.edu.icesi.viajes.service.UsuarioService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Usuario usuarioAutenticado = usuarioService.autenticarUsuario(usuario.getLogin(), usuario.getPassword());
        if (usuarioAutenticado != null) {
            return ResponseEntity.ok(usuarioAutenticado);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    
    @PostMapping("/autenticar")
    public ResponseEntity<?> autenticarUsuario(@RequestBody CredencialesDTO credenciales) {
        Usuario usuario = usuarioService.autenticarUsuario(credenciales.getLogin(), credenciales.getPassword());
        if (usuario != null) {
            UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO(
                usuario.getIdUsua(), usuario.getLogin(), usuario.getNombre(), usuario.getRol().getNombre()
            );
            return ResponseEntity.ok(usuarioResponseDTO);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    @GetMapping("/usuariostotal")
    public ResponseEntity<List<UsuarioDTO>> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios = usuarioService.findAll();
        List<UsuarioDTO> usuariosDTO = new ArrayList<>();
        
        for (Usuario usuario : usuarios) {
        	
        	List<Rol> objects = usuario.getRoles();
        			List<Integer> rolIds = objects.stream()
        			                             .map(obj -> obj.getId()) // Lambda expression
        			                             .collect(Collectors.toList());
        	

            //UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getIdUsua(), usuario.getNombre(), usuario.getEstado(), usuario.getFechaCreacion());
        	UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getIdUsua(),usuario.getLogin(), usuario.getNombre(), usuario.getIdentificacion(),
        			usuario.getEstado(), rolIds.get(0));
        	usuariosDTO.add(usuarioDTO);
        }
        return ResponseEntity.ok(usuariosDTO);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> detalleUsuario(@PathVariable Integer id) {
    	Usuario usuario = usuarioService.findById(id).get();
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    
    }
    
    
    @PostMapping(value = "/crear")
    public ResponseEntity<?> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
    	
    	Usuario nuevoUsuario= usuarioService.crearUsuario(usuarioDTO);
        if (nuevoUsuario !=  null) {
        	
            return ResponseEntity.ok(nuevoUsuario);
        } else{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("usuario no creada");
        }
    }
        

	@PutMapping("/{id}/actualizar")
    public ResponseEntity<UsuarioDTO> actualizarUsuario(@PathVariable Integer id) {
    	Usuario usuario  = usuarioService.consultarUsuarioPorId(id);

        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getIdUsua(),usuario.getNombre(),usuario.getEstado());
        return ResponseEntity.ok(usuarioDTO);
    }
    
    @PostMapping("/crear0")
    public ResponseEntity<String> crearUsuario0(@RequestBody UsuarioDTO usuarioDTO) { //,@RequestParam Long rolId
        try {
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setLogin(usuarioDTO.getLogin());
            nuevoUsuario.setPassword(usuarioDTO.getPassword());
            nuevoUsuario.setNombre(usuarioDTO.getNombre());
            nuevoUsuario.setIdentificacion(usuarioDTO.getIdentificacion());
            nuevoUsuario.setFechaModificacion(usuarioDTO.getFechaModificacion());
            nuevoUsuario.setUsuCreador("Admin");
            nuevoUsuario.setEstado("A"); 
            
            //List<RolDTO> rolesDTO = usuarioDTO.getRoles();
            //Rol rol = new Rol();
            //rol.setId(rolesDTO.get(0).getId());
            //rol.setNombre(rolesDTO.get(0).getNombre());
            		
            
            List<Rol> roles = usuarioDTO.getRoles() != null ? usuarioDTO.getRoles().stream()
                    .map(rolDTO -> new Rol(rolDTO.getId(), rolDTO.getNombre())) // Create a new Rol object
                    .collect(Collectors.toList()) : Collections.emptyList();

            nuevoUsuario.setRoles(roles);
            

            Usuario usuarioGuardado = usuarioService.save(nuevoUsuario);
            return ResponseEntity.ok("Usuario creado con éxito: " + usuarioGuardado.getIdUsua());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al crear el usuario: " + e.getMessage());
        }
    }
    
    
    
    


}