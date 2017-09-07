package cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaBancaria {
	
	@Test
	public void creacionDeUnaCuentaSinSaldo(){
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		Assert.assertEquals(0, cuenta1.getSaldo(),0.00001);
	}
	
	@Test
	public void depositarSaldoEnCuenta() {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(2);
		Assert.assertEquals(2, cuenta.getSaldo(),0.00001);
	}
	
	@Test
	public void depositarSaldoEnUnaCuentaConSaldoPositivo(){
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.depositar(2500);
		cuenta1.depositar(3000);
		
		Assert.assertEquals(5500, cuenta1.getSaldo(), 0.00001);		
	}
	
}
