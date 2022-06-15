package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

public abstract class Sistema {

	public final Double PRECIO_HORAS_TRABAJADAS_TEMPORAL = 200.0;
	
	public final Double PRECIO_HORAS_TRABAJADAS_PERMANENTE = 300.0;
	
	public final Double PRECIO_HORAS_TRABAJADAS_PERMANENTE_GERENCIAL = 400.0;
	
	public final Double PRECIO_POR_HIJO = 200.0;
	
	public final Double PRECIO_POR_ESPOSE = 100.0;
	
	public final Double PRECIO_POR_ANTIGUEDAD_PERMANENTE = 100.0;
	
	public final Double PRECIO_POR_ANTIGUEDAD_PERMANENTE_GERENCIAL = 150.0;
	
	public abstract Integer getHorasTrabajadas();

	public abstract Integer getHijos();

	public abstract Integer getEspose();
		
	public abstract Integer sueldoFamiliar(Sistema personal);

	public abstract void setHorasTrabajadas(int horas);

	public abstract void setEspose(int espose);

	public abstract void setHijos(int hijos);

	public abstract void setSueldoTotal(double sueldoTotal);

	public abstract Double getSueldoTotal();

	public abstract Integer getAntiguedad();

	public abstract void setAntiguedad(int antiguedad);



	
	
} 
