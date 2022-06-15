package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

public class EmpleadoTemporal extends Sistema implements sueldoTemporal {

	private Double sueldoTotal;	
	private Integer horasTrabajadas, espose, hijos,antiguedad;
	
	public EmpleadoTemporal(Integer horasTrabajadas, Integer espose, Integer hijos, Integer antiguedad) {
		
		this.horasTrabajadas = horasTrabajadas;
		this.espose = espose;
		this.hijos = hijos;
		this.sueldoTotal = 0.0;
		this.antiguedad = antiguedad;
	
	}


	@Override
	public Integer getHijos() {
		// TODO Auto-generated method stub
		return this.hijos;
	}

	@Override
	public Integer getEspose() {
		// TODO Auto-generated method stub
		return this.espose;
	}

	@Override
	public Integer getHorasTrabajadas() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas;
	}
	
	public Integer sueldoTemporario(Sistema empleadoIngresado){
		int sueldoSubTotal = 0;
		
		sueldoSubTotal = (int) ((empleadoIngresado.getHorasTrabajadas()*PRECIO_HORAS_TRABAJADAS_TEMPORAL) + sueldoFamiliar(empleadoIngresado));
		
		return sueldoSubTotal;
		
	}
	
	public Integer sueldoFamiliar(Sistema empleadoIngresado) {
		int sueldoSubtTotal = 0;
		
		sueldoSubtTotal = (int) ((empleadoIngresado.getHijos()*PRECIO_POR_HIJO) + (empleadoIngresado.getEspose()*PRECIO_POR_ESPOSE));
		
		return sueldoSubtTotal;
	}

	@Override
	public void setSueldoTotal(double sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
		
	}

	@Override
	public Double getSueldoTotal() {
		// TODO Auto-generated method stub
		return this.sueldoTotal;
	}



	@Override
	public void setHorasTrabajadas(int horas) {

		this.horasTrabajadas = horas;
	}



	@Override
	public void setEspose(int espose) {

		this.espose = espose;
		
	}



	@Override
	public void setHijos(int hijos) {

		this.hijos = hijos;
		
	}

	@Override
	public Integer getAntiguedad() {
		// TODO Auto-generated method stub
		return this.antiguedad;
	}

	@Override
	public void setAntiguedad(int antiguedad) {

		this.antiguedad = antiguedad;
	}

	
	
	
}
