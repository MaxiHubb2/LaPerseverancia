package ar.edu.unlam.pb2.CuentasBancarias;

public abstract class Cuenta {
	
	private Integer id;
	private Double saldoTotal;

	public Cuenta(Integer id, String nombre, Double saldoTotal) {

		this.id = id;
		this.saldoTotal = saldoTotal;
	
	}

	public Cuenta(String nombreBanco, Double saldoInicial) {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(String nombreBanco) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public Double montoATransferir( Double montoATransferir) {
		return montoATransferir+saldoTotal;
	}

	
	public Double montoARecibir(Double transferenciaRes) {
		return transferenciaRes+saldoTotal;
	}


	public abstract Double depositar(Banco banco1, Double montoADepositar, Integer id2);

	public abstract Double consultarSaldo(Cuenta cuenta1DelSueldo);

	public abstract Double extraerYCobrarPenalidad(Banco banco1, Double montoAExtraer, Cuenta cuenta1DelSueldo);

	public abstract int getConteo();

	public abstract void setConteo(Integer contador);
	
	public abstract Double extraerDineroEnCuenta(Double montoAExtraer, Cuenta cuentaCorriente);

	public abstract Double extraerYAplicarDescuento(Double montoAExtraer, Cuenta cuentaCorriente1);

	

	
	
}
