package Serializar;

import java.io.Serializable;

public class persona implements Serializable  {

	

	    private String nombre;// Nombre de cada objeto persona
	    private String apellidos;// Apellidos de cada objeto persona
	    private int edad;// Edad de cada objeto persona
	    private boolean casado;// Casado ( verdadero o falso (si/no)) de cada objeto persona
	    private transient  String numeroDocumentoidentidad;// DNI de cada objeto persona
		@Override
		public String toString() {
			return "persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado
					+ ", numeroDocumentoidentidad=" + numeroDocumentoidentidad + "]";
		}
		public persona(String nombre, String apellidos, int edad, boolean casado, String numeroDocumentoidentidad) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
			this.casado = casado;
			this.numeroDocumentoidentidad = numeroDocumentoidentidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public boolean isCasado() {
			return casado;
		}
		public void setCasado(boolean casado) {
			this.casado = casado;
		}
		public String getNumeroDocumentoidentidad() {
			return numeroDocumentoidentidad;
		}
		public void setNumeroDocumentoidentidad(String numeroDocumentoidentidad) {
			this.numeroDocumentoidentidad = numeroDocumentoidentidad;
		}

	    
	}
	
	

