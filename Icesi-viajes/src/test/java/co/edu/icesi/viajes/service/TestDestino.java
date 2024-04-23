package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
@SpringBootTest
class TestDestino {
	@Autowired
    private DestinoService Destino;

	@Test
    void consultarDestinoPorCodigo(){
	 
	 
		Destino LDestino = Destino.consultarDestinoPorCodigo("D01");

	 	
	 		System.out.println(LDestino.getCodigo() +"-"+LDestino.getNombre()+"-"+LDestino.getEstado());
	 		System.out.println("correctamente");
        
 	}
	@Test
    void consultarPorTipoDestino(){
	 
	 
	 List<Destino> lstDestino = Destino.consultarPorTipoDestino("D02");

       
	 	for(Destino Dstn: lstDestino){
            System.out.println(Dstn.getCodigo() +"-"+Dstn.getNombre()+"-"+Dstn.getEstado()+"/tipo destino");
        }
        
 	}
	@Test
    void consultarDestinosActivos(){
	 
	 
	 List<Destino> lstDestino = Destino.consultarDestinosActivos();

       
	 	for(Destino Dstn: lstDestino){
            System.out.println(Dstn.getIdTide() +"-"+Dstn.getNombre());
        }
        
 	}
	@Test
    void getAllDestinos(){
	 
	 
	 List<Destino> lstDestinos = Destino.getAllDestinos();

       
	 	for(Destino Dstn: lstDestinos){
            System.out.println(Dstn.getIdTide() +"-"+Dstn.getNombre());
        }
	 	System.out.println("salio correcto");
        
 	}
	

}
