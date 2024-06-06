package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @Column(name = "id")
    private Integer idServicio;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "id_tipo_servicio", nullable = false)
    private Integer id_tipo_servicio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    // Getters y Setters

    public Integer getId() {
        return idServicio;
    }

    public void setId(Integer id) {
        this.idServicio = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipoServicio() {
        return id_tipo_servicio;
    }

    public void setIdTipoServicio(Integer id_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}