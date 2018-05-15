/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Banco;

/**
 *
 * @author gabrieldeoliveira
 */
class bancoController {
    static Banco objBanco;

    public bancoController() {
    }
    
    public boolean Instancia(String nomeEmpresarial, String tipoParticipante, String dataConstrucao, String CNPJ, String codigoCVM, String dataRegistroCVM, String situacaoRegistroCVM, String dataInicioSituacao, String paisOrigem) {
        try {
            this.objBanco = new Banco();
            objBanco.setCnpj(CNPJ);
            objBanco.setCodigoCVM(codigoCVM);
            objBanco.setDataConstrucao(dataConstrucao);
            objBanco.setDataInicioSituacao(dataInicioSituacao);
            objBanco.setDataRegistroCVM(dataRegistroCVM);
            objBanco.setNomeEmpresarial(nomeEmpresarial);
            objBanco.setPaisOrigem(paisOrigem);
            objBanco.setSitucaoRegistroCVM(situacaoRegistroCVM);
            objBanco.setTipoParticipante(tipoParticipante);  
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
