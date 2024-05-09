package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.login = :login")
    Usuario findByLogin(@Param("login") String login);
    
    @Modifying
    @Query("UPDATE Usuario u SET u.nombre = :nombre, u.estado = :estado WHERE u.idUsua = :id")
    void updateUsuario(@Param("id") Integer id, @Param("nombre") String nombre, @Param("estado") String estado);
}