package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.ReservaDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.mapper.ReservaMapper;
import co.edu.icesi.viajes.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository; // Debes tener un repositorio para Reserva

    @Override
    public Reserva crearReserva(ReservaDTO reservaDto) {
    	Reserva reserva = ReservaMapper.toEntity(reservaDto);
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

	@Override
	public List<Reserva> findAll() {
		// TODO Auto-generated method stub
		return reservaRepository.findAll();
	}

	@Override
	public Optional<Reserva> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Reserva save(Reserva entity) throws Exception {
		// TODO Auto-generated method stub
		return reservaRepository.save(entity);
	}

	@Override
	public Reserva update(Reserva entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Reserva entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		Optional<Reserva> reservaOptional = reservaRepository.findById(id);
        if (reservaOptional.isPresent()) {
            reservaRepository.deleteById(id);
        } else {
            throw new Exception("reserva no encontrado con el ID: " + id);
        }
		
	}

	@Override
	public void validate(Reserva entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
