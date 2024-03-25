package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.icesi.viajes.domain.Cliente;


public interface ClienteService extends GenericService<Cliente,Integer>{
	public Page<Cliente> findByEstadoOrderedAndPage(String estado, Pageable pageable);
	public Cliente consultarClientePorCorreoElectronicoIgnoreCase(String correoElectronico);
	public List<Cliente> consultarPorNumeroIdentificacion(String numeroIdentificacion);
	public List<Cliente> consultarPorNombre(String nombre);
	public List<Cliente> consultarPorRangoFecha(Date fechaInicio, Date fechaFin);
	public Long contarPorEstado(String estado);
	public List<Cliente> consultarPorTipoIdentificacion(String codigo, Pageable pageable);
	public List<Cliente> consultarPorApellido(String apellido);
	public List<Cliente> consultarPortelefono(String telefono1);



	
}