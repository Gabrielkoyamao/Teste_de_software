import model.CalculadorAluguel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	
	CalculadorAluguel ca = new CalculadorAluguel(500.00);

	
//	extremos do 1
	@Test
    public void dia_0(){
        assertEquals(-1, ca.calcAluguel(0), 0.01);
    }
	
    @Test
    public void dia_1(){
        assertEquals(450.00, ca.calcAluguel(1), 0.01);
    }
    
    @Test
    public void dia_2(){
        assertEquals(450.00, ca.calcAluguel(2), 0.01);
    }
    
    
//    extremos do 5
    @Test
    public void dia_4(){
        assertEquals(450.00, ca.calcAluguel(4), 0.01);
    }
    
    @Test
    public void dia_5(){
        assertEquals(450.00, ca.calcAluguel(5), 0.01);
    }
    
    @Test
    public void dia_6(){
        assertEquals(475.00, ca.calcAluguel(6), 0.01);
    }
    
    
        
    
//   extremos do 10
//
    @Test
    public void dia_9(){
        assertEquals(475.00, ca.calcAluguel(9), 0.01);
    }
    
    @Test
    public void dia_10(){
        assertEquals(475.00, ca.calcAluguel(10), 0.01);
    }
    
    @Test
    public void dia_11(){
        assertEquals(500.00, ca.calcAluguel(11), 0.01);
    }
    
    
//    extremos do 15
    
    @Test
    public void dia_14(){
        assertEquals(500.00, ca.calcAluguel(14), 0.01);
    }
    
    @Test
    public void dia_15(){
        assertEquals(500.00, ca.calcAluguel(15), 0.01);
    }
    
    @Test
    public void dia_16(){
        assertEquals(510.25, ca.calcAluguel(16), 0.01);
    }
    
//    extremo 30
    
    @Test
    public void dia_30(){
//    	2% a mais de 500 == 510
//    	0,05% a mais por dia ==> 15 dias == 0,75%  de 500 == 3,75
        assertEquals(513.75, ca.calcAluguel(30), 0.01);
    }
    
//    @Test
    public void dia_31(){
//    	2% a mais de 500 == 510
//    	0,05% a mais por dia ==> 15 dias == 0,75%  de 500 == 4,00
        assertEquals(514.00, ca.calcAluguel(31), 0.01);
    }
    
//    @Test
    public void dia_32(){
        assertEquals(-1, ca.calcAluguel(32), 0.01);
    }
    
    

    
    
    
    
    



    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
//	
//	@Test
//	public void validoEncontrado() {
//		ParticoesEquivalentes pq = new ParticoesEquivalentes();
//		assertEquals(2, pq.teste("xx@"));
//	}
//	
//	@Test
//	public void validoEncontrado2() {
//		ParticoesEquivalentes pq = new ParticoesEquivalentes();
//		assertEquals(1, pq.teste("x@@"));
//	}
//	
//	@Test
//	public void validoNaoEncontrado() {
//		ParticoesEquivalentes pq = new ParticoesEquivalentes();
//		assertEquals(-1, pq.teste("xxy"));
//	}
//	
//	@Test
//	public void vazio() {
//		ParticoesEquivalentes pq = new ParticoesEquivalentes();
//		assertEquals(-2, pq.teste(""));
//	}
//	
//	@Test
//	public void maior() {
//		ParticoesEquivalentes pq = new ParticoesEquivalentes();
//		assertEquals(-3, pq.teste("xxyssss"));
//	}
}
