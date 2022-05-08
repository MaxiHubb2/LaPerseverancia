package ar.edu.unlam.pb2.Aula;

import java.util.ArrayList;

import ar.edu.unlam.pb2.Alumno.Alumno;

public class Aula {

	private ArrayList<Alumno> alumnos;
	private Alumno arrayDeAlumnos[] = new Alumno[3];
	
	public Aula() {
		
		this.alumnos = new ArrayList<>(); 
	}
	
	
	public void agregarAlumnoAlAula(Alumno alumnoIngresado) {

		this.alumnos.add(alumnoIngresado);
		
	}

	public Integer obtenerCantidadDeAlumnos() {
		
		return this.alumnos.size();
	}


	public void quitarAlumnoDelAula(Alumno alumnoUno) {

			alumnos.remove(alumnoUno);
 
		}


	public Boolean estaLlena() {
		
		for (int i = 0; i < arrayDeAlumnos.length; i++) {
			if(arrayDeAlumnos.length>= 3) {
				return true;
			}
		}
		return false;
	}
		
		
		
//		for (Alumno alumno : alumnos) {
//			if(alumno.getElUsuarioEstaActivo() == false) {
//				alumnos.remove(alumnoUno);
//			}
//			
//		}
		
		
	}


