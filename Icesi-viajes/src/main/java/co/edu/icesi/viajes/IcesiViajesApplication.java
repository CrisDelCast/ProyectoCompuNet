package co.edu.icesi.viajes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.repository.ClienteRepository;
import co.edu.icesi.viajes.repository.TipoDestinoRepository;

@SpringBootApplication
public class IcesiViajesApplication implements CommandLineRunner {
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;
	@Autowired
	private ClienteRepository clienteRepo;

	public static void main(String[] args) {
		SpringApplication.run(IcesiViajesApplication.class, args);
	}
	//Metodo Run
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Prueba conexión");
		consultarTipoDestinoPorEstado();
		consultarPortelefonoQuery();
	}

	private void consultarTipoDestinoPorEstado() {
		List<TipoDestinoDTO> lstTipoDestino = tipoDestinoRepository.consultarTipoDestinoPorEstado(Constantes.ACTIVO);
		
		for (TipoDestinoDTO tipoDestino : lstTipoDestino) {
			System.out.println("Tipo de destino - ID: "+tipoDestino.getIdTide() + "- Nombre: "+ tipoDestino);
		}
	}
	
	private void consultarPortelefonoQuery() {
		List<ClienteDTO> lstCliente = clienteRepo.consultarPortelefonoQuery("555");
		
		for (ClienteDTO cliente : lstCliente) {
			System.out.println("cliente: "+cliente.getNombre() + "- Area: cualquier pais con 555");
		}
	}
	private void consultarClientesPorFiltro() {
		List<ClienteDTO> lstCliente = clienteRepo.consultarClientesPorFiltro("A",null,null,null);
		List<ClienteDTO> lstCliente2 = clienteRepo.consultarClientesPorFiltro(null,null,null,"jese");
		
		for (ClienteDTO cliente : lstCliente) {
			System.out.println("cliente: "+cliente.getNombre() + "- Area: cualquier pais con 555");
		}
		for (ClienteDTO cliente : lstCliente2) {
			System.out.println("cliente: "+cliente.getNombre() + "- Area: cualquier pais con 555");
		}
	}

}
