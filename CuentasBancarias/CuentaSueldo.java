package ar.edu.unlam.pb2.CuentasBancarias;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Integer idCuenta, String nombre, Double saldoInicial) {
		// TODO Auto-generated constructor stub
		super(idCuenta,nombre,saldoInicial);
	}

	public Double depositar(Banco bancoADepositar, Double montoADepositar, Integer idCuenta) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaEncontradaPorID =	bancoADepositar.buscarCuentaPorId(idCuenta);
		Double saldoActualizadoDeLaCuentaADepositar = cuentaEncontradaPorID.getSaldoTotal()+montoADepositar;
		cuentaEncontradaPorID.setSaldoTotal(saldoActualizadoDeLaCuentaADepositar);
		return saldoActualizadoDeLaCuentaADepositar;

	}

	@Override
	public Double consultarSaldo(Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		return cuenta1DelSueldo.getSaldoTotal();
	}

	public Double extraerYCobrarPenalidad(Banco banco1, Double montoAExtraer, Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		
		Double saldoDeLaCuentaAExtraer = cuenta1DelSueldo.getSaldoTotal()-montoAExtraer;
		cuenta1DelSueldo.setSaldoTotal(saldoDeLaCuentaAExtraer);
		return saldoDeLaCuentaAExtraer;

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
