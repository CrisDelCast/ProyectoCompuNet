package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.ReservaDTO;

public interface ReservaService extends GenericService<Reserva,Integer> {
    Reserva crearReserva(ReservaDTO reservaDto);

    Reserva obtenerReservaPorId(Integer id);

    List<Reserva> obtenerTodasLasReservas();

    Reserva actualizarReserva(Reserva reserva);

    void eliminarReserva(Integer id);
}
