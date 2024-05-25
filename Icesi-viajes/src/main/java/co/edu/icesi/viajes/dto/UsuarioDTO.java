package co.edu.icesi.viajes.dto;


    
public class UsuarioDTO {
    private Integer id;
    private String nombre;
    private String estado;
    private String fechaVinculacion;

    // Constructor, getters y setters

    public UsuarioDTO(Integer id, String nombre, String estado, String fechaVinculacion) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaVinculacion = fechaVinculacion;
    }



    public UsuarioDTO(Integer id, String nombre, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
	}


	// Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }
}
