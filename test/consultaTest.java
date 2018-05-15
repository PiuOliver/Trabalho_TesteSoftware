/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import model.Consulta;
import model.IConsulta;
import model.consultaMock;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author gabrieldeoliveira
 */
public class consultaTest extends TestCase{
   
    Consulta consulta;
    consultaMock mock;
    @Before
    protected void setUp() throws Exception{
        super.setUp();
        consulta = new Consulta();
        mock = new consultaMock();
    }
    
    @Test
    public void testConsultaNivel_1(){
        consulta.setRenda(1799.99);
        assertEquals("Renda Inferior do mínimo pedido para participar", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_1_1(){
        consulta.setRenda(2349.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida 1 - Faixa 1", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_2(){
        consulta.setRenda(2599.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida 1 e 2 - Localização Centro - Faixa 1.5", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_2_2(){
        consulta.setRenda(3599.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida Gourmet - Localização Centro - Faixa 2", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_3(){
        consulta.setRenda(3999.00);
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 2.5", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_3_3(){
        consulta.setRenda(4999.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 3", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_4(){
        consulta.setRenda(5999.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Sul - Faixa 3.5", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_4_5(){
        consulta.setRenda(6499.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida  -  Localização Sul - Faixa 4", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_5(){
        consulta.setRenda(7999.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Private - Faixa 4.5", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_5_5(){
        consulta.setRenda(8999.99);
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Private Premium - Faixa 5", mock.faixaMinhaCasaMinhaVida(consulta));
    }
    
    public void testConsultaNivel_6(){
        consulta.setRenda(9000.01);
        assertEquals("Renda acima do permitida pedido para participar", mock.faixaMinhaCasaMinhaVida(consulta));
    }
   
}
