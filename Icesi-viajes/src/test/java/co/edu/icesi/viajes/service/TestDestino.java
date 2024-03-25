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
    void consultarDestinoPorCodigoEstado(){
	 
	 
	 List<Destino> LDestino = Destino.consultarDestinoPorCodigoEstado("D01");

	 	for(Destino Dstn: LDestino){
	 		System.out.println(Dstn.getCodigo() +"-"+Dstn.getNombre()+"-"+Dstn.getEstado());
	 	}
        
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
	

}
