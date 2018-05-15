package model;

import java.util.Date;

public class Pagamento {

   private Float valor;
   private Date data;

   public Pagamento(Float valor, Date data) {
      this.valor = valor;
      this.data = data;
   }

   public Pagamento() {
   }

   public Float getValor() {
      return valor;
   }

   public void setValor(Float valor) {
      this.valor = valor;
   }

   public Date getData() {
      return data;
   }

   public void setData(Date data) {
      this.data = data;
   }

   public Pagamento(Float valorEntregue) {
      this.valor = valorEntregue;
   }

}
