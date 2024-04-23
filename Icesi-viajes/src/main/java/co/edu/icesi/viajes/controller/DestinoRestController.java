package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.mapper.DestinoMapper;
import co.edu.icesi.viajes.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoRestController {
    
    @Autowired
    private DestinoService destinoService;
    
    @GetMapping
    public List<DestinoDTO> getAllDestinos() {
        return DestinoMapper.destinoListToDestinoDtoList(destinoService.getAllDestinos());
    }
    
    //@GetMapping("/{id}")
    //public DestinoDTO getDestinoById(@PathVariable Integer id) {
        //return DestinoMapper.destinoToDestinoDto(destinoService.getDestinoById(id));
    //}
    
    //@PostMapping
    //public void addDestino(@RequestBody DestinoDTO destinoDto) {
        //destinoService.addDestino(DestinoMapper.destinoDtoToDestino(destinoDto));
    //}
    
    @PutMapping("/{id}")
    public void updateDestino(@PathVariable Integer id, @RequestBody DestinoDTO destinoDto) throws Exception {
        destinoDto.setIdDest(id);
        destinoService.update(DestinoMapper.destinoDtoToDestino(destinoDto));
    }
    
    //@DeleteMapping("/{id}")
    // public void deleteDestino(@PathVariable String id) {
    // Destino Dest = destinoService.consultarDestinoPorCodigoEstado(id);
     // destinoService.delete(id);
    //}
}
