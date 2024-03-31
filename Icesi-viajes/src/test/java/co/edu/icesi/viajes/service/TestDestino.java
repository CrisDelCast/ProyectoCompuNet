package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.repository.DestinoRepository;
@SpringBootTest
class TestDestino {

    @Autowired
    private DestinoService destinoService;

    @Autowired
    private DestinoRepository destinoRepository;
	
	@Test
    public void testSave() throws Exception {
        Destino destino = new Destino();
        destino.setAire('N');
        destino.setMar('N');
        destino.setTierra('Y');
        
        destino.setIdDest(2);
        destino.setNombre("Lago Calima");
        destino.setIdTide(2);
        destino.setIdDestinationCategoy(1);
        destino.setCodigo("LCALI");
        destino.setDescripcion("Destino acogedor");
        destino.setEstado("A");
        destino.setFechaCreacion(new Date(3/2/2024));
        destino.setFechaModificacion(new Date(3/3/2023));
        destino.setUsuCreador("JLORA");
        
        Destino savedDestino = destinoService.save(destino);
        
        // Assert that the column is null after saving
        assertNull(savedDestino.getUsuModificador());
    }
    
    public void testUpdate() throws Exception {
        // Prepare a destino to update
        Destino destino = new Destino();
        destino.setAire('N');
        destino.setMar('N');
        destino.setTierra('Y');
        destino.setNombre("Ciudad");
        destino.setIdTide(7);
        destino.setIdDestinationCategoy(1);
        destino.setCodigo("CIUDA");
        destino.setDescripcion("Una linda ciudad");
        destino.setEstado("A");
        destino.setFechaCreacion(new Date(3/2/2024));
        destino.setFechaModificacion(new Date(3/3/2023));
        destino.setUsuCreador("JLORA");
        destino.setUsuModificador("JLORA");
        destinoRepository.save(destino);
        
        destino.setNombre("Nueva Ciudad");
        Destino updatedDestino = destinoService.update(destino);
        
        // Assert that the name has been updated
        assertEquals("Nueva Ciudad", updatedDestino.getNombre());
    }
    
    /*
    @Test
    public void testDelete() throws Exception {
        // Prepare a destino to delete
        TipoDestino destino = new TipoDestino();
        destino.setNombre("Bosque");
        destino.setIdTide(1);
        destino.setCodigo("h");
        destino.setDescripcion("r");
        destino.setEstado("e");
        destino.setFechaCreacion(new Date(3/2/2024));
        destino.setFechaModificicacion(new Date(3/3/2023));
        destino.setUsuCreador("J");
        destino.setUsuModificador("J");
        tipoDestinoRepository.save(destino);
        Integer destinoId = destino.getIdTide();
        
        tipoDestinoService.delete(destino);
        
        // Assert that the detino is not found after deletion
        Optional<TipoDestino> optionalDestino = tipoDestinoRepository.findById(destinoId);
        assertFalse(optionalDestino.isPresent());
    }
    
    public void testDeleteById() throws Exception {
        // Prepare a destino to delete
        TipoDestino destino = new TipoDestino();
        destino.setNombre("Desierto");
        destino.setIdTide(3);
        destino.setCodigo("i");
        destino.setDescripcion("r");
        destino.setEstado("e");
        destino.setFechaCreacion(new Date(3/2/2024));
        destino.setFechaModificicacion(new Date(3/3/2023));
        destino.setUsuCreador("J");
        destino.setUsuModificador("J");
        Integer destinoId = destino.getIdTide();
        
        tipoDestinoService.deleteById(destinoId);
        
        // Assert that the destino is not found after deletion
        Optional<TipoDestino> optionalDestino = tipoDestinoRepository.findById(destinoId);
        assertFalse(optionalDestino.isPresent());
    }
    */
    
    @Test
    public void testCount() {        
        Long numberOfDestinos = destinoService.count();
        
        // Assert that the number of destinos returned by the service 
        // matches the actual count from the repository (implementation specific).
        // You might need to adjust this assertion based on your logic.
        assertEquals(1, numberOfDestinos);
    }

	@Test
    void consultarDestinoPorCodigoEstado(){
	 
	 
	 List<Destino> LDestino = destinoService.consultarDestinoPorCodigoEstado("D01");

	 	for(Destino Dstn: LDestino){
	 		System.out.println(Dstn.getCodigo() +"-"+Dstn.getNombre()+"-"+Dstn.getEstado());
	 	}
        
 	}
	@Test
    void consultarPorTipoDestino(){
	 
	 
	 List<Destino> lstDestino = destinoService.consultarPorTipoDestino("D02");

       
	 	for(Destino Dstn: lstDestino){
            System.out.println(Dstn.getCodigo() +"-"+Dstn.getNombre()+"-"+Dstn.getEstado()+"/tipo destino");
        }
        
 	}
	@Test
    void consultarDestinosActivos(){
	 
	 
	 List<Destino> lstDestino = destinoService.consultarDestinosActivos();

       
	 	for(Destino Dstn: lstDestino){
            System.out.println(Dstn.getIdTide() +"-"+Dstn.getNombre());
        }
        
 	}
	

}
