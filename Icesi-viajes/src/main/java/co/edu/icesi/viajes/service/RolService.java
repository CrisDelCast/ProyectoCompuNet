package co.edu.icesi.viajes.service;


import java.util.List;
import java.util.Optional;
import co.edu.icesi.viajes.domain.Rol;

public interface RolService extends GenericService<Rol, Integer> {
	
	public List<Rol>consultarRoles(String TipoROl);

	Optional<Rol> findById(Long id);

}
