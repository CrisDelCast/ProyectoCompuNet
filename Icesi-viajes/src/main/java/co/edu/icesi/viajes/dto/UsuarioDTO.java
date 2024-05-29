package co.edu.icesi.viajes.dto;

    import java.util.Date;
    import java.util.List;

    public class UsuarioDTO {
        private Integer id;
        private String login;
        private String password;
        private String nombre;
        private String identificacion;
        private Date fechaVinculacion;
        private Date fechaModificacion;
        private String usuCreador;
        private String usuModificador;
        private String estado;
        private List<Integer> roles;
        
        
        public UsuarioDTO(Integer id, String nombre, String estado, Date fechaVinculacion) {
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



		public Date getFechaVinculacion() {
			return fechaVinculacion;
		}



		public void setFechaVinculacion(Date fechaVinculacion) {
			this.fechaVinculacion = fechaVinculacion;
		}
        
    }
