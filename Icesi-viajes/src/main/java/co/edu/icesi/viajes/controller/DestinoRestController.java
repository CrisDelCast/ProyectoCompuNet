package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.service.CloudinaryService;
import co.edu.icesi.viajes.service.DestinoService;
import co.edu.icesi.viajes.service.DestinoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/destinos")
@CrossOrigin(origins = "http://localhost:3000")
public class DestinoRestController {
    
    @Autowired
    private DestinoServiceImpl destinoService;
    
    @Autowired
    private CloudinaryService cloudinaryService;
    

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
    
    
    @PostMapping("/crearDestinoConFoto")
    public ResponseEntity<String> crearDestinoConFoto(@ModelAttribute DestinoDTO destinoDTO,
                                                      @RequestParam("foto") MultipartFile foto) throws Exception {
        try {
            Destino nuevoDestino = new Destino();
            nuevoDestino.setCodigo(destinoDTO.getCodigo());
            nuevoDestino.setNombre(destinoDTO.getNombre());
            nuevoDestino.setDescripcion(destinoDTO.getDescripcion());
            nuevoDestino.setTierra(destinoDTO.getTierra());
            nuevoDestino.setAire(destinoDTO.getAire());
            nuevoDestino.setMar(destinoDTO.getMar());
            nuevoDestino.setFechaCreacion(new Date()); 
            nuevoDestino.setUsuCreador("Admin");
            nuevoDestino.setEstado("A"); 
            nuevoDestino.setIdTide(destinoDTO.getIdTide());
            nuevoDestino.setIdTide(destinoDTO.getIdDestinationCategory());

            String fotoUrl = cloudinaryService.subirFoto(foto);
            nuevoDestino.setFotoUrl(fotoUrl);

            Destino destinoGuardado = destinoService.save(nuevoDestino);
            
            return ResponseEntity.ok("Destino creado con éxito: " + destinoGuardado.getIdDest());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al crear el destino: " + e.getMessage());
        }
    }


    @GetMapping("/disponible/{id}")
    public ResponseEntity<DestinoDTO> getDestino(@PathVariable Long id) {
        try {
            // Llama al servicio para obtener los detalles del destino con el ID proporcionado
            DestinoDTO destino = destinoService.getDestinoById(id);
            
            if (destino != null) {
                // Si se encontró el destino, devuelve los detalles con código de estado 200 (OK)
                return ResponseEntity.ok(destino);
            } else {
                // Si no se encontró el destino, devuelve código de estado 404 (Not Found)
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            // Si ocurre algún error durante la obtención de los detalles del destino, devuelve un error con código de estado 500 (Internal Server Error)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    //@DeleteMapping("/{id}")
    // public void deleteDestino(@PathVariable String id) {
    // Destino Dest = destinoService.consultarDestinoPorCodigoEstado(id);
     // destinoService.delete(id);
    //}
    
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDestino(@PathVariable Integer id) {
        try {
            destinoService.eliminarDestino(id);
            return ResponseEntity.ok("Destino eliminado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).body("Error al eliminar el destino: "+id + e.getMessage());
        }
    }
}
