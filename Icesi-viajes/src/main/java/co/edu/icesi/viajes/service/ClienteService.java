package co.edu.icesi.viajes.service;


import co.edu.icesi.viajes.domain.Cliente;


public interface ClienteService extends GenericService<Cliente,Integer>{

	Cliente actualizarCliente(Integer id, Cliente clienteActualizado) throws Exception;


	
}