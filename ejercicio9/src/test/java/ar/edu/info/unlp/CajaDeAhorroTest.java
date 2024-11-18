package ar.edu.info.unlp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro;
	private CajaDeAhorro cuentaDestino;
	
	@BeforeEach
	public void setup() {
		cajaDeAhorro=new CajaDeAhorro();
		cuentaDestino=new CajaDeAhorro();
		cajaDeAhorro.depositar(200);
	}
	
	@Test
	public void testCajaDeAhorro() {
		assertEquals(200, cajaDeAhorro.getSaldo());
	}
	

	@Test
	public void testExtraerSinControlar() {
		this.cajaDeAhorro.extraerSinControlar(100);
		assertEquals(100d,cajaDeAhorro.getSaldo());
	}

	@Test
	public void testPuedeExtraer() {
		assertEquals(true,cajaDeAhorro.puedeExtraer(15));
		assertEquals(false,cajaDeAhorro.puedeExtraer(250));
	}
	
	@Test
	public void testExtraer() {
		assertEquals(true,cajaDeAhorro.extraer(15));
		assertEquals(false,cajaDeAhorro.extraer(250));
	}
	
	@Test
	public void testTransferirACuenta(){
		assertEquals(true,cajaDeAhorro.transferirACuenta(15,cuentaDestino));
		assertEquals(false,cajaDeAhorro.transferirACuenta(250,cuentaDestino));
	}
}
