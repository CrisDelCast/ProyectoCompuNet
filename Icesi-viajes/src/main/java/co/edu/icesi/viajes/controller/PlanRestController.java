package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;
import co.edu.icesi.viajes.mapper.PlanMapper;
import co.edu.icesi.viajes.repository.PlanRepository;
import co.edu.icesi.viajes.service.PlanService;
import co.edu.icesi.viajes.service.PlanServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/planes")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanRestController {

	@Autowired
    private PlanServiceImpl planservice;
	
	@PostMapping("/crear")
	   public ResponseEntity<?> crearPlan(@RequestBody PlanDTO planDTO) {
		Plan nuevoPlan = planservice.crearPlan(planDTO);
	        if (nuevoPlan !=  null) {
	            
	            return ResponseEntity.ok(nuevoPlan);
	        } else{
	            return ResponseEntity.status(HttpStatus.CONFLICT).body("plan no creado");
	        }
	   }
	@GetMapping("/extraer")
    public ResponseEntity<List<Plan>> listarPlanes() {
        List<Plan> planesDTO = planservice.findAll();
        return  ResponseEntity.ok(planesDTO);
    }
    
}
