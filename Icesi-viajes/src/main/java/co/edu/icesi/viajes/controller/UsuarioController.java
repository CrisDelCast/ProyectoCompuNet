package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.CredencialesDTO;
import co.edu.icesi.viajes.dto.UsuarioDTO;
import co.edu.icesi.viajes.dto.UsuarioResponseDTO;
import co.edu.icesi.viajes.service.UsuarioService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
            UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getIdUsua(), usuario.getNombre(), usuario.getEstado(), usuario.getFechaCreacion());
            usuariosDTO.add(usuarioDTO);
        }
        return ResponseEntity.ok(usuariosDTO);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody UsuarioDTO usuarioDTO) {
        try {
            Usuario usuarioGuardado = usuarioService.actualizarUsuario(id, new Usuario());
            return ResponseEntity.ok(usuarioGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario, @RequestParam Integer rolId) {
        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario, rolId);
        return ResponseEntity.ok(nuevoUsuario);
    }
    
    
    
    
    


}