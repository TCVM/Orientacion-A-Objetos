package ar.edu.info.unlp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterurbanaTest {
	private Interurbana llamada;
	private Interurbana llamada2;
	private Interurbana llamada3;
	
	@BeforeEach
	public void setUp() {
		llamada= new Interurbana (5,"asd",LocalDateTime.of(2023,12,1, 8, 0),250);//17.5
		llamada2= new Interurbana (6,"cxz",LocalDateTime.of(2023,11,1,1,0),501);//23
		llamada3= new Interurbana (3,"cxz",LocalDateTime.of(2023,11,1,1,0),99);//11
	}
	@Test
	public void testCosto() {
		assertEquals(17.5d,this.llamada.costo());
		assertEquals(23d,this.llamada2.costo());
		assertEquals(11d,this.llamada3.costo());
	}
}
