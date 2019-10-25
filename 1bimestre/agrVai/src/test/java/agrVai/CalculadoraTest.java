package agrVai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Test
	public void somarTeste(){
		calc = new Calculadora();
		
		assertEquals(2.999, calc.Somar(1f,1.999f), 0.001);
		assertEquals(9.5, calc.subtrair(10.5f, 1.0f), 0.1);
		assertEquals(2.50, calc.dividir(5,2), 0.01);
		assertEquals(1.99, calc.multiplicar(1.99f, 1), 0.01);
	}

	@Test
	public void somarTesteFalha(){
		calc = new Calculadora();
		
		assertEquals(2.9998, calc.Somar(1f,1.999f), 0.00001);
		assertEquals(9.51, calc.subtrair(10.5f, 1.0f), 0.1);
		assertEquals(3.50, calc.dividir(5,2), 0.1);
		assertEquals(1.2, calc.multiplicar(1.99f, 1), 0.01); 
	}
	
//	arrumar 1 p cada
	
	public void suTesteFalha(){
	}
	
}
