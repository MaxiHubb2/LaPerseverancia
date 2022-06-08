package ar.edu.unlam.pb2.EmpresaLaPerseverancia.Test;

import org.junit.Test;

import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.EmpleadoTemporal;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.Empresa;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.Personal;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.Sueldos;

public class PruebaPerseverancia {

	@Test
	public void sueldoAPagarDeUnEmpleadoTemporarioConEsposaEHijos(){
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 1;
		Integer hijos = 0;
		Integer horasTrabajadas = 80;
		
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		Personal pepin = new EmpleadoTemporal(horasTrabajadas,espose,hijos);
		Sueldos sueldoActual = new Sueldos(pepin);
		 
		
		empresaActual.agregar(pepin);
		empresaActual.calcularSueldo(pepin,sueldoActual);
		
		Double valorEsperado = 
		
	}
	
}
