package co.edu.icesi.viajes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.icesi.viajes.domain.TipoServicio;
import co.edu.icesi.viajes.service.TipoServicioServiceImpl;

@RestController
@RequestMapping("/api/tiposservicio")
@CrossOrigin(origins = "http://localhost:3000")
public class TipoServicioController {

    @Autowired
    private TipoServicioServiceImpl tipoServicioService;

    @GetMapping("/disponibles")
    public ResponseEntity<List<TipoServicio>> listarTiposServicios() {
        List<TipoServicio> tiposServicios = tipoServicioService.findAll();
        return ResponseEntity.ok(tiposServicios);
    }
}
