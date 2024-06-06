package co.edu.icesi.viajes.dto;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class TipoServicioDTO implements Serializable{

	public TipoServicioDTO(Integer idTipoServicio, String nombre) {
	super();
	this.setIdTipoServicio(idTipoServicio);
	this.setNombre(nombre);
		
	}
	private Integer idTipoServicio;
	private Object nombre;
	
	public Integer getIdTipoServicio() {
		return idTipoServicio;
	}
	public void setIdTipoServicio(Integer idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	public Object getNombre() {
		return nombre;
	}

	public void setNombre(Object nombre) {
		this.nombre = nombre;
	}

	


}
