package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query("select tp from Usuario tp where tp.idUsua = ?1")
    public Usuario consultarUsuarioPorId(Integer idUsua);
}
