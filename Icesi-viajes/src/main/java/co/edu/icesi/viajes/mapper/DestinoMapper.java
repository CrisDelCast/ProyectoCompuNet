package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;

import java.util.ArrayList;
import java.util.List;

public class DestinoMapper {
    
    public static DestinoDTO destinoToDestinoDto(Destino destino) {
        if (destino == null) {
            return null;
        }
        
        DestinoDTO destinoDto = new DestinoDTO();
        destinoDto.setIdDest(destino.getIdDest());
        destinoDto.setCodigo(destino.getCodigo());
        destinoDto.setNombre(destino.getNombre());
        destinoDto.setDescripcion(destino.getDescripcion());
        destinoDto.setTierra(destino.getTierra());
        destinoDto.setAire(destino.getAire());
        destinoDto.setMar(destino.getMar());
        destinoDto.setFechaCreacion(destino.getFechaCreacion());
        destinoDto.setFechaModificacion(destino.getFechaModificacion());
        destinoDto.setUsuCreador(destino.getUsuCreador());
        destinoDto.setUsuModificador(destino.getUsuModificador());
        destinoDto.setEstado(destino.getEstado());
        destinoDto.setIdTide(destino.getIdTide());
        
        return destinoDto;
    }
    
    public static Destino destinoDtoToDestino(DestinoDTO destinoDto) {
        if (destinoDto == null) {
            return null;
        }
        
        Destino destino = new Destino();
        destino.setIdDest(destinoDto.getIdDest());
        destino.setCodigo(destinoDto.getCodigo());
        destino.setNombre(destinoDto.getNombre());
        destino.setDescripcion(destinoDto.getDescripcion());
        destino.setTierra(destinoDto.getTierra());
        destino.setAire(destinoDto.getAire());
        destino.setMar(destinoDto.getMar());
        destino.setFechaCreacion(destinoDto.getFechaCreacion());
        destino.setFechaModificacion(destinoDto.getFechaModificacion());
        destino.setUsuCreador(destinoDto.getUsuCreador());
        destino.setUsuModificador(destinoDto.getUsuModificador());
        destino.setEstado(destinoDto.getEstado());
        destino.setIdTide(destinoDto.getIdTide());
        
        return destino;
    }
    
    public static List<DestinoDTO> destinoListToDestinoDtoList(List<Destino> destinoList) {
        List<DestinoDTO> destinoDtoList = new ArrayList<>();
        for (Destino destino : destinoList) {
            destinoDtoList.add(destinoToDestinoDto(destino));
        }
        return destinoDtoList;
    }
    
    public static List<Destino> destinoDtoListToDestinoList(List<DestinoDTO> destinoDtoList) {
        List<Destino> destinoList = new ArrayList<>();
        for (DestinoDTO destinoDto : destinoDtoList) {
            destinoList.add(destinoDtoToDestino(destinoDto));
        }
        return destinoList;
    }
}
