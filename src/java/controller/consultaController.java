/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Consulta;
import model.IConsulta;
import model.consultaMock;

/**
 *
 * @author gabrieldeoliveira
 */
class consultaController {
    
    static IConsulta objConsulta;

    public consultaController() {
    }

    public boolean Instancia(Double renda) {
        try {
            objConsulta.getConsulta();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public double medida(Double renda){
        return objConsulta.getConsulta();
    }
    
}
