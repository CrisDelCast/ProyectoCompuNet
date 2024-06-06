package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.PlanServicio;
import co.edu.icesi.viajes.dto.PlanServicioDTO;

public interface PlanServicioService extends GenericService<PlanServicio,Integer> {

	PlanServicioDTO createPlanServicio(PlanServicioDTO planServicioDto) throws Exception;

	PlanServicioDTO editPlanServicio(PlanServicioDTO planServicioDto) throws Exception;

	PlanServicioDTO associatePlanWithService(Integer idPlan, Integer idServicio) throws Exception;


}