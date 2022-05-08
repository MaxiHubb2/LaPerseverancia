package ar.edu.unlam.pb2.CuentasBancarias;

import java.util.ArrayList;

public class Banco extends Cuenta{
	
	private ArrayList <Cuenta> cuentas = new ArrayList<>();
	
	public Banco(String nombreBanco) {
		super(nombreBanco);
		this.cuentas = new ArrayList<>();
	}

	
	public void agregarCuenta(Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		 this.cuentas.add(cuenta1DelSueldo);
		
	}


	public Integer obtenerCantidadDeCuentas() {
		// TODO Auto-generated method stub
		return this.cuentas.size();
	}


	
	public Cuenta buscarCuentaPorId( Integer idCuenta) {

		for(int i = 0; i<cuentas.size(); i++){
			if( this.cuentas.get(i).getId().equals(idCuenta))
				return this.cuentas.get(i);
		}
		
		return null;
	}


	@Override
	public Double depositar(Banco banco1, Double montoADepositar, Integer id2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double consultarSaldo(Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double extraerYCobrarPenalidad(Banco banco1, Double montoAExtraer, Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public int getConteo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setConteo(Integer contador) {
		// TODO Auto-generated method stub
		
	}


	
	@Override
	public Double extraerDineroEnCuenta(Double montoAExtraer, Cuenta cuentaCorriente) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double extraerYAplicarDescuento(Double montoAExtraer, Cuenta cuentaCorriente1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
