package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.PlanServicio;
import co.edu.icesi.viajes.dto.PlanServicioDTO;
import co.edu.icesi.viajes.service.PlanServicioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planservicio")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanServicioController {

    @Autowired
    private PlanServicioServiceImpl planServicioService;

  

    @GetMapping("/extraer")
    public ResponseEntity<List<PlanServicio>> listarPlanServicios() {
        List<PlanServicio> planServicios = planServicioService.findAll();
        return ResponseEntity.ok(planServicios);
    }



    @PostMapping("/asociar")
    public ResponseEntity<?> asociarPlanConServicio(@RequestParam Integer idPlan, @RequestParam Integer idServicio) {
        try {
            PlanServicioDTO nuevoPlanServicioDTO = planServicioService.associatePlanWithService(idPlan, idServicio);
            return ResponseEntity.ok(nuevoPlanServicioDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("No se pudo asociar Plan con Servicio: " + e.getMessage());
        }
    }
}
