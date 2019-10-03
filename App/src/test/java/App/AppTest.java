package App;

import model.AnalisadorSequencia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

public class AppTest
{
	TelaInterface tela = new TelaInterface();
	
    @Test
    public void SequenciaTrue() throws InterruptedException
    {        
    	tela.setVisible(true);
        tela.setSize(480,480);
        
        JTextField ent = tela.getJtfEntrada();
        JTextField saida = tela.getJtfResultado();
        JButton certo = tela.getJbAnalisa();
        
        Thread th = Thread.currentThread();
        ent.setText("50,30,44,10");
        certo.doClick();
        
        th.sleep(5000);
        
        assertEquals("true", tela.getJtfResultado().getText());   
    }
    
    @Test
    public void acerto() {
    	assertEquals(1, 1);
    }
}
