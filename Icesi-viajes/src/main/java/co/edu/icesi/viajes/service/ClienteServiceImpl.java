package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        List<Cliente> lstCliente = clienteRepository.findAll();
        return lstCliente;
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void delete(Cliente entity) throws Exception {
        clienteRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        clienteRepository.deleteById(id);
    }

    @Override
    public void validate(Cliente entity) throws Exception {

    }

    @Override
    public Long count() {
        return clienteRepository.count();
    }
    
	

	@Override
	public Page<Cliente> findByEstadoOrderedAndPage(String estado, Pageable pageable) {
		
		return clienteRepository.findByEstadoOrderedAndPage(estado, pageable);
	}

	@Override
	public Cliente consultarClientePorCorreoElectronicoIgnoreCase(String correoElectronico) {
		
		return clienteRepository.consultarClientePorCorreoElectronicoIgnoreCase(correoElectronico);
	}

	@Override
	public List<Cliente> consultarPorNumeroIdentificacion(String numeroIdentificacion) {
		
		return clienteRepository.consultarPorNumeroIdentificacion(numeroIdentificacion);
	}

	@Override
	public List<Cliente> consultarPorNombre(String nombre) {
		
		return clienteRepository.consultarPorNombre(nombre);
	}

	@Override
	public List<Cliente> consultarPorRangoFecha(Date fechaInicio, Date fechaFin) {
		
		return clienteRepository.consultarPorRangoFecha(fechaInicio, fechaFin);
	}

	@Override
	public Long contarPorEstado(String estado) {
		
		return clienteRepository.contarPorEstado(estado);
	}

	@Override
	public List<Cliente> consultarPorTipoIdentificacion(String codigo, Pageable pageable) {
		return clienteRepository.consultarPorTipoIdentificacion(codigo, pageable);
	}

	@Override
	public List<Cliente> consultarPorApellido(String apellido) {
		return clienteRepository.consultarPorApellido(apellido);
	}

	@Override
	public List<Cliente> consultarPortelefono(String telefono1) {
	
		return clienteRepository.consultarPortelefono(telefono1);
	}

	@Override
	public List<Cliente> obtenerTodosLosCientes() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	

	//@SuppressWarnings("deprecation")
	//@Override
	//public Cliente obtenerClientePorId(Integer id) {
		//return clienteRepository.obtenerClientePorId(id);
	//}
}
