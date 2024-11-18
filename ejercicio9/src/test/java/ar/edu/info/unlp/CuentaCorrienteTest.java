package ar.edu.info.unlp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente;
	private CuentaCorriente cuentaDestino;
	
	@BeforeEach
	public void setup() {
		cuentaCorriente=new CuentaCorriente();
		cuentaDestino=new CuentaCorriente();
		cuentaCorriente.setDescubierto(10);
		cuentaCorriente.depositar(200);
	}
	
	@Test
	public void testCuentaCorriente() {
		assertEquals(10, cuentaCorriente.getDescubierto());
		assertEquals(200, cuentaCorriente.getSaldo());
	}
	

	@Test
	public void testExtraerSinControlar() {
		this.cuentaCorriente.extraerSinControlar(100);
		assertEquals(100d,cuentaCorriente.getSaldo());
	}

	@Test
	public void testPuedeExtraer() {
		assertEquals(true,cuentaCorriente.puedeExtraer(15));
		assertEquals(false,cuentaCorriente.puedeExtraer(250));
	}
	
	@Test
	public void testExtraer() {
		assertEquals(true,cuentaCorriente.extraer(15));
		assertEquals(false,cuentaCorriente.extraer(250));
	}
	
	@Test
	public void testTransferirACuenta(){
		assertEquals(true,cuentaCorriente.transferirACuenta(15,cuentaDestino));
		assertEquals(false,cuentaCorriente.transferirACuenta(250,cuentaDestino));
	}
}

