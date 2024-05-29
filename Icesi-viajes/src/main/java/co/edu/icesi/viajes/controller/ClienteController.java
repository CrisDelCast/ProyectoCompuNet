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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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


    
    @PutMapping("/ac{idClie}")
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
    
    @GetMapping("/{idClie}")
    public ResponseEntity<ClienteDTO> getCliente(@PathVariable String idClie) {
        Cliente cliente = clienteService.consultarPorId(idClie);

        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        ClienteDTO clienteDTO = new ClienteDTO(cliente.getIdClie(), cliente.getNombre(), cliente.getEstado(), cliente.getFechaCreacion());
        return ResponseEntity.ok(clienteDTO);
    }

    
    @PostMapping("/crearClientes")
    public ResponseEntity<String> crearCliente(@RequestBody ClienteDTO clienteDTO) {
        try {
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setNumeroIdentificacion(clienteDTO.getNumeroIdentificacion());
            nuevoCliente.setPrimerApellido(clienteDTO.getPrimerApellido());
            nuevoCliente.setSegundoApellido(clienteDTO.getSegundoApellido());
            nuevoCliente.setNombre(clienteDTO.getNombre());
            nuevoCliente.setTelefono1(clienteDTO.getTelefono1());
            nuevoCliente.setTelefono2(clienteDTO.getTelefono2());
            nuevoCliente.setCorreo(clienteDTO.getCorreo());
            nuevoCliente.setSexo(clienteDTO.getSexo());
            nuevoCliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
            nuevoCliente.setFechaCreacion(new Date()); 
            nuevoCliente.setUsuCreador("Admin");
            nuevoCliente.setEstado("A"); 
            nuevoCliente.setIdTiid(clienteDTO.getIdTiid());

            Cliente clienteGuardado = clienteService.save(nuevoCliente);
            return ResponseEntity.ok("Cliente creado con éxito: " + clienteGuardado.getIdClie());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al crear el cliente: " + e.getMessage());
        }
    }



    


}

