package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;
import co.edu.icesi.viajes.mapper.ServicioMapper;
import co.edu.icesi.viajes.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ServicioServiceImpl implements ServicioService {


    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    @Override
    public Optional<Servicio> findById(Integer idServicio) {
        return servicioRepository.findById(idServicio);
    }

    @Override
    public Servicio save(Servicio entity) throws Exception {
        validate(entity);
        return servicioRepository.save(entity);
    }

    @Override
    public Servicio update(Servicio entity) throws Exception {
        validate(entity);
        return servicioRepository.save(entity);
    }

    @Override
    public void delete(Servicio entity) throws Exception {
        servicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer idServicio) throws Exception {
        servicioRepository.deleteById(idServicio);
    }

    @Override
    public void validate(Servicio entity) throws Exception {
        // Validaciones necesarias para el objeto Servicio
        if (entity.getNombre() == null || entity.getNombre().isEmpty()) {
            throw new Exception("El nombre del servicio es obligatorio");
        }
        if (entity.getPrecio() == null || entity.getPrecio() <= 0) {
            throw new Exception("El precio del servicio debe ser mayor que cero");
        }
    }

    @Override
    public Long count() {
        return servicioRepository.count();
    }

    @Override
    public ServicioDTO createServicio(ServicioDTO servicioDto) throws Exception {
        Servicio servicio = ServicioMapper.servicioDtoToServicio(servicioDto);
        Servicio nuevoServicio = save(servicio);
        return ServicioMapper.servicioToServicioDto(nuevoServicio);
    }

    @Override
    public ServicioDTO editServicio(ServicioDTO servicioDto) throws Exception {
        Optional<Servicio> optionalServicio = findById(servicioDto.getIdServicio());
        if (optionalServicio.isPresent()) {
            Servicio servicio = optionalServicio.get();
            servicio.setNombre(servicioDto.getNombre());
            servicio.setDescripcion(servicioDto.getDescripcion());
            servicio.setPrecio((double) servicioDto.getPrecio());
            Servicio servicioActualizado = update(servicio);
            return ServicioMapper.servicioToServicioDto(servicioActualizado);
        } else {
            throw new Exception("Servicio no encontrado");
        }
    }	
   
}




