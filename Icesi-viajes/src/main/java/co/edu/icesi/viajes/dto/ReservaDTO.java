package co.edu.icesi.viajes.dto;

import java.util.Date;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.domain.Usuario;

public class ReservaDTO {

    private Cliente cliente;
    private Plan plan;
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroPersonas;
    private double precioTotal;
    private String estado;
    private Usuario agente;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
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
	public Usuario getAgente() {
		return agente;
	}
	public void setAgente(Usuario agente) {
		this.agente = agente;
	}
	public ReservaDTO(Cliente cliente, Plan plan, Date fechaInicio, Date fechaFin, int numeroPersonas,
			double precioTotal, String estado, Usuario agente) {
		super();
		this.cliente = cliente;
		this.plan = plan;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numeroPersonas = numeroPersonas;
		this.precioTotal = precioTotal;
		this.estado = estado;
		this.agente = agente;
	}

    // Constructor, getters y setters
    
}
