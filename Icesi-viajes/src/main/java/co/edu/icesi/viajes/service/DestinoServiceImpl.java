package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class DestinoServiceImpl implements DestinoService{

    @Autowired
    private DestinoRepository destinoRepository;
    @Override
    public List<Destino> findAll() {
        List<Destino> lstDestino = destinoRepository.findAll();
        return lstDestino;
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
}
