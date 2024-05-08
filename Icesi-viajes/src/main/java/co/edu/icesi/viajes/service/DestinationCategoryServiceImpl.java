package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.DestinationCategory;
import co.edu.icesi.viajes.repository.DestinationCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class DestinationCategoryServiceImpl implements DestinationCategoryService{

    @Autowired
    private DestinationCategoryRepository destinationCategoryRepository;
    @Override
    public List<DestinationCategory> findAll() {
        List<DestinationCategory> lstDestinationCategory = destinationCategoryRepository.findAll();
        return lstDestinationCategory;
    }
    
    //TODO
    //non implemented yet
	@Override
	public Optional<DestinationCategory> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public DestinationCategory save(DestinationCategory entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DestinationCategory update(DestinationCategory entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(DestinationCategory entity) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void validate(DestinationCategory entity) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}
	
}