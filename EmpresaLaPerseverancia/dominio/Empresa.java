package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String razonSocial;
	private Integer cuit;
	private List <Personal> listaEmpleados;

	
	public Empresa(String razonSocial, Integer cuit) {
		
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.listaEmpleados = new ArrayList<>();
	}

	
	
	public void agregar(Personal pepin) {

		this.listaEmpleados.add(pepin);
	}
	
	public Integer obtenerEmpleados() {
		
		return this.listaEmpleados.size();
	}

	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public Integer getCuit() {
		return cuit;
	}


	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	
	public Double calcularSueldo(Personal empleadoIngresado, Sueldos sueldoActual) {
		double sueldoTotal = 0.0;
		
		for (Personal personal : listaEmpleados) {
			if(empleadoIngresado instanceof EmpleadoTemporal) {
			sueldoTotal = sueldoTemporario(personal.getHorasTrabajadas(), personal.getHijos(), personal.getEspose());
			}
		}
		
		return sueldoTotal;
	}

	public Integer sueldoTemporario(Integer horasTrabajadas,Integer hijos,Integer espose){
		int sueldoSubTotal = 0;
		
		sueldoSubTotal = horasTrabajadas + hijos + espose;
		
		return sueldoSubTotal;
		
	}
}
