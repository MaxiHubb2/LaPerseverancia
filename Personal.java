package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

public class Personal extends Sistema {

	

	private Double sueldoTotal;
	private	Integer horasTrabajadas,espose,hijos,antiguedad,idEmpleado;

	public Personal(Integer horasTrabajadas2, Integer espose, Integer hijos2) {
	
		this.espose = espose;
		this.horasTrabajadas = horasTrabajadas2;
		this.hijos = hijos2;
		this.sueldoTotal = 0.0;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}




	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Integer getEspose() {
		return espose;
	}

	public void setEspose(Integer espose) {
		this.espose = espose;
	}

	public Integer getHijos() {
		return hijos;
	}

	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}



	@Override
	public Integer sueldoFamiliar(Sistema personal) {
		int sueldoSubtTotal = 0;
		
		sueldoSubtTotal = (int) ((personal.getHijos()*PRECIO_POR_HIJO) + (personal.getEspose()*PRECIO_POR_ESPOSE));
		
		return sueldoSubtTotal;	
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
		return this.antiguedad;
	}


	@Override
	public void setAntiguedad(int antiguedad) {

		this.antiguedad = antiguedad;
		
	}

}
