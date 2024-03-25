package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TipoDestinoRepository extends JpaRepository<TipoDestino,Integer> {
	
	public List<TipoDestino> findByCodigo(String codigo);
	public List<TipoDestino> findByCodigoAndEstado(String codigo,String estado);
	
	@Query("select tp from TipoDestino tp where tp.codigo = ?1 and tp.estado = ?2")
	public List<TipoDestino> consultarporCodigoEstado(String codigo, String estado);
	//14
	@Query("select tp from TipoDestino tp order by tp.nombre asc")
	public List<TipoDestino> consultarTiposDestinoOrdenados();
	//ejemplo profe
	@Query(nativeQuery = true)
	public List<TipoDestinoDTO> consultarTipoDestinoPorEstado(@Param("pEstado") String estado );
	
}
