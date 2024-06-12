package co.edu.icesi.viajes.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;
import co.edu.icesi.viajes.service.ServicioServiceImpl;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "http://localhost:3000")
public class ServicioController {

    @Autowired
    private ServicioServiceImpl servicioService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearServicio(@RequestBody ServicioDTO servicioDTO) {
        try {
            ServicioDTO nuevoServicioDTO = servicioService.createServicio(servicioDTO);
            return ResponseEntity.ok(nuevoServicioDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Servicio no creado: " + e.getMessage());
        }
    }

    @GetMapping("/extraer")
    public ResponseEntity<List<Servicio>> listarServicios() {
        List<Servicio> servicios = servicioService.findAll();
        return ResponseEntity.ok(servicios);
    }

    @PutMapping("/editar")
    public ResponseEntity<?> editarServicio(@RequestBody ServicioDTO servicioDTO) {
        try {
            ServicioDTO servicioActualizadoDTO = servicioService.editServicio(servicioDTO);
            return ResponseEntity.ok(servicioActualizadoDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servicio no encontrado: " + e.getMessage());
        }
    }
    /**
    @GetMapping("/detalles/{id}")
    public ResponseEntity<?> obtenerDetallesServicio(@PathVariable Integer id) {
        Optional<Servicio> servicio = servicioService.findById(id);
        if (servicio.isPresent()) {
            return ResponseEntity.ok(servicio.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servicio no encontrado");
        }
    }
    **/
 
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarServicio(@PathVariable Integer id) {
        try {
            servicioService.deleteById(id);
            return ResponseEntity.ok().body("Servicio eliminado con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Servicio no encontrado: " + e.getMessage());
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Servicio> findById(@PathVariable Integer id) {
        Servicio servicio = servicioService.findById(id);
        if (servicio != null) {
            return ResponseEntity.ok(servicio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}