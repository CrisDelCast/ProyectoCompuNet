package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AuthController {

    private final UsuarioService usuarioService;

    @Autowired
    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/api/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
 
        boolean authenticated = usuarioService.authenticate(loginRequest.getLogin(), loginRequest.getPassword());
        if (authenticated) {
           
            String token = generateToken(loginRequest.getLogin());
            return ResponseEntity.ok(new LoginResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    private String generateToken(String login) {

        String secretKey = "clave_secreta";

        long expirationTimeMs = 864000000; 

        Date expirationDate = new Date(System.currentTimeMillis() + expirationTimeMs);

        String token = Jwts.builder()
                .setSubject(login)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();

        return token;
    }

    public static class LoginRequest {
        private String login;
        private String password;

        // Getters y setters
        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class LoginResponse {
        private String token;

        // Constructor, getters y setters
        public LoginResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
