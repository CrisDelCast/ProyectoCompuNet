package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;

import java.util.ArrayList;
import java.util.List;

public class ServicioMapper {
    
    private static int contadorIdServicio = 0;

    public static ServicioDTO servicioToServicioDto(Servicio servicio) {
        if (servicio == null) {
            return null;
        }

        return new ServicioDTO(
            servicio.getId(),
            servicio.getNombre(),
            servicio.getDescripcion(),
            servicio.getPrecio().intValue() // Asumiendo que el precio en Servicio es Double y en ServicioDTO es int
        );
    }

    public static Servicio servicioDtoToServicio(ServicioDTO servicioDto) {
        if (servicioDto == null) {
            return null;
        }

        Servicio servicio = new Servicio();
        contadorIdServicio++;
        servicio.setId(contadorIdServicio);
        servicio.setNombre(servicioDto.getNombre());
        servicio.setIdTipoServicio(1); // Asumiendo un valor por defecto, ya que no está en ServicioDTO
        servicio.setDescripcion(servicioDto.getDescripcion());
        servicio.setPrecio((double) servicioDto.getPrecio());

        return servicio;
    }

    public static List<ServicioDTO> servicioListToServicioDtoList(List<Servicio> servicioList) {
        List<ServicioDTO> servicioDtoList = new ArrayList<>();
        for (Servicio servicio : servicioList) {
            servicioDtoList.add(servicioToServicioDto(servicio));
        }
        return servicioDtoList;
    }

    public static List<Servicio> servicioDtoListToServicioList(List<ServicioDTO> servicioDtoList) {
        List<Servicio> servicioList = new ArrayList<>();
        for (ServicioDTO servicioDto : servicioDtoList) {
            servicioList.add(servicioDtoToServicio(servicioDto));
        }
        return servicioList;
    }
}
