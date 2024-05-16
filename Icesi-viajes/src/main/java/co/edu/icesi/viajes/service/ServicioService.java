package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;


public interface ServicioService {
	
	 List<Servicio> findAll();

	    Optional<Servicio> findById(Integer id);

	    Servicio save(Servicio entity) throws Exception;

	    Servicio update(Servicio entity) throws Exception;

	    void delete(Servicio entity) throws Exception;

	    void deleteById(Integer id) throws Exception;

	    void validate(Servicio entity) throws Exception;

	    Long count();
	    
	    ServicioDTO createServicio(ServicioDTO servicioDto) throws Exception;

	    ServicioDTO editServicio(ServicioDTO servicioDto) throws Exception;
	    
	    
	    

}
