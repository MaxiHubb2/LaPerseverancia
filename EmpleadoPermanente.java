package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

public class EmpleadoPermanente extends Sistema implements sueldoPermanente{

	private Double sueldoTotal;	
	private Integer horasTrabajadas,espose,hijos,Antiguedad;
	
	public EmpleadoPermanente(Integer horasTrabajadas, Integer espose, Integer hijos, Integer antiguedad) {
		
		this.horasTrabajadas = horasTrabajadas;
		this.espose = espose;
		this.hijos = hijos;
		this.Antiguedad = antiguedad;
		this.sueldoTotal = 0.0;
	
	}
	

	@Override
	public Integer getHorasTrabajadas() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas;
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
	public void setSueldoTotal(double sueldoTotal) {

		this.sueldoTotal = sueldoTotal;
		
	}


	@Override
	public Double getSueldoTotal() {
		// TODO Auto-generated method stub
		return this.sueldoTotal;
	}



	@Override
	public Integer getAntiguedad() {
		// TODO Auto-generated method stub
		return this.Antiguedad;
	}


	@Override
	public Integer sueldoFamiliar(Sistema personal) {
		int sueldoSubtTotal = 0;
		
		sueldoSubtTotal = (int) ((personal.getHijos()*PRECIO_POR_HIJO) + (personal.getEspose()*PRECIO_POR_ESPOSE));
		
		return sueldoSubtTotal;
	}


	@Override
	public Integer sueldoPerma(Sistema empleado) {

		int sueldoSubTotal = 0;
		
		sueldoSubTotal = (int) ((empleado.getHorasTrabajadas()*PRECIO_HORAS_TRABAJADAS_PERMANENTE) + empleado.getAntiguedad()*PRECIO_POR_ANTIGUEDAD_PERMANENTE + sueldoFamiliar(empleado));
		
		return sueldoSubTotal;
		
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
	public void setAntiguedad(int antiguedad) {

		this.Antiguedad = antiguedad;
	}



}
