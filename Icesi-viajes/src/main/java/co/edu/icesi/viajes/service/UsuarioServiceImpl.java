package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;

import co.edu.icesi.viajes.mapper.UsuarioMapper;
import co.edu.icesi.viajes.repository.RolRepository;
import co.edu.icesi.viajes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> lstUsuario = usuarioRepository.findAll();
        return lstUsuario;
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public void delete(Usuario entity) throws Exception {
        usuarioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void validate(Usuario entity) throws Exception {

    }

    @Override
    public Long count() {
        return usuarioRepository.count();
    }
    
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
    	Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);
        return usuarioRepository.save(usuario);
    }
    
  
    @Override
    public Usuario modificarUsuario(Integer idUsua, String login, String password, String nombre, String identificacion, String estado) throws Exception {
            Optional<Usuario> optionalUsuario = usuarioRepository.findById(idUsua);
            if (optionalUsuario.isPresent()) {
                Usuario usuario = optionalUsuario.get();
                usuario.setLogin(login);
                usuario.setPassword(password);
                usuario.setNombre(nombre);
                usuario.setIdentificacion(identificacion);
                usuario.setFechaModificacion(new Date());
                usuario.setEstado(estado);

                return usuarioRepository.save(usuario);
            } else {
                throw new Exception("Usuario no encontrado");
            }
      }

     @Override   
     public void eliminarUsuario(Integer idUsua) throws Exception {
            Optional<Usuario> optionalUsuario = usuarioRepository.findById(idUsua);
            if (optionalUsuario.isPresent()) {
                usuarioRepository.delete(optionalUsuario.get());
            } else {
                throw new Exception("Usuario no encontrado");
            }
     }

	@Override
	public Usuario consultarUsuarioPorId(Integer idUsua) {
		
		return usuarioRepository.consultarUsuarioPorId(idUsua);
	}
    
    
    @Override
    public Usuario autenticarUsuario(String login, String password) {
        
        Usuario usuario = usuarioRepository.findByLogin(login);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        }
        return null;
    }
    
    @Override
    public Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado) throws Exception {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setEstado(usuarioActualizado.getEstado());
            usuarioRepository.updateUsuario(id, usuario.getNombre(), usuario.getEstado());
            return usuario;
        } else {
            throw new Exception("Usuario no encontrado");
        }
    }

    
}
