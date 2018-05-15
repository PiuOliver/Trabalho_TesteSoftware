/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import model.IConsulta;
import model.consultaMock;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabrieldeoliveira
 */
public class consultaTestMock extends TestCase{
    
    public void testConsultaNivel_1(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(1799.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda Inferior do mínimo pedido para participar", consulta.faixaMinhaCasaMinhaVida(consultaMock));
    }
    
    public void testConsultaNivel_1_1(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(2349.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida 1 - Faixa 1", consulta.faixaMinhaCasaMinhaVida(consultaMock));
       
    }
    
    public void testConsultaNivel_2(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(2599.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida 1 e 2 - Localização Centro - Faixa 1.5", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_2_2(){
       IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(3599.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida Gourmet - Localização Centro - Faixa 2", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_3(){
       IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(3999.00);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 2.5", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_3_3(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(4999.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 3", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_4(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(5999.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Localização Sul - Faixa 3.5", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_4_5(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(6499.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  -  Localização Sul - Faixa 4", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_5(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(7999.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Private - Faixa 4.5", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_5_5(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(8999.99);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda permitida. Minha Casa Minha Vida  - Private Premium - Faixa 5", consulta.faixaMinhaCasaMinhaVida(consultaMock));
        
    }
    
    public void testConsultaNivel_6(){
        IConsulta consultaMock = createMock(IConsulta.class);
        expect(consultaMock.getConsulta()).andReturn(9000.01);
        replay(consultaMock);
        
        consultaMock consulta = new consultaMock();
        assertEquals("Renda acima do permitida pedido para participar", consulta.faixaMinhaCasaMinhaVida(consultaMock));
    }
    
    
}
