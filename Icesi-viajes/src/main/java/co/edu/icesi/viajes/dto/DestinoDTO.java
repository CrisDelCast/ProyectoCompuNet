package co.edu.icesi.viajes.dto;

import java.util.Date;

public class DestinoDTO {
	

    private Integer idDest;
    private String codigo;
    private String nombre;
    private String descripcion;
    private char tierra;
    private char aire;
    private char mar;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private Integer idTide;
    private String fotoUrl;
    private Integer idDestinationCategory;
    // Constructores, getters y setters
    
    // Constructor vacío
    
    
    public Integer getIdDestinationCategory() {
		return idDestinationCategory;
	}
	public void setIdDestinationCategory(Integer idDestinationCategory) {
		this.idDestinationCategory = idDestinationCategory;
	}
	// Constructor con todos los campos
    public void DestinoDto(Integer idDest, String codigo, String nombre, String descripcion, char tierra,
                      char aire, char mar, Date fechaCreacion, Date fechaModificacion,
                      String usuCreador, String usuModificador, String estado, Integer idTide) {
        this.idDest = idDest;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tierra = tierra;
        this.aire = aire;
        this.mar = mar;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.estado = estado;
        this.idTide = idTide;
    }
    
    public DestinoDTO(String codigo, String nombre, String descripcion,  char tierra,
         char aire, char mar, String estado) {
		 this.codigo = codigo;
		 this.nombre = nombre;
		 this.descripcion = descripcion;
		 this.tierra = tierra;
	     this.aire = aire;
	     this.mar = mar;
	     this.estado = estado;
		 
   }
    
    public String getFotoUrl() {
		return fotoUrl;
	}
	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
	public DestinoDTO() {
		// TODO Auto-generated constructor stub
	}

	// Getters y setters
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
    
    public void setTierra(char c) {
        this.tierra = c;
    }
    
    public char getAire() {
		return aire;
    }
    
    public void setAire(char c) {
        this.aire = c;
    }
    
    public char getMar() {
        return mar;
    }
    
    public void setMar(char c) {
        this.mar = c;
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

    
