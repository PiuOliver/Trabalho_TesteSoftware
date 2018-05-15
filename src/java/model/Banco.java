package model;

import java.util.Date;


public class Banco {
    
    private String nomeEmpresarial;
    private String tipoParticipante;
    private String dataConstrucao;
    private String cnpj;
    private String codigoCVM;
    private String dataRegistroCVM;
    private String situcaoRegistroCVM;
    private String dataInicioSituacao;
    private String paisOrigem;

    public Banco() {
    }

    public Banco(String nomeEmpresarial, String tipoParticipante, String dataConstrucao, String cnpj, String codigoCVM, String dataRegistroCVM, String situcaoRegistroCVM, String dataInicioSituacao, String paisOrigem) {
        this.nomeEmpresarial = nomeEmpresarial;
        this.tipoParticipante = tipoParticipante;
        this.dataConstrucao = dataConstrucao;
        this.cnpj = cnpj;
        this.codigoCVM = codigoCVM;
        this.dataRegistroCVM = dataRegistroCVM;
        this.situcaoRegistroCVM = situcaoRegistroCVM;
        this.dataInicioSituacao = dataInicioSituacao;
        this.paisOrigem = paisOrigem;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public String getTipoParticipante() {
        return tipoParticipante;
    }

    public void setTipoParticipante(String tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }

    public String getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(String dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoCVM() {
        return codigoCVM;
    }

    public void setCodigoCVM(String codigoCVM) {
        this.codigoCVM = codigoCVM;
    }

    public String getDataRegistroCVM() {
        return dataRegistroCVM;
    }

    public void setDataRegistroCVM(String dataRegistroCVM) {
        this.dataRegistroCVM = dataRegistroCVM;
    }

    public String getSitucaoRegistroCVM() {
        return situcaoRegistroCVM;
    }

    public void setSitucaoRegistroCVM(String situcaoRegistroCVM) {
        this.situcaoRegistroCVM = situcaoRegistroCVM;
    }

    public String getDataInicioSituacao() {
        return dataInicioSituacao;
    }

    public void setDataInicioSituacao(String dataInicioSituacao) {
        this.dataInicioSituacao = dataInicioSituacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    

}
