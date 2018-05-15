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
public class Contrato {

   private String descricao;
   private Integer tempo;

   public Contrato() {
   }

   public Contrato(String descricao, Integer tempo) {
      this.descricao = descricao;
      this.tempo = tempo;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public Integer getTempo() {
      return tempo;
   }

   public void setTempo(Integer tempo) {
      this.tempo = tempo;
   }


}
