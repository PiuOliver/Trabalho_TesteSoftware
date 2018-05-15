/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jeanv
 */
public class Endereco {

   private String numero;
   private String rua;
   private String bairro;
   private String cidade;
   private String estado;

   public Endereco() {
   }

   public Endereco(String numero, String rua, String bairro, String cidade, String estado) {
      this.numero = numero;
      this.rua = rua;
      this.bairro = bairro;
      this.cidade = cidade;
      this.estado = estado;
   }

   public String getNumero() {
      return numero;
   }

   public void setNumero(String numero) {
      this.numero = numero;
   }

   public String getRua() {
      return rua;
   }

   public void setRua(String rua) {
      this.rua = rua;
   }

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      this.bairro = bairro;
   }

   public String getCidade() {
      return cidade;
   }

   public void setCidade(String cidade) {
      this.cidade = cidade;
   }

   public String getEstado() {
      return estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

}
