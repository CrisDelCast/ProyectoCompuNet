package co.edu.icesi.viajes.service;

import java.util.Date;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.dto.UsuarioDTO;


public interface UsuarioService extends GenericService<Usuario,Integer>{
	//public Usuario crearUsuario(Integer idUsua, String login, String password, String nombre, String identificacion, Date fechaCreacion,Date fechaModificacion, String usuCreador, String usuarioModificador, String estado);
	public Usuario modificarUsuario(Integer idUsua,String login, String password, String nombre, String identificacion, String estado) throws Exception;
	public void eliminarUsuario(Integer idUsua) throws Exception;
	public Usuario consultarUsuarioPorId(Integer idUsua);
	public Usuario autenticarUsuario(String login, String password);
	Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado) throws Exception;

	Usuario crearUsuario(UsuarioDTO usuarioDTO);
	
}