package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.service.DestinoService;
import co.edu.icesi.viajes.service.DestinoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinos")
@CrossOrigin(origins = "http://localhost:3000")
public class DestinoRestController {
    
    @Autowired
    private DestinoServiceImpl destinoService;
    
    
    

    @GetMapping("/disponibles")
    public List<Destino> getDestinosDisponibles() {
        return destinoService.findAll();
    }

    
    //@GetMapping("/{id}")
    //public DestinoDTO getDestinoById(@PathVariable Integer id) {
        //return DestinoMapper.destinoToDestinoDto(destinoService.getDestinoById(id));
    //}
    
    @PostMapping("/crear")
    public ResponseEntity<?> addDestino(@RequestBody DestinoDTO destinoDto) {
    	Destino nuevoDestino = destinoService.crearDestino(destinoDto);
        if (nuevoDestino !=  null) {
            
            return ResponseEntity.ok(nuevoDestino);
        } else{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Destino no creado");
        
        }
    }
    
    @PutMapping("/{id}")
    public void updateDestino(@PathVariable Integer id, @RequestBody DestinoDTO destinoDto) throws Exception {
        destinoDto.setIdDest(id);
        destinoService.update(DestinoMapper.destinoDtoToDestino(destinoDto));
    }
    
    @GetMapping("/{id}")
    public void getDestino(@PathVariable String id, @RequestBody DestinoDTO destinoDto) throws Exception {
        Destino destino = destinoService.consultarDestinoPorCodigo(id);
        //Destino destinoDto = new DestinoDTO()
        
        //return ResponseEntity.ok(destino);
        //destinoService.update(DestinoMapper.destinoDtoToDestino(destinoDto));
    }
    
    //@DeleteMapping("/{id}")
    // public void deleteDestino(@PathVariable String id) {
    // Destino Dest = destinoService.consultarDestinoPorCodigoEstado(id);
     // destinoService.delete(id);
    //}
}
