package cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaBancaria {
	
	@Test
	public void creacionDeUnaCuentaSinSaldo(){
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		
		Assert.assertEquals(0,cuenta1.getMonto());
	}

}