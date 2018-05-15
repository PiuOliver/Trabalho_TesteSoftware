/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Pessoa {
   
   private String nome;
   private String telefone;
   private String email;
   private Date dataNascimento;

   public Pessoa() {
   }

   public Pessoa(String nome, String telefone, String email, Date dataNascimento) {
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
      this.dataNascimento = dataNascimento;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Date getDataNascimento() {
      return dataNascimento;
   }

   public void setDataNascimento(Date dataNascimento) {
      this.dataNascimento = dataNascimento;
   }
   
   
}