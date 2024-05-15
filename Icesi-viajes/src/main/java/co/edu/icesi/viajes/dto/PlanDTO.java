package co.edu.icesi.viajes.dto;

import java.util.Date;

public class PlanDTO {
    
    private Integer idPlan;
    private String codigo;
    private String descripcionSolicitud;
    private String nombre;
    private Integer cantidadPersonas;
    private Date fechaSolicitud;
    private Date fechaInicioViaje;
    private Date fechaFinViaje;
    private Double valorTotal;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private Integer idClie;
    private Integer idDestinos;
    
    // Constructor, getters y setters
    
    public PlanDTO() {
    }

    public PlanDTO(String codigo, String descripcionSolicitud, String nombre, Integer cantidadPersonas,
                   Date fechaSolicitud, Date fechaInicioViaje, Date fechaFinViaje, Double valorTotal,
                   String usuCreador, String estado, Integer idClie, Integer idDestinos) {
        this.codigo = codigo;
        this.descripcionSolicitud = descripcionSolicitud;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicioViaje = fechaInicioViaje;
        this.fechaFinViaje = fechaFinViaje;
        this.valorTotal = valorTotal;
        this.usuCreador = usuCreador;
        this.estado = estado;
        this.idClie = idClie;
        this.idDestinos = idDestinos;
    }
    public PlanDTO(String codigo, String nombre, Integer cantidadPersonas, Date fechaInicioViaje, Date fechaFinViaje, Double valorTotal,Integer idDestinos) {
		 this.codigo = codigo;
		 this.nombre = nombre;
		 this.cantidadPersonas = cantidadPersonas;
		 this.fechaInicioViaje = fechaInicioViaje;
		 this.fechaFinViaje = fechaFinViaje;
		 this.valorTotal = valorTotal;	 
		 this.idDestinos = idDestinos;
    }
    
    
    // Getters y setters para todos los atributos

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

    public Integer getIdDestinos() {
        return idDestinos;
    }

    public void setIdDestinos(Integer idDestinos) {
        this.idDestinos = idDestinos;
    }
}
