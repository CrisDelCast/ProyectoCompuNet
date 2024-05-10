package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;
import co.edu.icesi.viajes.mapper.PlanMapper;
import co.edu.icesi.viajes.repository.PlanRepository;
import co.edu.icesi.viajes.service.PlanService;
import co.edu.icesi.viajes.service.PlanServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planes")
public class PlanRestController {

	@Autowired
    private PlanServiceImpl planserviceImp;
	

	@PostMapping("/crear")
    public Plan crearPlan(@RequestBody PlanDTO planDTO) throws Exception {
        // Convierte PlanDTO a Plan y guarda en la base de datos
        Plan plan = PlanMapper.planDtoToPlan(planDTO);
        return planserviceImp.save(plan);
    }
    
    
}
