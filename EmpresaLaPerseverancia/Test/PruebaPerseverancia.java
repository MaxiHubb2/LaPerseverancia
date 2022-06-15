package ar.edu.unlam.pb2.EmpresaLaPerseverancia.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.EmpleadoGerente;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.EmpleadoPermanente;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.EmpleadoTemporal;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.Empresa;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.Sistema;
import ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio.sueldoPermanente;

public class PruebaPerseverancia {

	@Test
	public void sueldoAPagarDeUnEmpleadoTemporarioConEsposaYSinHijos(){
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 1;
		Integer hijos = 0;
		Integer horasTrabajadas = 80;
		Integer Antiguedad = 0;
		
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		Sistema pepin = new EmpleadoTemporal(horasTrabajadas,espose,hijos, Antiguedad);
		
		empresaActual.agregar(pepin);
		empresaActual.calcularSueldo(pepin);
		//	empresaActual.calcularSueldo(pepin,sueldoActual);
		
		
		Double valorEsperado = 16100.0;
		Double valorObtenido = pepin.getSueldoTotal();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void sueldoAPagarDeUnEmpleadoPermanenteConEsposaEHijosYAntiguedad() {
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 1;
		Integer hijos = 2;
		Integer antiguedad = 6;
		Integer horasTrabajadas = 80;
		
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		Sistema Juan = new EmpleadoPermanente(horasTrabajadas,espose,hijos,antiguedad);
		
		empresaActual.agregar(Juan);
		empresaActual.calcularSueldo(Juan);
		
		Double valorEsperado = 25100.0;
		Double valorObtenido = Juan.getSueldoTotal();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	
	@Test
	public void sueldoAPagarDeUnEmpleadoPermanenteSinEsposaEHijosPeroConAntiguedad() {
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 0;
		Integer hijos = 0;
		Integer antiguedad = 4;
		Integer horasTrabajadas = 160;
		
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		Sistema Juan = new EmpleadoPermanente(horasTrabajadas,espose,hijos,antiguedad);
		
		empresaActual.agregar(Juan);
		empresaActual.calcularSueldo(Juan);
		
		Double valorEsperado = 48400.0;
		Double valorObtenido = Juan.getSueldoTotal();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void sueldoAPagarDeUnGerenteConEsposaEHijosYAntiguedad() {
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 1;
		Integer hijos = 1;
		Integer antiguedad = 10;
		Integer horasTrabajadas = 160;
		
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		Sistema Melisa = new EmpleadoGerente(horasTrabajadas,espose,hijos,antiguedad);
		
		empresaActual.agregar(Melisa);
		empresaActual.calcularSueldo(Melisa);
		
		Double valorEsperado = 65800.0;
		Double valorObtenido = Melisa.getSueldoTotal();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	

	@Test
	public void sueldoDelosCuatroEmpleadosJuntos() {
		
		String razonSocial = "Marolio";
		Integer cuit = 1;
		
		Integer espose = 0;
		Integer hijos = 0;
		Integer antiguedad = 0;
		Integer horasTrabajadas = 0;
		
			
		Empresa empresaActual = new Empresa(razonSocial,cuit);
		
		Sistema pepin = new EmpleadoTemporal(horasTrabajadas, hijos, espose, antiguedad);
		pepin.setHorasTrabajadas(80);
		pepin.setEspose(1);
		pepin.setHijos(0);
		empresaActual.agregar(pepin);
		empresaActual.calcularSueldo(pepin);
		
		Sistema Juan = new EmpleadoPermanente(horasTrabajadas, hijos, espose, antiguedad);
		Juan.setHorasTrabajadas(80);
		Juan.setEspose(1);
		Juan.setHijos(2);
		Juan.setAntiguedad(6);
		empresaActual.agregar(Juan);
		empresaActual.calcularSueldo(Juan);
		
		Sistema Maria = new EmpleadoPermanente(horasTrabajadas, hijos, espose,antiguedad);
		Maria.setHorasTrabajadas(160);
		Maria.setEspose(0);
		Maria.setHijos(0);
		Maria.setAntiguedad(4);
		empresaActual.agregar(Maria);
		empresaActual.calcularSueldo(Maria);
		
		Sistema Melisa = new EmpleadoGerente(horasTrabajadas, hijos, espose, antiguedad);
		Melisa.setHorasTrabajadas(160);
		Melisa.setEspose(1);
		Melisa.setHijos(1);
		Melisa.setAntiguedad(10);
		empresaActual.agregar(Melisa);
		empresaActual.calcularSueldo(Melisa);
		
		
		Double valorEsperado = 155400.0;
		Double valorObtenido = empresaActual.obtenerMontoTotal();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	
}
