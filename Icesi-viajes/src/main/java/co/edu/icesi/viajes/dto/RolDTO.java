package co.edu.icesi.viajes.dto;

import java.util.List;

import co.edu.icesi.viajes.domain.Usuario;

public class RolDTO {

    private Integer id;
    private String nombre;
    
	public RolDTO(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
    
}
