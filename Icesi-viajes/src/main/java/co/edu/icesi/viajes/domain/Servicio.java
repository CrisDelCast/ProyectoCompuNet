package co.edu.icesi.viajes.domain;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.SqlResultSetMappings;
import jakarta.persistence.Table;


@Entity
@Table(name="Servicio")
public class Servicio implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="id_Servicio")
    private Integer idServicio;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="descripcion")
    private String descripcion; 
  
	
	
}