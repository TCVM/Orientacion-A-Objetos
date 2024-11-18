package ar.edu.info.unlp;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternacionalTest {
	private Internacional llamada;
	//private Internacional llamada2;
	private Internacional llamada3;
	
	@BeforeEach
	public void setUp() {
		llamada= new Internacional (5,"asd",LocalDateTime.of(2023,12,1, 8, 0),"dsa","sad");//20
		//llamada2= new Internacional (4,"qwe",LocalDateTime.of(2023,12,11,7,0),"ewq","wqe");//12
		llamada3= new Internacional (3,"cxz",LocalDateTime.of(2023,11,1,1,0),"zxc","xzc");//9
	}
	@Test
	public void testCosto() {
		assertEquals(20d,this.llamada.costo());
		assertEquals(9d,this.llamada3.costo());
	}
}
