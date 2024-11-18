package ar.edu.info.unlp.ejercicioSimulacro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.time.LocalDate;

public class ChequeTest {


		private Cheque ChequeVencido;
		private Cheque ChequeNoVencido;
		private Cheque ChequeLimite;

		
			@BeforeEach
			public void  setUp() {
				ChequeVencido= new Cheque(25.2,"asd", "sad");
				ChequeNoVencido= new Cheque(26.2,"dsa", "das");
				ChequeLimite= new Cheque(27.2,"qwe", "ewq");
			}
			
			@Test
			public void TestEstaVencido() {
					assertFalse(ChequeVencido.estaVencido());
					assertTrue(ChequeNoVencido.estaVencido());
					assertTrue(ChequeLimite.estaVencido());
			}
	}

