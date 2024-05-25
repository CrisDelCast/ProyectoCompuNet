package co.edu.icesi.viajes.dto;

public class UsuarioResponseDTO {
    private Integer idUsua;
    private String login;
    private String nombre;
    private String rol;

    // Constructor, getters y setters

    public UsuarioResponseDTO(Integer idUsua, String login, String nombre, String rol) {
        this.idUsua = idUsua;
        this.login = login;
        this.nombre = nombre;
        this.rol = rol;
    }

	public Integer getIdUsua() {
		return idUsua;
	}

	public void setIdUsua(Integer idUsua) {
		this.idUsua = idUsua;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

    // Getters y Setters...
    
}
