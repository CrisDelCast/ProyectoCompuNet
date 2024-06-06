package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.PlanServicio;
import co.edu.icesi.viajes.dto.PlanServicioDTO;

import java.util.ArrayList;
import java.util.List;

public class PlanServicioMapper {

    private static int contadorIdPlanServicio = 0;

    public static PlanServicioDTO planServicioToPlanServicioDto(PlanServicio planServicio) {
        if (planServicio == null) {
            return null;
        }

        return new PlanServicioDTO(
            planServicio.getId(),
            planServicio.getIdPlan(),
            planServicio.getIdServicio()
        );
    }

    public static PlanServicio planServicioDtoToPlanServicio(PlanServicioDTO planServicioDto) {
        if (planServicioDto == null) {
            return null;
        }

        PlanServicio planServicio = new PlanServicio();
        contadorIdPlanServicio++;
        planServicio.setId(contadorIdPlanServicio);
        planServicio.setIdPlan(planServicioDto.getId_plan());
        planServicio.setIdServicio(planServicioDto.getIdServicio());

        return planServicio;
    }

    public static List<PlanServicioDTO> planServicioListToPlanServicioDtoList(List<PlanServicio> planServicioList) {
        List<PlanServicioDTO> planServicioDtoList = new ArrayList<>();
        for (PlanServicio planServicio : planServicioList) {
            planServicioDtoList.add(planServicioToPlanServicioDto(planServicio));
        }
        return planServicioDtoList;
    }

    public static List<PlanServicio> planServicioDtoListToPlanServicioList(List<PlanServicioDTO> planServicioDtoList) {
        List<PlanServicio> planServicioList = new ArrayList<>();
        for (PlanServicioDTO planServicioDto : planServicioDtoList) {
            planServicioList.add(planServicioDtoToPlanServicio(planServicioDto));
        }
        return planServicioList;
    }
}
