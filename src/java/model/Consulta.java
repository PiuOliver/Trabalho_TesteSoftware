/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Consulta implements IConsulta{

   private Double renda;
   private Integer qntdePessoas;

   public Consulta() {
   }

    public Consulta(Double renda, Integer qntdePessoas) {
        this.renda = renda;
        this.qntdePessoas = qntdePessoas;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public Integer getQntdePessoas() {
        return qntdePessoas;
    }

    public void setQntdePessoas(Integer qntdePessoas) {
        this.qntdePessoas = qntdePessoas;
    }
   

    public double getConsulta() {
        return renda;
    }

}
