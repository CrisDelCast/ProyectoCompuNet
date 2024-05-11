package co.edu.icesi.viajes.dto;

public class DestinoDTO {

    private Integer idDest;
    private String codigo;
    private String nombre;
    private String descripcion;
    private char tierra;
    private char aire;
    private char mar;
    private String estado;
    private Integer idTide;
    private Integer idDeca;
    private Integer idDestinationCategory;
    
    
	public DestinoDTO(Integer idDest, String codigo, String nombre, String descripcion, char tierra, char aire,
			char mar, String estado, Integer idTide, Integer idDeca, Integer idDestinationCategory) {
		super();
		this.idDest = idDest;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tierra = tierra;
		this.aire = aire;
		this.mar = mar;
		this.estado = estado;
		this.idTide = idTide;
		this.idDeca = idDeca;
		this.idDestinationCategory = idDestinationCategory;
	}



	public Integer getIdDest() {
		return idDest;
	}



	//public void setIdDest(Integer idDest) {
	//	this.idDest = idDest;
	//}



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



	public void setTierra(char tierra) {
		this.tierra = tierra;
	}



	public char getAire() {
		return aire;
	}



	public void setAire(char aire) {
		this.aire = aire;
	}



	public char getMar() {
		return mar;
	}



	public void setMar(char mar) {
		this.mar = mar;
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



	public Integer getIdDeca() {
		return idDeca;
	}



	public void setIdDeca(Integer idDeca) {
		this.idDeca = idDeca;
	}



	public Integer getIdDestinationCategory() {
		return idDestinationCategory;
	}



	public void setIdDestinationCategory(Integer idDestinationCategory) {
		this.idDestinationCategory = idDestinationCategory;
	}

    

    
    
}
    