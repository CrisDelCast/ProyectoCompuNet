package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;

import java.util.List;

public interface DestinoService extends GenericService<Destino, Integer> {
    public Destino consultarDestinoPorCodigo(String codigo);
    public List<Destino> consultarPorTipoDestino(String codigoTipoDestino);
    public List<Destino> consultarDestinosActivos();
    public List<Destino> getAllDestinos();
    public List<Destino> consultByCategory(Integer idDestinationCategory);
    public Destino crearDestino(DestinoDTO destinoDTO);
    public Destino editarDestino(DestinoDTO destinoDTO) throws Exception;
}
