package co.edu.icesi.viajes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.service.TipoDestinoService;

@RestController
@RequestMapping("/api/v1/tipoDestino")
public class TipoDestinoRestController {
	
	@Autowired
	private TipoDestinoService tipoDestinoService;
	
	
	@RequestMapping(value="/findByCodigo/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<?> findByCodigo(@PathVariable("codigo") String  codigo){
		List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigo(codigo);
		
		return ResponseEntity.ok().body(lstTipoDestino);
	}

}
