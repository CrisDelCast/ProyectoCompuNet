package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository; // Debes tener un repositorio para Reserva

    @Override
    public Reserva crearReserva(Cliente cliente, Plan plan, Date fechaInicio, Date fechaFin, int numeroPersonas, double precioTotal, String estado, Usuario agente) {
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setPlan(plan);
        reserva.setFechaInicio(fechaInicio);
        reserva.setFechaFin(fechaFin);
        reserva.setNumeroPersonas(numeroPersonas);
        reserva.setPrecioTotal(precioTotal);
        reserva.setEstado(estado);
        reserva.setAgente(agente);
        return reservaRepository.save(reserva);
    }
    
    @Override
    public Reserva obtenerReservaPorId(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Integer id) {
        reservaRepository.deleteById(id);
    }
}
