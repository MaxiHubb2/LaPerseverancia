package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

public class Personal {

	Integer horasTrabajadas,espose,hijos;

	public Personal(Integer horasTrabajadas2, Integer espose, Integer hijos2) {
	
		this.espose = espose;
		this.horasTrabajadas = horasTrabajadas2;
		this.hijos = hijos2;
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

}
