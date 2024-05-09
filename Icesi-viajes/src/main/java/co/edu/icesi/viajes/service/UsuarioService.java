package co.edu.icesi.viajes.service;

import java.util.List;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;

public interface UsuarioService extends GenericService<Usuario, Integer> {
    Usuario autenticarUsuario(String login, String password);
    List<Usuario> findAll();
    Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado) throws Exception;
}