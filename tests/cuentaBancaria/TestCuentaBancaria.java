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
	
	@Test
	public void depositoDeSaldoNegativo(){
		this.cuenta.depositar(7000);
		this.cuenta.depositar(-5000);
		Assert.assertEquals(7000, this.cuenta.getSaldo(), 0.00001);		
	}
	@Test
	public void tranferenciaDeSaldo() {
		CuentaBancaria cuentaDestino = new CuentaBancaria();
		this.cuenta.depositar(3000);
		cuenta.tansferirHacia(2000,cuentaDestino);
		Assert.assertEquals(2000, cuentaDestino.getSaldo(),0.00001);	
		Assert.assertEquals(1000,this.cuenta.getSaldo(),0.00001);
	}
	
	@Test
	public void transferenciaDeTodoElSaldoDeLaCuenta(){
		CuentaBancaria cuentaDestino = new CuentaBancaria();
		this.cuenta.depositar(3000);
		cuenta.tansferirHacia(3000,cuentaDestino);
		Assert.assertEquals(3000, cuentaDestino.getSaldo(),0.00001);
	}
}
