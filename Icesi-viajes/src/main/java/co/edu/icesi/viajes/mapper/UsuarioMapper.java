package co.edu.icesi.viajes.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.dto.UsuarioDTO;

public class UsuarioMapper {
	  public static UsuarioDTO UserToUserDto(Usuario usuario) {
	        if (usuario == null) {
	            return null;
	        }
	        
	        UsuarioDTO usuarioDto = new UsuarioDTO ();
	        usuarioDto.setLogin(usuario.getLogin());
	        usuarioDto.setPassword(usuario.getPassword());
	        usuarioDto.setNombre(usuario.getNombre());
	        usuarioDto.setIdentificacion(usuario.getIdentificacion());
	        usuarioDto.setEstado(usuario.getEstado());
	        
	        
	        
	        
	        return usuarioDto;
	    }
	    
	    public static Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDto) {
	        if (usuarioDto == null) {
	            return null;
	        }
	        
	        
	        Usuario usuario = new Usuario();
	        usuario.setLogin(usuarioDto.getLogin());
	        usuario.setPassword(usuarioDto.getPassword());
	        usuario.setNombre(usuarioDto.getNombre());
	        usuario.setIdentificacion(usuarioDto.getIdentificacion());
	        usuario.setEstado(usuarioDto.getEstado());
	        
	       
	        
	        return usuario;
	    }
	    
	    

}
