package co.edu.icesi.viajes.service;

import java.util.List;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;


public interface TipoIdentificacionService extends GenericService<TipoIdentificacion,Integer>{
	public List<TipoIdentificacion> findByEstadoOrdered(String estado);
	public List<TipoIdentificacion> consultarPorCodigoEstado(String codigo, String estado);
}