package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.mapstruct.factory.Mappers;

public class PlanMapper {
    
    
    private static int contadorIdPlan = 0;


	public static PlanDTO planToPlanDto(Plan plan) {
        if (plan == null) {
            return null;
        }
        
        PlanDTO planDto = new PlanDTO();
        planDto.setIdPlan(plan.getIdPlan());
        planDto.setCodigo(plan.getCodigo());
        planDto.setDescripcionSolicitud(plan.getDescripcionSolicitud());
        planDto.setNombre(plan.getNombre());
        planDto.setCantidadPersonas(plan.getCantidadPersonas());
        planDto.setFechaSolicitud(plan.getFechaSolicitud());
        planDto.setFechaInicioViaje(plan.getFechaInicioViaje());
        planDto.setFechaFinViaje(plan.getFechaFinViaje());
        planDto.setValorTotal(plan.getValorTotal());
        planDto.setFechaCreacion(plan.getFechaCreacion());
        planDto.setFechaModificacion(plan.getFechaModificacion());
        planDto.setUsuCreador(plan.getUsuCreador());
        planDto.setUsuModificador(plan.getUsuModificador());
        planDto.setEstado(plan.getEstado());
        planDto.setIdClie(plan.getIdClie());
        planDto.setIdDestinos(plan.getIdDestinos());
        
        return planDto;
    }
    
    public static Plan planDtoToPlan(PlanDTO planDto) {
        if (planDto == null) {
            return null;
        }
        Date fechaActual = new Date();
        Plan plan = new Plan();
        contadorIdPlan++;
        plan.setIdPlan(contadorIdPlan);
        plan.setCodigo(planDto.getCodigo());
        plan.setDescripcionSolicitud("");
        plan.setNombre(planDto.getNombre());
        plan.setCantidadPersonas(planDto.getCantidadPersonas());
        plan.setFechaSolicitud(fechaActual);
        plan.setFechaInicioViaje(planDto.getFechaInicioViaje());
        plan.setFechaFinViaje(planDto.getFechaFinViaje());
        plan.setValorTotal(planDto.getValorTotal());
        plan.setFechaCreacion(fechaActual);
        plan.setFechaModificacion(fechaActual);
        plan.setUsuCreador("");
        plan.setUsuModificador("");
        plan.setEstado("A");
        plan.setIdClie(1);
        plan.setIdDestinos(planDto.getIdDestinos());
        
        return plan;
    }
    
    public static List<PlanDTO> planListToPlanDtoList(List<Plan> planList) {
        List<PlanDTO> planDtoList = new ArrayList<>();
        for (Plan plan : planList) {
            planDtoList.add(planToPlanDto(plan));
        }
        return planDtoList;
    }
    
    public static List<Plan> planDtoListToPlanList(List<PlanDTO> planDtoList) {
        List<Plan> planList = new ArrayList<>();
        for (PlanDTO planDto : planDtoList) {
            planList.add(planDtoToPlan(planDto));
        }
        return planList;
    }
}
