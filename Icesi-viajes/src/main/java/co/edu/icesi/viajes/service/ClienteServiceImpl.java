package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.Usuario;
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
    public Cliente actualizarCliente(Integer id, Cliente clienteActualizado) throws Exception {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setEstado(clienteActualizado.getEstado());
            return clienteRepository.save(cliente);
        } else {
            throw new Exception("Cliente no encontrado");
        }
    }

}
