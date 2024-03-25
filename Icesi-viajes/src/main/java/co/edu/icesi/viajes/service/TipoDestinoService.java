package co.edu.icesi.viajes.service;

import java.util.List;

import co.edu.icesi.viajes.domain.TipoDestino;



public interface TipoDestinoService extends GenericService<TipoDestino, Integer> {
	public List<TipoDestino> findByCodigo(String codigo);
	public List<TipoDestino> findByCodigoAndEstado(String codigo,String estado);
	public List<TipoDestino> consultarporCodigoEstado(String codigo, String estado);
	public List<TipoDestino> consultarTiposDestinoOrdenados();



}
