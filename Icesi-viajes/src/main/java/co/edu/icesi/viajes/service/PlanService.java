package co.edu.icesi.viajes.service;

import java.util.Date;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.PlanDTO;


public interface PlanService extends GenericService<Plan,Integer>{

	Plan crearPlan(PlanDTO planDTO);
	
	Plan obtenerPlanPorId(Integer id);
	
	
}