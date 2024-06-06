package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.PlanServicio;
import co.edu.icesi.viajes.dto.PlanServicioDTO;
import co.edu.icesi.viajes.mapper.PlanServicioMapper;
import co.edu.icesi.viajes.repository.PlanServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class PlanServicioServiceImpl implements PlanServicioService {

    @Autowired
    private PlanServicioRepository planServicioRepository;

    @Override
    public List<PlanServicio> findAll() {
        return planServicioRepository.findAll();
    }

    @Override
    public Optional<PlanServicio> findById(Integer id) {
        return planServicioRepository.findById(id);
    }

    @Override
    public PlanServicio save(PlanServicio entity) throws Exception {
        validate(entity);
        return planServicioRepository.save(entity);
    }

    @Override
    public PlanServicio update(PlanServicio entity) throws Exception {
        validate(entity);
        return planServicioRepository.save(entity);
    }

    @Override
    public void delete(PlanServicio entity) throws Exception {
        planServicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        planServicioRepository.deleteById(id);
    }

    @Override
    public void validate(PlanServicio entity) throws Exception {
        if (entity.getIdPlan() == null) {
            throw new Exception("El id del plan es obligatorio");
        }
        if (entity.getIdServicio() == null) {
            throw new Exception("El id del servicio es obligatorio");
        }
    }

    @Override
    public Long count() {
        return planServicioRepository.count();
    }

    @Override
    public PlanServicioDTO createPlanServicio(PlanServicioDTO planServicioDto) throws Exception {
        PlanServicio planServicio = PlanServicioMapper.planServicioDtoToPlanServicio(planServicioDto);
        PlanServicio nuevoPlanServicio = save(planServicio);
        return PlanServicioMapper.planServicioToPlanServicioDto(nuevoPlanServicio);
    }

    @Override
    public PlanServicioDTO editPlanServicio(PlanServicioDTO planServicioDto) throws Exception {
        Optional<PlanServicio> optionalPlanServicio = findById(planServicioDto.getId());
        if (optionalPlanServicio.isPresent()) {
            PlanServicio planServicio = optionalPlanServicio.get();
            planServicio.setIdPlan(planServicioDto.getId_plan());
            planServicio.setIdServicio(planServicioDto.getIdServicio());
            PlanServicio planServicioActualizado = update(planServicio);
            return PlanServicioMapper.planServicioToPlanServicioDto(planServicioActualizado);
        } else {
            throw new Exception("PlanServicio no encontrado");
        }
    }

    @Override
    public PlanServicioDTO associatePlanWithService(Integer idPlan, Integer idServicio) throws Exception {
        PlanServicio planServicio = new PlanServicio();
        planServicio.setIdPlan(idPlan);
        planServicio.setIdServicio(idServicio);
        validate(planServicio);
        PlanServicio nuevoPlanServicio = save(planServicio);
        return PlanServicioMapper.planServicioToPlanServicioDto(nuevoPlanServicio);
    }
}
