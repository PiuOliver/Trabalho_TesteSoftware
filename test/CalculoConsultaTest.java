/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import model.Consulta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabrieldeoliveira
 */
public class CalculoConsultaTest extends TestCase{

    public void testGetCalculo(){
        Consulta calculo = new Consulta();
        calculo.setRenda(5999.99);
        assertEquals(5999.99, calculo.getConsulta());
    }
}
