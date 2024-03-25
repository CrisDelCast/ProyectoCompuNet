package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="id_usua")
    private Integer idUsua;
    @Column(name="login", nullable = false)
    private String login;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="identificacion", nullable = false)
    private String identificacion;
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
}