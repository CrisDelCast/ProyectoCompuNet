package co.edu.icesi.viajes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.dto.ReservaDTO;
import co.edu.icesi.viajes.service.ReservaService;
import co.edu.icesi.viajes.service.ReservaServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "http://localhost:3000")
public class ReservaController {
	
	@Autowired
    private ReservaService reservaService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearReserva(@RequestBody ReservaDTO reservaRequest) {
    	
    	Reserva nuevaReserva = reservaService.crearReserva(reservaRequest);
        if (nuevaReserva !=  null) {
        	
            
            return ResponseEntity.ok(nuevaReserva);
        } else{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Reserva no creada");
        
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> obtenerReservaPorId(@PathVariable Integer id) {
        Reserva reserva = reservaService.obtenerReservaPorId(id);
        if (reserva != null) {
            return ResponseEntity.ok(reserva);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/todas")
    public ResponseEntity<List<ReservaDTO>> obtenerTodasLasReservas() {
    	  List<Reserva> reservas = reservaService.findAll();
          List<ReservaDTO> reservasDTO = new ArrayList<>();
          for (Reserva reserva : reservas) { 
              ReservaDTO reservaDTO = new ReservaDTO(reserva.getId(),reserva.getIdCliente(),reserva.getIdPlan(),reserva.getIdDestino(),reserva.getFechaInicio(),reserva.getFechaFin(),reserva.getNumeroPersonas(),reserva.getPrecioTotal(),reserva.getEstado(),reserva.getIdAgente());
              reservasDTO.add(reservaDTO);
          }
          return ResponseEntity.ok(reservasDTO);
        
    }

    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Reserva> actualizarReserva(@PathVariable Integer id, @RequestBody Reserva reserva) {
        Reserva reservaExistente = reservaService.obtenerReservaPorId(id);
        if (reservaExistente != null) {
            reserva.setId(id);
            Reserva reservaActualizada = reservaService.actualizarReserva(reserva);
            return ResponseEntity.ok(reservaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarReserva(@PathVariable Integer id) {
    	 try {
             reservaService.deleteById(id);
             
             return ResponseEntity.ok("reserva eliminado con éxito");
         } catch (Exception e) {
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                  .body("Error al eliminar la reserva: " + e.getMessage());
         }
    }
}
