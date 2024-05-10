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


	public static void main(String[] args) {
		SpringApplication.run(IcesiViajesApplication.class, args);
	}
	//Metodo Run
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Prueba conexión");
		
	}


}
