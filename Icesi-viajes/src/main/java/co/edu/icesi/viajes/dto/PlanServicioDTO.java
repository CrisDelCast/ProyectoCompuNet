package co.edu.icesi.viajes.dto;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;


public class PlanServicioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public PlanServicioDTO(Integer id,Integer id_plan,Integer idServicio) {
		super();
		this.setId(id);
		this.setId_plan(id_plan);
		this.setIdServicio(idServicio);

	}

	private Integer id;
	private Integer id_plan;
	private Integer idServicio;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_plan() {
		return id_plan;
	}

	public void setId_plan(Integer id_plan) {
		this.id_plan = id_plan;
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}






}