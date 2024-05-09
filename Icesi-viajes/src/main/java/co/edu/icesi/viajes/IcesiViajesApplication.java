package co.edu.icesi.viajes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class IcesiViajesApplication implements CommandLineRunner, WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(IcesiViajesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Prueba conexión");
        
    }

}
