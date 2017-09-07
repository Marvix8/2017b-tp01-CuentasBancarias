package cuentaBancaria;

public class CuentaBancaria {
	
	private double saldo = 0;

	public double getSaldo(){

		return this.saldo;
	}

	public void depositar(final double nuevoSaldo) {
		
		if(nuevoSaldo >0)
			this.saldo+= nuevoSaldo;
	}	
	
	public void tansferirHacia(final double monto, CuentaBancaria destino) {
		destino.saldo=monto;
	}
}
