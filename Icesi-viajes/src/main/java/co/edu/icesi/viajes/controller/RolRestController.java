package co.edu.icesi.viajes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.service.RolService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:3000")
public class RolRestController {

	@Autowired
    private RolService rolService;

	
	@GetMapping("/extraer")
    public ResponseEntity<List<Rol>> listarRoles() {
        List<Rol> rolesDTO = rolService.findAll();
        return  ResponseEntity.ok(rolesDTO);
    }
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<Rol>> obtenerRolPorId(@PathVariable Integer id) {
        Optional<Rol> rol = rolService.findById(id);
        if (rol != null) {
            return ResponseEntity.ok(rol);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
