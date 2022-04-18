package ar.edu.unlam.pb2.Alumno;

public class Alumno {

	private String nombre = "", apellido = " ";
	private Integer dni = 0,legajo = 0;
	private Boolean elUsuarioEstaActivo = false;
	
	public Alumno() {
		
	}
	
	
	public Alumno(String nombre2, String apellido2, Integer dni2, Integer legajo2, Boolean elUsuarioEstaActivo2) {
	
		this.nombre = nombre2;
		this.apellido = apellido2;
		this.dni = dni2;
		this.legajo = legajo2;
		this.elUsuarioEstaActivo = elUsuarioEstaActivo2;
	}

	public Alumno crearAlumno(String nombreIngresado, String apellidoIngresado, Integer dniIngresado, Integer legajoIngresado, Boolean estadoDelAlumno) {
		
		Alumno Alu1 = new Alumno();
		Alu1.setNombre(nombreIngresado);
		Alu1.setApellido(apellidoIngresado);
		Alu1.setDni(dniIngresado);
		Alu1.setEstado(estadoDelAlumno);
		Alu1.setLegajo(legajoIngresado);
		
		return Alu1;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public void setEstado(Boolean estado) {
		this.elUsuarioEstaActivo = estado;
	}
	
	public Boolean getElUsuarioEstaActivo() {
		return elUsuarioEstaActivo;
	}

	public void setElUsuarioEstaActivo(Boolean elUsuarioEstaActivo) {
		this.elUsuarioEstaActivo = elUsuarioEstaActivo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public Integer getLegajo() {
		return legajo;
	}


	

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo=" + legajo
				+ ", elUsuarioEstaActivo=" + elUsuarioEstaActivo + "]";
	}
	
}
