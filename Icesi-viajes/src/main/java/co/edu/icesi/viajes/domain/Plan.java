package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_plan")
    private Integer idPlan;
    @Column(name="codigo", nullable = false)
    private String codigo;
    @Column(name="descripcion_solicitud", nullable = false)
    private String descripcionSolicitud;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="cantidad_personas", nullable = false)
    private Integer cantidadPersonas;
    @Column(name="fecha_solicitud", nullable = false)
    private Date fechaSolicitud;
    @Column(name="fecha_inicio_viaje")
    private Date fechaInicioViaje;
    @Column(name="fecha_fin_viaje")
    private Date fechaFinViaje;
    @Column(name="valor_total", nullable = false)
    private Double valorTotal;
    @Column(name="fecha_creacion", nullable = false)
    private Date fechaCreacion;
    @Column(name="fecha_modificacion")
    private Date fechaModificacion;
    @Column(name="usu_creador", nullable = false)
    private String usuCreador;
    @Column(name="usu_modificador")
    private String usuModificador;
    @Column(name="estado", nullable = false)
    private String estado;
    @Column(name="id_clie", nullable = false)
    private Integer idClie;
    @Column(name="id_destinos", nullable = false)
    private Integer[] id_destinos;
    //geters
	public Integer getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Integer idPlan) {
		this.idPlan = idPlan;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcionSolicitud() {
		return descripcionSolicitud;
	}
	public void setDescripcionSolicitud(String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Date getFechaInicioViaje() {
		return fechaInicioViaje;
	}
	public void setFechaInicioViaje(Date fechaInicioViaje) {
		this.fechaInicioViaje = fechaInicioViaje;
	}
	public Date getFechaFinViaje() {
		return fechaFinViaje;
	}
	public void setFechaFinViaje(Date fechaFinViaje) {
		this.fechaFinViaje = fechaFinViaje;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getUsuCreador() {
		return usuCreador;
	}
	public void setUsuCreador(String usuCreador) {
		this.usuCreador = usuCreador;
	}
	public String getUsuModificador() {
		return usuModificador;
	}
	public void setUsuModificador(String usuModificador) {
		this.usuModificador = usuModificador;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getIdClie() {
		return idClie;
	}
	public void setIdClie(Integer idClie) {
		this.idClie = idClie;
	}
	public Integer[] getIdDestinos() {
		return id_destinos;
	}
	public void setIdDestinos(Integer[] integers) {
		this.id_destinos = integers;
	}
    
    
}

