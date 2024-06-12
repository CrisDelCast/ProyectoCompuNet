package co.edu.icesi.viajes.dto;

    import java.util.Date;
    import java.util.List;

    public class UsuarioDTO {
        private Integer id;
        private String login;
        private String password;
        private String nombre;
        private String identificacion;
        private Date fechaModificacion;
        private Date fechaCreacion;
        private String usuCreador;
        private String usuModificador;
        private String estado;
        private List<Integer> roles;
        private List<String> rolesStr;
        
        
        public UsuarioDTO(Integer id, String nombre, String estado, Date fechaModificacion) {
            this.id = id;
            this.nombre = nombre;
            this.estado = estado;
            this.fechaModificacion = fechaModificacion;
        }        


		public UsuarioDTO(Integer id, String login,String password, String nombre, String identificacion, String estado,
				List<String> rolesStr) {
			super();
			this.id = id;
			this.login = login;
			this.password = password;
			this.nombre = nombre;
			this.identificacion = identificacion;
			this.estado = estado;
			this.rolesStr = rolesStr;
		}



		public UsuarioDTO(Integer id, String nombre, String estado) {
    		super();
    		this.id = id;
    		this.nombre = nombre;
    		this.estado = estado;
    	}
        
        public UsuarioDTO() {}
        

        // Getters and setters


        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }


        public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }

        public String getUsuCreador() {
            return usuCreador;
        }

        public void setUsuCreador(String usuCreador) {
            this.usuCreador = usuCreador;
        }

        public String getUsuModificador() {
            return usuModificador;
        }

        public void setUsuModificador(String usuModificador) {
            this.usuModificador = usuModificador;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public List<Integer> getRoles() {
            return roles;
        }

        public void setRoles(List<Integer> roles) {
            this.roles = roles;
        }



		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}




		public List<String> getRolesStr() {
			return rolesStr;
		}


		public void setRolesStr(List<String> rolesStr) {
			this.rolesStr = rolesStr;
		}


		public Date getFechaCreacion() {
			return fechaCreacion;
		}


		public void setFechaCreacion(Date fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}
        
		
		
    }
