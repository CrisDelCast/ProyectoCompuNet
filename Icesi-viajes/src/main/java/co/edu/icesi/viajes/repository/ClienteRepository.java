package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	//query numero 2	
	 @Query("select tp from Cliente tp where tp.estado = ?1 order by tp.nombre")
	    public Page<Cliente> findByEstadoOrderedAndPage(String estado, Pageable pageable);
	// 3. Consultar a un cliente por correo electrónico. Esta consulta debe ignorar las mayúsculas y minúsculas.
	 @Query("select tp from Cliente tp where tp.correo = ?1")
	    public Cliente consultarClientePorCorreoElectronicoIgnoreCase(String correo);
	 // 4 
	 @Query("select tp from Cliente tp where tp.numeroIdentificacion like %?1%")
		public List<Cliente> consultarPorNumeroIdentificacion(String numeroIdentificacion);
	 //5
	 @Query("select tp from Cliente tp where lower(tp.nombre) like lower(concat('%', ?1,'%'))")
		public List<Cliente> consultarPorNombre(String nombre);
	 //6
	 @Query("select tp from Cliente tp where tp.fechaNacimiento between ?1 and ?2")
		public List<Cliente> consultarPorRangoFecha(Date fechaInicio, Date fechaFin);
	 //8
	 @Query("select count(tp) from Cliente tp where tp.estado = ?1")
		public Long contarPorEstado(String estado);
	 //9
	 @Query("select tp from Cliente tp where tp.numeroIdentificacion = ?1")
		public List<Cliente> consultarPorTipoIdentificacion(String numeroIdentificacion, Pageable pageable);
	 //10
	 @Query("select tp from Cliente tp where tp.primerApellido = ?1 or tp.segundoApellido = ?1")
		public List<Cliente> consultarPorApellido(String apellido);
	//Consulta de valor
	 @Query("select tp from Cliente tp where SUBSTRING(tp.telefono1, 1, 3) = ?1")
		public List<Cliente> consultarPortelefono(String telefono1);
	 //consulta valor 15
	 @Query(nativeQuery = true)
		public List<ClienteDTO> consultarPortelefonoQuery(@Param("pTelefono") String telefono1 );
	 //16
	 @Query(nativeQuery = true)
		public List<ClienteDTO> consultarClientesPorFiltro(@Param("pEstado") String estado, @Param("pNumId") String numeroIdentificacion, @Param("pTipoId") Integer tipoIdentificacion, @Param("pNombre") String nombre );
	 //@Query("select tp from Cliente tp where tp.id_clie = ?1")
	   // public Cliente obtenerClientePorId(Integer id);
	    
	
}
