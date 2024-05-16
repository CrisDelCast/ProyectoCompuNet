package co.edu.icesi.viajes.controller;


import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientestotal")
    public ResponseEntity<List<ClienteDTO>> obtenerTodosLosClientes() {
        List<Cliente> clientes = clienteService.findAll();
        List<ClienteDTO> clientesDTO = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ClienteDTO clienteDTO = new ClienteDTO(cliente.getIdClie(), cliente.getNombre(), cliente.getEstado(), cliente.getFechaCreacion());
            clientesDTO.add(clienteDTO);
        }
        return ResponseEntity.ok(clientesDTO);
    }


    
    @PutMapping("/{idClie}")
    public ResponseEntity<ClienteDTO> actualizarCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        try {

            Cliente clienteActualizado = new Cliente();
            clienteActualizado.setIdClie(id); 
            clienteActualizado.setNombre(clienteDTO.getNombre()); 
            clienteActualizado.setEstado(clienteDTO.getEstado()); 


            Cliente clienteGuardado = clienteService.actualizarCliente(id, clienteActualizado);


            ClienteDTO clienteGuardadoDTO = new ClienteDTO(clienteGuardado.getIdClie(), clienteGuardado.getNombre(), clienteGuardado.getEstado(), clienteGuardado.getFechaCreacion());
            
            return ResponseEntity.ok(clienteGuardadoDTO);
        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}

