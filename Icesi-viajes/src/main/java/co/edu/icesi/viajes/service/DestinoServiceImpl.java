package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class DestinoServiceImpl implements DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;

    @Override
    public List<Destino> findAll() {
        return destinoRepository.findAll();
    }

    @Override
    public Optional<Destino> findById(Integer id) {
        return destinoRepository.findById(id);
    }

    @Override
    public Destino save(Destino entity) throws Exception {
        return destinoRepository.save(entity);
    }

    @Override
    public Destino update(Destino entity) throws Exception {
        return destinoRepository.save(entity);
    }

    @Override
    public void delete(Destino entity) throws Exception {
        destinoRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        destinoRepository.deleteById(id);
    }

    @Override
    public void validate(Destino entity) throws Exception {
        // Validaciones necesarias para el objeto Destino
    }

    @Override
    public Long count() {
        return destinoRepository.count();
    }

    @Override
    public Destino consultarDestinoPorCodigo(String codigo) {
        return destinoRepository.consultarDestinoPorCodigo(codigo);
    }

    @Override
    public List<Destino> consultarPorTipoDestino(String codigoTipoDestino) {
        return destinoRepository.consultarPorTipoDestino(codigoTipoDestino);
    }

    @Override
    public List<Destino> consultarDestinosActivos() {
        return destinoRepository.consultarDestinosActivos();
    }

    @Override
    public List<Destino> getAllDestinos() {
        return destinoRepository.getAllDestinos();
    }

    @Override
    public List<Destino> consultByCategory(Integer idDestinationCategory) {
        return destinoRepository.consultByCategory(idDestinationCategory);
    }

    @Override
    public Destino crearDestino(DestinoDTO destinoDTO) {
        Destino destino = DestinoMapper.destinoDtoToDestino(destinoDTO);
        return destinoRepository.save(destino);
    }
    
    public Destino editarDestino(DestinoDTO destinoDTO) throws Exception {
        Optional<Destino> optionalDestino = destinoRepository.findById(destinoDTO.getIdDest());

        if (!optionalDestino.isPresent()) {
            throw new Exception("El destino con ID " + destinoDTO.getIdDest() + " no existe.");
        }

        Destino destinoExistente = optionalDestino.get();
        Destino destinoActualizado = DestinoMapper.destinoDtoToDestino(destinoDTO);
        destinoActualizado.setIdDest(destinoExistente.getIdDest());

        return destinoRepository.save(destinoActualizado);
    }
}
