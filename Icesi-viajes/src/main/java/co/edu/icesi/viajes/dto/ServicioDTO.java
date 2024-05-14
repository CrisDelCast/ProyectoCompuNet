package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;

public class ServicioDTO implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ServicioDTO(Integer idServicio,String nombre,String descripcion, int precio) {
		super();
		this.idServicio = idServicio;
		this.nombre= nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		
	}
	
	private Integer idServicio;
	private String nombre;
	private String descripcion;
	private int precio;
	
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	
	}