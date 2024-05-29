package co.edu.icesi.viajes;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
        		  "cloud_name", "dyeftkrbq",
        		  "api_key", "875923438387418",
        		  "api_secret", "RTFzGCa7R_wUHm2LoYYTiOJije0"));
    }
}
