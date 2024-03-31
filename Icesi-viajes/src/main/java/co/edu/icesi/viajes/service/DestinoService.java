package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;

import java.util.List;

public interface DestinoService extends GenericService<Destino,Integer>{
	public List<Destino> consultarDestinoPorCodigoEstado(String codigo);
	public List<Destino> consultarPorTipoDestino(String codigoTipoDestino);
	public List<Destino> consultarDestinosActivos();
	public List<Destino> consultByCategory(Integer idDestinationCategory);


}
