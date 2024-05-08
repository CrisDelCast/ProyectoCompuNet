package co.edu.icesi.viajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    // Obtener todos los clientes
    @GetMapping("")
    public List<Cliente> obtenerClientes() {
        return clienteService.obtenerTodosLosCientes();
    }

    // Obtener un cliente por su ID
    @GetMapping("/{id}")
    public Cliente obtenerClientePorId(@PathVariable("id") Integer id) {
        return clienteService.obtenerClientePorId(id);
    }
}
