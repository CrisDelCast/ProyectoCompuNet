package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;
import co.edu.icesi.viajes.mapper.PlanMapper;
import co.edu.icesi.viajes.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    private PlanRepository planRepository;
    @Override
    public List<Plan> findAll() {
        List<Plan> lstPlan = planRepository.findAll();
        return lstPlan;
    }

    @Override
    public Optional<Plan> findById(Integer id) {
        return planRepository.findById(id);
    }

    @Override
    public Plan save(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public Plan update(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public void delete(Plan entity) throws Exception {
        planRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        planRepository.deleteById(id);
    }

    @Override
    public void validate(Plan entity) throws Exception {

    }

    @Override
    public Long count() {
        return planRepository.count();
    }
    @Override
    public Plan crearPlan(PlanDTO planDTO) {
        Plan plan = PlanMapper.planDtoToPlan(planDTO);;
        // Resto de asignaciones
        // Luego, podrías guardar el plan utilizando el repositorio
        return planRepository.save(plan);
    }
	

	

	
}
