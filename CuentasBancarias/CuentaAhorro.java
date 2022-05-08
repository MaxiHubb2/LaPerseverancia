package ar.edu.unlam.pb2.CuentasBancarias;


public class CuentaAhorro extends Cuenta {

	private Integer contadorDePenalidades;
	
	public CuentaAhorro(Integer id, String nombre, Double saldoTotal, Integer contadorIngresado) {
		super(id, nombre, saldoTotal);
		this.contadorDePenalidades = contadorIngresado;
		// TODO Auto-generated constructor stub
	}

	public CuentaAhorro(Integer idCuenta, String nombre, Double saldoInicial) {
		// TODO Auto-generated constructor stub
		super(idCuenta,nombre,saldoInicial);
	}

	@Override
	public Double depositar(Banco banco1, Double montoADepositar, Integer id2) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaEncontradaPorID =	banco1.buscarCuentaPorId(id2);
		Double saldoActualizadoDeLaCuentaADepositar = cuentaEncontradaPorID.getSaldoTotal()+montoADepositar;
		cuentaEncontradaPorID.setSaldoTotal(saldoActualizadoDeLaCuentaADepositar);
		return saldoActualizadoDeLaCuentaADepositar;

	}

	@Override
	public Double consultarSaldo(Cuenta cuenta1DelSueldo) {
		// TODO Auto-generated method stub
		return cuenta1DelSueldo.getSaldoTotal();
	}

	

	public Double extraerYCobrarPenalidad(Banco banco1, Double montoAExtraer, Cuenta cuentaDeAhorro) {
		// TODO Auto-generated method stub
	
		Integer contador = 0;
		Double penalidad = 6.0;
		
		Double saldoDeLaCuentaAExtraer = cuentaDeAhorro.getSaldoTotal()-montoAExtraer;
		contador = cuentaDeAhorro.getConteo() + 1;
		cuentaDeAhorro.setConteo(contador);
		cuentaDeAhorro.setSaldoTotal(saldoDeLaCuentaAExtraer);
		
		
		if(contador>5) {
				Double saldoRestado = cuentaDeAhorro.getSaldoTotal()-penalidad;
				cuentaDeAhorro.setSaldoTotal(saldoRestado);
		
		}
		return saldoDeLaCuentaAExtraer;
		
		
	}

	@Override
	public int getConteo() {
		// TODO Auto-generated method stub
		return this.contadorDePenalidades;
	}

	@Override
	public void setConteo(Integer contador) {
		// TODO Auto-generated method stub
		this.contadorDePenalidades = contador;
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
