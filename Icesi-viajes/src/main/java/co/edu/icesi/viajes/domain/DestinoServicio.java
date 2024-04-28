package co.edu.icesi.viajes.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "destino_servicio")
public class DestinoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_dest", nullable = false)
    private Integer idDest;

    @Column(name = "id_servicio", nullable = false)
    private Integer idServicio;

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDest() {
        return idDest;
    }

    public void setIdDest(Integer idDest) {
        this.idDest = idDest;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }
}