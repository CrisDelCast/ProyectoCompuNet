package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {
	
	//query numero 1
		@Query("select tp from TipoIdentificacion tp where tp.estado = ?1 order by tp.nombre ")
		public List<TipoIdentificacion> findByEstadoOrdered(String estado);
	//QUERY 7 
		@Query("select tp from TipoIdentificacion tp where tp.codigo = ?1 and tp.estado = ?2")
		public List<TipoIdentificacion> consultarPorCodigoEstado(String codigo, String estado);
	
		
		
}
