package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.dto.PlanDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.mapper.PlanMapper;
import co.edu.icesi.viajes.repository.DestinoRepository;
import jakarta.transaction.Transactional;

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
	public List<Destino> consultByCategory(Integer idDestinationCategory) {
		return destinoRepository.consultByCategory(idDestinationCategory);
	}

	@Override
	public Destino crearDestino(DestinoDTO destinoDTO) {
		Destino destino = DestinoMapper.destinoDtoToDestino(destinoDTO);
        return destinoRepository.save(destino);
		
	}
	
	   @Transactional
	    public void eliminarDestino(Integer id) throws Exception {
	        if(destinoRepository.existsById(id)) {
	            destinoRepository.deleteById(id);
	        } else {
	            throw new Exception("El destino con ID " + id + " no existe");
	        }
	    }
	   
	    @Override
	    public DestinoDTO getDestinoById(Long id) {
	        Destino destino = destinoRepository.consultarDestinoPorCodigo(id);
	        return destino != null ? convertToDTO(destino) : null;
	    }
	    
	    private DestinoDTO convertToDTO(Destino destino) {
	        DestinoDTO destinoDTO = new DestinoDTO();
	        destinoDTO.setIdDest(destino.getIdDest());
	        destinoDTO.setCodigo(destino.getCodigo());
	        destinoDTO.setNombre(destino.getNombre());
	        destinoDTO.setDescripcion(destino.getDescripcion());
	        destinoDTO.setTierra(destino.getTierra());
	        destinoDTO.setAire(destino.getAire());
	        destinoDTO.setMar(destino.getMar());
	        destinoDTO.setFechaCreacion(destino.getFechaCreacion());
	        destinoDTO.setFechaModificacion(destino.getFechaModificacion());
	        destinoDTO.setUsuCreador(destino.getUsuCreador());
	        destinoDTO.setUsuModificador(destino.getUsuModificador());
	        destinoDTO.setEstado(destino.getEstado());
	        destinoDTO.setIdTide(destino.getIdTide());
	        destinoDTO.setIdDestinationCategory(destino.getIdDestinationCategory());
	        destinoDTO.setFotoUrl(destino.getFotoUrl());
	        return destinoDTO;
	    }

	
}
