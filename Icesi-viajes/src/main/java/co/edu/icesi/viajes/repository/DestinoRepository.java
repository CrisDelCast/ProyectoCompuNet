package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Destino;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DestinoRepository extends JpaRepository<Destino, Integer> {
	//11
	@Query("select tp from Destino tp where tp.codigo = ?1 ")
	public Destino consultarDestinoPorCodigo(String codigo);
	//12
	@Query("select tp from Destino tp where tp.codigo = ?1")
	public List<Destino> consultarPorTipoDestino(String codigoTipoDestino);
	//13
	@Query("select tp from Destino tp where tp.estado = 'A'")
	public List<Destino> consultarDestinosActivos();
	//obetener todos los destinos
	@Query("select tp from Destino tp" )
	public List<Destino> getAllDestinos();
}
