package co.edu.icesi.viajes.service;


import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import co.edu.icesi.viajes.domain.Cliente;


public interface ClienteService extends GenericService<Cliente,Integer>{

	Cliente actualizarCliente(Integer id, Cliente clienteActualizado) throws Exception;

	Page<Cliente> findByEstadoOrderedAndPage(String string, PageRequest pageRequest);

	Cliente consultarClientePorCorreoElectronicoIgnoreCase(String string);

	List<Cliente> consultarPorNombre(String string);

	List<Cliente> consultarPorRangoFecha(Date date, Date date2);

	Long contarPorEstado(String string);

	List<Cliente> consultarPorTipoIdentificacion(String string, PageRequest pageRequest);

	List<Cliente> consultarPorApellido(String string);

	List<Cliente> consultarPortelefono(String string);

	List<Cliente> consultarPorNumeroIdentificacion(String string);


	
}