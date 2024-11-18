package ar.edu.info.unlp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

public class FisicaTest {
	private Fisica cliente;

	private Internacional llamada;
	private Internacional llamada2;
	private Internacional llamada3;
	
	@BeforeEach
	public void  setUp() {
		cliente= new Fisica("asd","dsa",2,"123dsa");
		
		llamada= new Internacional (5,"asd",LocalDateTime.of(2023,12,1, 8, 0),"dsa","sad");//20-2=18
		llamada2= new Internacional (4,"qwe",LocalDateTime.of(2023,12,11,7,0),"ewq","wqe");//12-1.2=10.8
		llamada3= new Internacional (3,"cxz",LocalDateTime.of(2023,11,1,1,0),"zxc","xzc");//9-0.9=8.1
		
		cliente.registrarLlamada(llamada);
		cliente.registrarLlamada(llamada2);
		cliente.registrarLlamada(llamada3);
	}
	
	@Test
	public void TestFacturarLlamadas() {
		assertEquals(28.8d,cliente.facturarLlamadas(LocalDateTime.of(2023,12,1, 0, 0), LocalDateTime.of(2023,12,30, 0, 0)));
	}
}
