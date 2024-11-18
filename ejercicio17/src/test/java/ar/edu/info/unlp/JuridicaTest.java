package ar.edu.info.unlp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuridicaTest {
	private Juridica cliente;
	
	private Internacional llamada;
	private Internacional llamada2;
	private Internacional llamada3;
	
	@BeforeEach
	public void  setUp() {
		cliente= new Juridica("asd","dsa",2,"ewq","123dsa");
		
		llamada= new Internacional (5,"asd",LocalDateTime.of(2023,12,1, 8, 0),"dsa","sad");//20
		llamada2= new Internacional (4,"qwe",LocalDateTime.of(2023,12,11,7,0),"ewq","wqe");//12
		llamada3= new Internacional (3,"cxz",LocalDateTime.of(2023,11,1,1,0),"zxc","xzc");//9
		
		cliente.registrarLlamada(llamada);
		cliente.registrarLlamada(llamada2);
		cliente.registrarLlamada(llamada3);
	}
	
	@Test
	public void TestFacturarLlamadas() {
		assertEquals(32d,cliente.facturarLlamadas(LocalDateTime.of(2023,12,1, 0, 0), LocalDateTime.of(2023,12,30, 0, 0)));
	}
}
