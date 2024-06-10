package co.edu.icesi.viajes.dto;

import java.util.Date;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Usuario;

public class ReservaDTO {
	
	private Integer id;
	private Integer idCliente;
	private Integer idDestino;
    private Integer idPlan;
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroPersonas;
    private double precioTotal;
    private String estado;
    private Integer idAgente;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer cliente) {
		this.idCliente = cliente;
	}
	public Integer getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Integer plan) {
		this.idPlan = plan;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getNumeroPersonas() {
		return numeroPersonas;
	}
	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Integer agente) {
		this.idAgente = agente;
	}
	public Integer getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(Integer destino) {
		this.idDestino = destino;
	}
	public ReservaDTO(Integer id,Integer idCliente, Integer idPlan,Integer idDestino, Date fechaInicio, Date fechaFin, int numeroPersonas,
			double precioTotal, String estado, Integer idAgente) {
		this.id = id;
		this.idCliente = idCliente;
		this.idPlan = idPlan;
		this.idDestino = idDestino;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numeroPersonas = numeroPersonas;
		this.precioTotal = precioTotal;
		this.estado = estado;
		this.idAgente = idAgente;
	}
	public ReservaDTO() {
		
	}

    // Constructor, getters y setters
    
}
