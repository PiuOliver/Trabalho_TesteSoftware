/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


public class Cliente extends Pessoa{
   
   private Date dataPrimeiraConsulta;
   private Float peso;
   private Float altura;
   private Endereco endereco;
   private Banco planoSaude;
   private DocumentosEntrada protuario;

   public Cliente() {
   }

   public Cliente(Date dataPrimeiraConsulta, Float peso, Float altura, Endereco endereco) {
      this.dataPrimeiraConsulta = dataPrimeiraConsulta;
      this.peso = peso;
      this.altura = altura;
      this.endereco = endereco;
   }

   public Banco getPlanoSaude() {
      return planoSaude;
   }

   public void setPlanoSaude(Banco planoSaude) {
      this.planoSaude = planoSaude;
   }

   public DocumentosEntrada getProtuario() {
      return protuario;
   }

   public void setProtuario(DocumentosEntrada protuario) {
      this.protuario = protuario;
   }

    public Date getDataPrimeiraConsulta() {
      return dataPrimeiraConsulta;
   }

   public void setDataPrimeiraConsulta(Date dataPrimeiraConsulta) {
      this.dataPrimeiraConsulta = dataPrimeiraConsulta;
   }

   public Float getPeso() {
      return peso;
   }

   public void setPeso(Float peso) {
      this.peso = peso;
   }

   public Float getAltura() {
      return altura;
   }

   public void setAltura(Float altura) {
      this.altura = altura;
   }

   public Endereco getEndereco() {
      return endereco;
   }

   public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
   }
   
   
   
}
