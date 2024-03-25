package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="detalle_plan")
public class DetallePlan {
    @Id
    @Column(name="id_depl")
    private Integer idDepl;
    @Column(name="alimentacion", nullable = false)
    private String alimentacion;
    @Column(name="hospedaje", nullable = false)
    private String hospedaje;
    @Column(name="transporte", nullable = false)
    private String transporte;
    @Column(name="traslados", nullable = false)
    private String traslados;
    @Column(name="valor", nullable = false)
    private Double valor;
    @Column(name="cantidad_noches", nullable = false)
    private Integer cantidadNoches;
    @Column(name="cantidad_dias", nullable = false)
    private Integer cantidadDias;
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
    @Column(name="id_plan", nullable = false)
    private Integer idPlan;
    @Column(name="id_dest", nullable = false)
    private Integer idDest;
}