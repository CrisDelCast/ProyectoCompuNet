package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.TipoServicio;
import co.edu.icesi.viajes.repository.TipoServicioRepository;

@Service
public class TipoServicioServiceImpl implements TipoServicioService {

    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    @Override
    public List<TipoServicio> findAll() {
        return tipoServicioRepository.findAll();
    }

    @Override
    public Optional<TipoServicio> findById(Integer id) {
        return tipoServicioRepository.findById(id);
    }

    @Override
    public TipoServicio save(TipoServicio entity) throws Exception {
        return tipoServicioRepository.save(entity);
    }

    @Override
    public TipoServicio update(TipoServicio entity) throws Exception {
        return tipoServicioRepository.save(entity);
    }

    @Override
    public void delete(TipoServicio entity) throws Exception {
        tipoServicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        tipoServicioRepository.deleteById(id);
    }

    @Override
    public void validate(TipoServicio entity) throws Exception {
        // Validaciones necesarias para el objeto TipoServicio
    }

    @Override
    public Long count() {
        return tipoServicioRepository.count();
    }
}