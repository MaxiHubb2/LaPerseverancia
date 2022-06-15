package ar.edu.unlam.pb2.EmpresaLaPerseverancia.dominio;

import java.util.Comparator;

public class OrdenarPorHorasTrabajadas implements Comparator<Personal>{

	@Override
	public int compare(Personal o1, Personal o2) {

		if(o1.getHorasTrabajadas().compareTo(o2.getHorasTrabajadas())==0) {
			return o1.getIdEmpleado().compareTo(o2.getIdEmpleado());
		}
		
		return o1.getHorasTrabajadas().compareTo(o2.getHorasTrabajadas());
	}

}
