package model;

import java.util.Date;

public class Relatorio {

   private Date dataEmissão;
   private Float valorTotal;

   public Relatorio() {
   }

   public Relatorio(Date dataEmissão, Float valorTotal) {
      this.dataEmissão = dataEmissão;
      this.valorTotal = valorTotal;
   }

   public Date getDataEmissão() {
      return dataEmissão;
   }

   public void setDataEmissão(Date dataEmissão) {
      this.dataEmissão = dataEmissão;
   }

   public Float getValorTotal() {
      return valorTotal;
   }

   public void setValorTotal(Float valorTotal) {
      this.valorTotal = valorTotal;
   }

   public String emitir() {
      return "Valor.:" + this.valorTotal + " Data de Emissão :" + this.dataEmissão;
   }

}
