package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
    private RolRepository rolRepository;

	@Override
	public List<Rol> findAll() {
		 List<Rol> lstRol = rolRepository.findAll();
		return lstRol;
	}

	@Override
	public Optional<Rol> findById(Integer id) {
		return rolRepository.findById(id);	
	}

	@Override
	public Rol save(Rol entity) throws Exception {
		return rolRepository.save(entity);
		
	}

	@Override
	public Rol update(Rol entity) throws Exception {
		return rolRepository.save(entity);
	}

	@Override
	public void delete(Rol entity) throws Exception {
		rolRepository.delete(entity);
		
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		rolRepository.deleteById(id);
		
	}

	@Override
	public void validate(Rol entity) throws Exception {
		
		
	}

	@Override
	public Long count() {
		
		return rolRepository.count();
	}

	@Override
	public List<Rol> consultarRoles(String TipoROl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	    

	    public Rol crearRol(Integer idRol, String nombre) {
	        Rol rol = new Rol();
	        rol.setId(idRol);
	        rol.setNombre(nombre);


	        return rolRepository.save(rol);
	    }

	    public Rol modificarRol(Integer idRol , String nombre) throws Exception {
	        Optional<Rol> optionalRol = rolRepository.findById(idRol);
	        if (optionalRol.isPresent()) {
	            Rol rol = optionalRol.get();
	            rol.setNombre(nombre);


	            return rolRepository.save(rol);
	        } else {
	            throw new Exception("Rol no encontrado");
	        }
	    }

	    public void eliminarRol(Integer idRol) throws Exception {
	        Optional<Rol> optionalRol = rolRepository.findById(idRol);
	        if (optionalRol.isPresent()) {
	            rolRepository.delete(optionalRol.get());
	        } else {
	            throw new Exception("Rol no encontrado");
	        }
	    }

	

	

}
