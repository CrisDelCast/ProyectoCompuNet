package co.edu.icesi.viajes.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DESTINATION_CATEGORIES")
public class DestinationCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2653961349354390596L;

	@Id
	@Column(name="id_deca", nullable = false)
    private Integer idDeca;
	
    @Column(name="code", nullable = false)
    private String code;
    
    @Column(name="name", nullable = false)
    private String name;
    
    @Column(name="creation_date", nullable = false)
    private Date creationDate;
    
    @Column(name="modification_date")
    private Date modificationDate;
    
    @Column(name="creator_user", nullable = false)
    private String creatorUser;
    
    @Column(name="modifier_user")
    private String modifierUser;
    
    @Column(name="status", nullable = false)
    private String status;

    // Setters and Getters
    
    public static long getSerialversionuid() {
    	return serialVersionUID;
    }
    
	public Integer getIdDeca() {
		return idDeca;
	}

	public void setIdDeca(Integer idDeca) {
		this.idDeca = idDeca;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getCreatorUser() {
		return creatorUser;
	}

	public void setCreatorUser(String creatorUser) {
		this.creatorUser = creatorUser;
	}

	public String getModifierUser() {
		return modifierUser;
	}

	public void setModifierUser(String modifierUser) {
		this.modifierUser = modifierUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
    
}
