package co.edu.icesi.viajes.domain;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.util.Date;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Integer id;

    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;

    @Column(name = "id_destino", nullable = false)
    private Integer idDestino;

    @Column(name = "id_plan", nullable = false)
    private Integer idPlan;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

    @Column(name = "numero_personas", nullable = false)
    private Integer numeroPersonas;

    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "id_agente", nullable = false)
    private Integer idAgente;
    
    @Transient // Esta anotación indica que este campo no se mapeará a la base de datos
    private Usuario agente;
    
    public Integer getId() {
		return id;
	}

	public Usuario getAgente() {
		return agente;
	}

	public void setAgente(Usuario agente) {
		this.agente = agente;
	}

	@ManyToOne
    @JoinColumn(name = "id_cliente", nullable = true, insertable = false, updatable = false) // Indicamos que no insertará ni actualizará esta columna directamente
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = true, insertable = false, updatable = false) // Indicamos que no insertará ni actualizará esta columna directamente
    private Plan plan;
    
    @ManyToOne
    @JoinColumn(name = "id_destino", nullable = true, insertable = false, updatable = false) // Indicamos que no insertará ni actualizará esta columna directamente
    private Destino destino;
    
    
    // Getters y Setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            this.idCliente = cliente.getIdClie(); // Establecemos el ID correspondiente
        }
    }
    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
        if (destino != null) {
            this.idDestino = destino.getIdDest(); // Establecemos el ID correspondiente
        }
    }


    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
        if (plan != null) {
            this.idPlan = plan.getIdPlan(); // Establecemos el ID correspondiente
        }
    }

	public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Integer idDestino) {
        this.idDestino = idDestino;
    }
    

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Integer idAgente) {
        this.idAgente = idAgente;
    }
}