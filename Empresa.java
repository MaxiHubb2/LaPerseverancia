package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Empresa {

	private String razonSocial;
	private Integer cuit;
	private TreeSet<Sistema> listaEmpleados;

	
	public Empresa(String razonSocial, Integer cuit) {
		
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.listaEmpleados = new TreeSet<>();
	}
	
	
	public void agregar(Sistema pepin) {

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

	

	public Double calcularSueldo(Sistema empleadoIngresado) {
		double sueldoTotal = 0.0;
		
		for (Sistema personal : listaEmpleados) {
			
			if(empleadoIngresado instanceof EmpleadoTemporal) {
			sueldoTotal = ((EmpleadoTemporal) empleadoIngresado).sueldoTemporario(personal);
			((EmpleadoTemporal )empleadoIngresado).setSueldoTotal(sueldoTotal);
			}
			 if(empleadoIngresado instanceof EmpleadoPermanente) {
				sueldoTotal = ((EmpleadoPermanente) empleadoIngresado).sueldoPerma(personal);
			((EmpleadoPermanente )empleadoIngresado).setSueldoTotal(sueldoTotal);
			}
			 if(empleadoIngresado instanceof EmpleadoGerente) {
				
				sueldoTotal = ((EmpleadoGerente) empleadoIngresado).sueldoGerencial(personal);
				((EmpleadoGerente )empleadoIngresado).setSueldoTotal(sueldoTotal);
				
				}
			}
		
		return sueldoTotal;
	}


	public Double obtenerMontoTotal() {

		Double sueldosTotales = 0.0;
		
		for (Sistema sistema : listaEmpleados) {
			sueldosTotales += sistema.getSueldoTotal();
		}
		
		
		return sueldosTotales;
	}
	
	
}
