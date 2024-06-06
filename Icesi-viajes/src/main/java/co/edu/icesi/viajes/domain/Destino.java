package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="destino")
public class Destino {
    @Id
    @Column(name="id_dest")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDest;
    @Column(name="codigo", nullable = false)
    private String codigo;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="descripcion", nullable = false)
    private String descripcion;
    @Column(name="tierra", nullable = false)
    private char tierra;
    @Column(name="aire", nullable = false)
    private char aire;
    @Column(name="mar", nullable = false)
    private char mar;
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
    @Column(name="id_tide", nullable = true)
    private Integer idTide;
    @Column(name = "id_deca", nullable = true)
    private Integer idDestinationCategory;
    
    @Column(name = "foto_url", nullable = true)
    private String fotoUrl;
    
    
    
	public Integer getIdDestinationCategory() {
		return idDestinationCategory;
	}
	public void setIdDestinationCategory(Integer idDestinationCategory) {
		this.idDestinationCategory = idDestinationCategory;
	}
	public String getFotoUrl() {
		return fotoUrl;
	}
	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
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
	public char getTierra() {
		return tierra;
	}
	public void setTierra(char tierra) {
		this.tierra = tierra;
	}
	public char getAire() {
		return aire;
	}
	public void setAire(char aire) {
		this.aire = aire;
	}
	public char getMar() {
		return mar;
	}
	public void setMar(char mar) {
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
    
	public void setIdDestinationCategoy(Integer idDestinationCategory) {
		this.idDestinationCategory = idDestinationCategory;
	}

    
    
}
