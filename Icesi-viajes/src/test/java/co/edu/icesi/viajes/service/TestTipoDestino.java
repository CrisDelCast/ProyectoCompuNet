package co.edu.icesi.viajes.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.repository.TipoDestinoRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class TestTipoDestino {

    @Autowired
    private TipoDestinoService tipoDestinoService;
 
    @Test
    void debeRetornarListaDeTipoDestino(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findAll();

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() +"-"+tipoDestino.getNombre());
        }

    }
    @Test
    void debeRetornarListaDeTipoDestinoByCodigo(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigo("PLAYA");

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() +"-"+tipoDestino.getNombre());
        }

    }
    @Test
    void debeRetornarListaDeTipoDestinoByCodigoAndEstado(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigoAndEstado("PLAYA","A");

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() +"-"+tipoDestino.getNombre());
        }

    }
    @Test
    void consultarporCodigoEstado(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.consultarporCodigoEstado("MAR","A");

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() +"-"+tipoDestino.getNombre());
        }

    }
    @Test
    void consultarTiposDestinoOrdenados(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.consultarTiposDestinoOrdenados();

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() +"-"+tipoDestino.getNombre());
        }

    }
    
    
    
}