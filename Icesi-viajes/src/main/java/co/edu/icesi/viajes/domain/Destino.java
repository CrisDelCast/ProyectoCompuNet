package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="destino")
public class Destino {
    @Id
    @Column(name="id_dest")
    private Integer idDest;
    @Column(name="codigo", nullable = false)
    private String codigo;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="descripcion", nullable = false)
    private String descripcion;
    @Column(name="tierra", nullable = false)
    private String tierra;
    @Column(name="aire", nullable = false)
    private String aire;
    @Column(name="mar", nullable = false)
    private String mar;
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
    @Column(name="id_tide", nullable = false)
    private Integer idTide;
    
	public Integer getIdDest() {
		return idDest;
	}
	public void setIdDest(Integer idDest) {
		this.idDest = idDest;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getTierra() {
		return tierra;
	}
	public void setTierra(String tierra) {
		this.tierra = tierra;
	}
	public String getAire() {
		return aire;
	}
	public void setAire(String aire) {
		this.aire = aire;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
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
	public Integer getIdTide() {
		return idTide;
	}
	public void setIdTide(Integer idTide) {
		this.idTide = idTide;
	}
    
    
}
