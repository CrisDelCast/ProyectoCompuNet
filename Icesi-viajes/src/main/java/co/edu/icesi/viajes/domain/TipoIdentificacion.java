package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="tipo_identificacion")
public class TipoIdentificacion {
    @Id
    @Column(name="id_tiid")
    private Integer idTiid;
    @Column(name="codigo", nullable = false)
    private String codigo;
    @Column(name="nombre", nullable = false)
    private String nombre;
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
	public Integer getIdTiid() {
		return idTiid;
	}
	public void setIdTiid(Integer idTiid) {
		this.idTiid = idTiid;
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
    
    
}