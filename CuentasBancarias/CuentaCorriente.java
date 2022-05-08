package ar.edu.unlam.pb2.CuentasBancarias;

public class CuentaCorriente extends Cuenta {

	private Double DESCUBIERTO_APLICADO = 0.05;
	
	
	public CuentaCorriente(Integer idCuenta, String nombre, Double saldoInicial) {
		// TODO Auto-generated constructor stub
		super(nombre,saldoInicial);
		
	}
	
		@Override
	public Double depositar(Banco banco1, Double montoADepositar, Integer id2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double consultarSaldo(Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		return getSaldoTotal();
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
		
			if (cuentaCorriente.getSaldoTotal() < montoAExtraer) {
				Double saldoPrestado = montoAExtraer - cuentaCorriente.getSaldoTotal();

				cuentaCorriente.setSaldoTotal(montoAExtraer + saldoPrestado);
			}

			return cuentaCorriente.getSaldoTotal();
	
	}

	@Override
	public Double extraerYAplicarDescuento(Double montoAExtraer, Cuenta cuentaCorriente1) {
		// TODO Auto-generated method stub
		Double saldoAPrestar = 0.0;
		
		if(cuentaCorriente1.getSaldoTotal()<montoAExtraer) {
			
			saldoAPrestar = montoAExtraer-cuentaCorriente1.getSaldoTotal();
			cuentaCorriente1.setSaldoTotal(saldoAPrestar - cuentaCorriente1.getSaldoTotal()-(saldoAPrestar* DESCUBIERTO_APLICADO));
			
		}
		return saldoAPrestar + (montoAExtraer*DESCUBIERTO_APLICADO);
	}

	
	

	

}
