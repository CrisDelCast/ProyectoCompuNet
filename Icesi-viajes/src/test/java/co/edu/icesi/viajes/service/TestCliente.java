package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
@SpringBootTest
class TestCliente {

	@Autowired
    private ClienteService cliente;

	 @Test
	    void consultarporEstado(){
		 int pageNumber = 0; // Número de página, la primera página sería 0
	        int pageSize = 10; // Tamaño de la página

	        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
	        Page<Cliente> pageCliente = cliente.findByEstadoOrderedAndPage("I",pageRequest);

	        for(Cliente cliente: pageCliente){
	            System.out.println(cliente.getCorreo() +"-"+cliente.getNombre());
	        }

	    }
	 @Test
	    void consultarClientePorCorreoElectronicoIgnoreCase(){
		 Cliente lstCliente2 = cliente.consultarClientePorCorreoElectronicoIgnoreCase("jane.johnson@example.com");
		

	       
	            System.out.println(lstCliente2.getCorreo() +"-"+lstCliente2.getNombre());
		 
	        
	 	}
	 @Test
	    void consultarPorNumeroIdentificacion(){
		 
		 
		 Cliente lstCliente = cliente.consultarPorNumeroIdentificacion("100293");

	       
		 	
	            System.out.println(lstCliente.getCorreo() +"-"+lstCliente.getNombre());
	        
	        
	 	}
	 @Test
	    void consultarPorNombre(){
		 
		 
		 List<Cliente> lstCliente = cliente.consultarPorNombre("pedro");

	       
		 	for(Cliente cliente: lstCliente){
	            System.out.println(cliente.getNumeroIdentificacion() +"-"+cliente.getNombre());
	        }
	        
	 	}
	 @Test
	    void consultarPorRangoFecha() throws ParseException{
		 SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		 
		 
		 List<Cliente> lstCliente = cliente.consultarPorRangoFecha(formatoFecha.parse("12/03/1975"),formatoFecha.parse("23/07/2012"));

	       
		 	for(Cliente cliente: lstCliente){
	            System.out.println(cliente.getNumeroIdentificacion() +"-"+cliente.getNombre()+"//fechaa");
	        }
	        
	 	}
	 @Test
	    void contarPorEstado() throws ParseException{
		 
		 Long lstCliente = cliente.contarPorEstado("A");

		 	
	            System.out.println("clientes activos "+ lstCliente);
	        
	 	}
	 @Test
	    void consultarPorTipoIdentificacion(){
		 int pageNumber = 0; // Número de página, la primera página sería 0
	        int pageSize = 10; // Tamaño de la página

	        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
	        List<Cliente> pageCliente = cliente.consultarPorTipoIdentificacion("CC", pageRequest);

	        for(Cliente cliente: pageCliente){
	            System.out.println(cliente.getCorreo() +"-"+cliente.getNombre());
	        }

	    }
	 @Test
	    void consultarPorApellido(){
		 
		 
		 List<Cliente> lstCliente = cliente.consultarPorApellido("");

	       
		 	for(Cliente cliente: lstCliente){
	            System.out.println(cliente.getNumeroIdentificacion() +"-"+cliente.getNombre());
	        }
	        
	 	}
	 @Test
	    void consultarPortelefono(){
		 
		 List<Cliente> lstCliente = cliente.consultarPortelefono("555");

	       
		 	for(Cliente cliente: lstCliente){
		 		Integer count = lstCliente.size();
	            System.out.println(cliente.getCorreo() +"-"+cliente.getNombre()+"clientes en la misma area: "+count);
	        }
	        
	 	}

	 

}
