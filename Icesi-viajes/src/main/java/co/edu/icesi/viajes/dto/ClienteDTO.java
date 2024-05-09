package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;

public class ClienteDTO implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ClienteDTO(Integer idClie, String nombre, String telefono1, String estado) {
		super();
		this.idClie = idClie;
		this.nombre = nombre;
		this.telefono1 = telefono1;
		this.estado = estado;
	}
	public ClienteDTO(String estado, String numeroIdentificacion, Integer idTiid, String nombre ) {
		super();
		this.estado = estado;
		this.numeroIdentificacion = numeroIdentificacion;
		this.idTiid = idTiid;
		this.nombre = nombre;
	}
    public ClienteDTO(Integer idClie, String nombre, String estado, Date fechaCreacion) {
    	super();
        this.idClie = idClie;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

	
	
		private Integer idClie;
	    private String numeroIdentificacion;
	    private String primerApellido;
	    private String segundoApellido;
	    private String nombre;
	    private String telefono1;
	    private String telefono2;
	    private String correo;
	    private String sexo;
	    private Date fechaNacimiento;
	    private Date fechaCreacion;
	    private Date fechaModificacion;
	    private String usuCreador;
	    private String usuModificador;
	    private String estado;
	    private Integer idTiid;
		public Integer getIdClie() {
			return idClie;
		}
		public void setIdClie(Integer idClie) {
			this.idClie = idClie;
		}
		public String getNumeroIdentificacion() {
			return numeroIdentificacion;
		}
		public void setNumeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
		}
		public String getPrimerApellido() {
			return primerApellido;
		}
		public void setPrimerApellido(String primerApellido) {
			this.primerApellido = primerApellido;
		}
		public String getSegundoApellido() {
			return segundoApellido;
		}
		public void setSegundoApellido(String segundoApellido) {
			this.segundoApellido = segundoApellido;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono1() {
			return telefono1;
		}
		public void setTelefono1(String telefono1) {
			this.telefono1 = telefono1;
		}
		public String getTelefono2() {
			return telefono2;
		}
		public void setTelefono2(String telefono2) {
			this.telefono2 = telefono2;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
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
		public Integer getIdTiid() {
			return idTiid;
		}
		public void setIdTiid(Integer idTiid) {
			this.idTiid = idTiid;
		}
	    
	    
	    

}
