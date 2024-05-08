package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Destino;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DestinoRepository extends JpaRepository<Destino, Integer> {
	//11
	@Query("select tp from Destino tp where tp.codigo = ?1 ")
	public Destino consultarDestinoPorCodigo(String codigo);
	//12

	@Query("select tp from Destino tp where tp.codigo = ?1 and tp.estado = 'A'")
	public List<Destino> consultarDestinoPorCodigoEstado(String codigo);
	
	// FIX
	// TO-DO Here there is something to check. codigoTipoDestino =! codigo from Destino	
	@Query("select tp from Destino tp where tp.codigo = ?1")
	public List<Destino> consultarPorTipoDestino(String codigoTipoDestino);
	
	//13
	@Query("select tp from Destino tp where tp.estado = 'A'")
	public List<Destino> consultarDestinosActivos();
	//obetener todos los destinos
	@Query("select tp from Destino tp" )
	public List<Destino> getAllDestinos();
	
	@Query("select d from Destino d where d.idDestinationCategory = ?1")
	public List<Destino> consultByCategory(Integer idDestinationCategory);

}
