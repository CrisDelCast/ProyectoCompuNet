package co.edu.icesi.viajes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.ReservaDTO;
import co.edu.icesi.viajes.service.ReservaService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "http://localhost:3000")
public class ReservaController {

    private final ReservaService reservaService;

    @Autowired
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping("/crear")
    public Reserva crearReserva(@RequestBody ReservaDTO reservaRequest) {
        Cliente cliente = reservaRequest.getCliente();
        Plan plan = reservaRequest.getPlan();
        Date fechaInicio = reservaRequest.getFechaInicio();
        Date fechaFin = reservaRequest.getFechaFin();
        int numeroPersonas = reservaRequest.getNumeroPersonas();
        double precioTotal = reservaRequest.getPrecioTotal();
        String estado = reservaRequest.getEstado();
        Usuario agente = reservaRequest.getAgente();
        return reservaService.crearReserva(cliente, plan, fechaInicio, fechaFin, numeroPersonas, precioTotal, estado, agente);
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
    public ResponseEntity<List<Reserva>> obtenerTodasLasReservas() {
        List<Reserva> reservas = reservaService.obtenerTodasLasReservas();
        return ResponseEntity.ok(reservas);
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

    @DeleteMapping("/{id}/eliminar")
    public ResponseEntity<String> eliminarReserva(@PathVariable Integer id) {
        Reserva reservaExistente = reservaService.obtenerReservaPorId(id);
        if (reservaExistente != null) {
            reservaService.eliminarReserva(id);
            return ResponseEntity.ok("Reserva eliminada exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
