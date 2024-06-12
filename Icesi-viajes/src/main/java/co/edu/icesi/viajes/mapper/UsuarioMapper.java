package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        
        

        return usuarioDTO;
    }

    public static Usuario toEntity(UsuarioDTO usuarioDTO) {
    	
        if (usuarioDTO == null) {
            return null;
        }

        Usuario usuario = new Usuario();
        //usuario.setIdUsua(usuarioDTO.getId());
        	
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setIdentificacion(usuarioDTO.getIdentificacion());
        usuario.setRol(usuarioDTO.getRolesStr());
        
        //usuario.setFechaCreacion(usuarioDTO.getNumeroPersonas());
        //usuario.setFechaModificacion(usuarioDTO.getPrecioTotal());
        //usuario.setUsuCreador(usuarioDTO.getEstado());
        //usuario.setUsuModificador(usuarioDTO.getIdAgente());
        //usuario.setEstado(usuarioDTO.getIdAgente());
        //usuario.setUsuModificador(usuarioDTO.getIdAgente());

        return usuario;
    }
}