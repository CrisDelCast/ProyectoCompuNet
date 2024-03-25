package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
@SpringBootTest
class TestTipoIdentificacion {
	
	@Autowired
    private TipoIdentificacionService tipoIdentificacionService;

	 @Test
	    void findByEstadoOrdered(){
	        List<TipoIdentificacion> lstTipoIdentificacion = tipoIdentificacionService.findByEstadoOrdered("A");

	        for(TipoIdentificacion tipoIdentificacion: lstTipoIdentificacion){
	            System.out.println(tipoIdentificacion.getCodigo() +"-"+tipoIdentificacion.getNombre());
	        }

	    }
	 @Test
	    void consultarporCodigoEstado(){
	        List<TipoIdentificacion> lstTipoIdentificacion = tipoIdentificacionService.consultarPorCodigoEstado("CC","A");

	        for(TipoIdentificacion tipoIdentificacion: lstTipoIdentificacion){
	            System.out.println(tipoIdentificacion.getCodigo() +"-"+tipoIdentificacion.getNombre());
	        }

	    }
	 
	 
}
