package ar.edu.info.unlp.ejercicioSimulacro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.time.LocalDate;


public class PagareTest {
	private Pagare pagareVencido;
	private Pagare pagareNoVencido;
	private Pagare pagareLimite;

	
		@BeforeEach
		public void  setUp() {
			pagareVencido= new Pagare(25.2,"asd", "sad", LocalDate.now().minusDays(30));
			pagareNoVencido= new Pagare(26.2,"dsa", "das", LocalDate.now().plusDays(30));
			pagareLimite= new Pagare(27.2,"qwe", "ewq", LocalDate.now());
		}
		
		@Test
		public void TestEstaVencido() {
				assertFalse(pagareVencido.estaVencido());
				assertTrue(pagareNoVencido.estaVencido());
				assertTrue(pagareLimite.estaVencido());
		}
}
