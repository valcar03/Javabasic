package cl.generation.f20221027tarea;

public class DatosClienteTarea {
		//atributos
		private String nombre;
		private String apelido;
		private Integer edad;
		private String correo;
		private Integer telefono;
			
		//constructor vacio
		public DatosClienteTarea() {
			super();
		}
		
		//constructor con todo
		public DatosClienteTarea(String nombre, String apelido, Integer edad, String correo, Integer telefono) {
			super();
			this.nombre = nombre;
			this.apelido = apelido;
			this.edad = edad;
			this.correo = correo;
			this.telefono = telefono;
		}
		
		//getter y setter
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApelido() {
			return apelido;
		}

		public void setApelido(String apelido) {
			this.apelido = apelido;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public Integer getTelefono() {
			return telefono;
		}

		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		
	    //Metodo del objeto
		@Override
		public String toString() {
			return "DatosClienteTarea [nombre=" + nombre + ", apelido=" + apelido + ", edad=" + edad + ", correo="
					+ correo + ", telefono=" + telefono + "]";
		}}