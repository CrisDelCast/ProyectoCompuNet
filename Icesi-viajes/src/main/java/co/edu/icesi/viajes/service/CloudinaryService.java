package co.edu.icesi.viajes.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryService {

    private Cloudinary cloudinary;

    public CloudinaryService() {
        cloudinary = new Cloudinary(ObjectUtils.asMap(
      		  "cloud_name", "dyeftkrbq",
      		  "api_key", "875923438387418",
      		  "api_secret", "RTFzGCa7R_wUHm2LoYYTiOJije0"));
    }

    public String subirFoto(MultipartFile foto) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(foto.getBytes(), ObjectUtils.emptyMap());
        return (String) uploadResult.get("url");
    }

}
