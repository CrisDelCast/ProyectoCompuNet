package co.edu.icesi.viajes.service;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import co.edu.icesi.viajes.domain.Cliente;

public interface ClienteService extends GenericService<Cliente, Integer> {
    public Page<Cliente> findByEstadoOrderedAndPage(String estado, Pageable pageable);
    public Cliente consultarClientePorCorreoElectronicoIgnoreCase(String correoElectronico);
    public Cliente consultarPorNumeroIdentificacion(String numeroIdentificacion);
    public List<Cliente> consultarPorNombre(String nombre);
    public List<Cliente> consultarPorRangoFecha(Date fechaInicio, Date fechaFin);
    public Long contarPorEstado(String estado);
    public List<Cliente> consultarPorTipoIdentificacion(String codigo, PageRequest pageRequest);
    public List<Cliente> consultarPorApellido(String apellido);
    public List<Cliente> consultarPortelefono(String telefono1);
    public List<Cliente> obtenerTodosLosCientes();
    public Cliente actualizarCliente(Integer id, Cliente clienteActualizado) throws Exception;
    public Cliente save(Cliente entity) throws Exception;
    Page<Cliente> findByEstadoOrderedAndPage(String string, PageRequest pageRequest);
    List<Cliente> consultarPorTipoIdentificacion(String codigo, Pageable pageable);
	Cliente consultarPorId(String idClie);
    
}
