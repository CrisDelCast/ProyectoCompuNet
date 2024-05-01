package co.edu.icesi.viajes.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "plan_servicio")
public class PlanServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_plan", nullable = false)
    private Integer idPlan;

    @Column(name = "id_servicio", nullable = false)
    private Integer idServicio;

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }
}