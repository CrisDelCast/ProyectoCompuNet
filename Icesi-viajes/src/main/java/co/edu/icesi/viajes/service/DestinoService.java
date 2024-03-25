package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


public interface DestinoService extends GenericService<Destino,Integer>{
	public List<Destino> consultarDestinoPorCodigoEstado(String codigo);
	public List<Destino> consultarPorTipoDestino(String codigoTipoDestino);
	public List<Destino> consultarDestinosActivos();


}
