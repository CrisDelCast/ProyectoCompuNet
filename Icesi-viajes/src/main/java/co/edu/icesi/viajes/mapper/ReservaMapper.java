package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.dto.ReservaDTO;

public class ReservaMapper {

    public static ReservaDTO toDTO(Reserva reserva) {
        if (reserva == null) {
            return null;
        }

        ReservaDTO reservaDTO = new ReservaDTO();
        
        

        return reservaDTO;
    }

    public static Reserva toEntity(ReservaDTO reservaDTO) {
    	
        if (reservaDTO == null) {
        	
            return null;
        }

        Reserva reserva = new Reserva();
        reserva.setIdCliente(reservaDTO.getIdCliente());
        reserva.setIdDestino(reservaDTO.getIdDestino());
        reserva.setIdPlan(reservaDTO.getIdPlan());
        reserva.setFechaInicio(reservaDTO.getFechaInicio());
        reserva.setFechaFin(reservaDTO.getFechaFin());
        reserva.setNumeroPersonas(reservaDTO.getNumeroPersonas());
        reserva.setPrecioTotal(reservaDTO.getPrecioTotal());
        reserva.setEstado(reservaDTO.getEstado());
        reserva.setIdAgente(reservaDTO.getIdAgente());

        return reserva;
    }
}