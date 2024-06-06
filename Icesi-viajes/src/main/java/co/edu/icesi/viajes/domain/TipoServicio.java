package co.edu.icesi.viajes.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo_Servicio")
public class TipoServicio implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="id")
    private Integer idTipoServicio;
	
    @Column(name="nombre")
    private String nombre;
	public Integer getIdTise() {
		return idTipoServicio;
	}
	public void setIdTise(Integer idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}