package cuentaBancaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCuentaBancaria {
	
	private CuentaBancaria cuenta;
	
	@Before
	public void crearCuentaBancaria() {
		this.cuenta=new CuentaBancaria();
	}
	
	@Test
	public void creacionDeUnaCuentaSinSaldo(){
		Assert.assertEquals(0, this.cuenta.getSaldo(),0.00001);
	}
	
	@Test
	public void depositarSaldoEnCuenta() {
		this.cuenta.depositar(2);
		Assert.assertEquals(2, this.cuenta.getSaldo(),0.00001);
	}
	
	@Test
	public void depositarSaldoEnUnaCuentaConSaldoPositivo(){
		this.cuenta.depositar(2500);
		this.cuenta.depositar(3000);
		Assert.assertEquals(5500, this.cuenta.getSaldo(), 0.00001);		
	}
	
}
