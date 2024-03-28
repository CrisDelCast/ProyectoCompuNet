package co.edu.icesi.viajes.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.domain.TipoDestino;

public interface RolService extends GenericService<Rol, Integer> {
	
	public List<Rol>consultarRoles(String TipoROl);

}
