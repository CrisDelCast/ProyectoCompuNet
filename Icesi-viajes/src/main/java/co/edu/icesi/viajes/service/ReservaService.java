package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;

public interface ReservaService {
    Reserva crearReserva(Cliente cliente, Plan plan, Date fechaInicio, Date fechaFin, int numeroPersonas, double precioTotal, String estado, Usuario agente);

    Reserva obtenerReservaPorId(Integer id);

    List<Reserva> obtenerTodasLasReservas();

    Reserva actualizarReserva(Reserva reserva);

    void eliminarReserva(Integer id);
}
