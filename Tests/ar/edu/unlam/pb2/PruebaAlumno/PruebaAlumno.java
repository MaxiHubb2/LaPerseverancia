package ar.edu.unlam.pb2.PruebaAlumno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.Alumno.Alumno;

public class PruebaAlumno {

	@Test
	
	public void crearAlumno() {
		
		String nombre = "";
		String apellido = "";
		Integer dni = 0;
		Integer legajo = 0;
		Boolean elUsuarioEstaActivo = false;
		
		Alumno Alu1 = new Alumno();
		Alumno AluRes =	Alu1.crearAlumno(nombre, apellido, legajo, legajo, elUsuarioEstaActivo);
		
		assertEquals(AluRes.getNombre(), nombre);
	}
	
}
