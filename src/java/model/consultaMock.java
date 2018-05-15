/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabrieldeoliveira
 */
public class consultaMock {
    

   public String faixaMinhaCasaMinhaVida(IConsulta consulta) {
       double renda = consulta.getConsulta();
      if (renda < 1800) { 
         return "Renda Inferior do mínimo pedido para participar";
      } else if (renda < 2350) {
         return "Renda permitida. Minha Casa Minha Vida 1 - Faixa 1";
      } else if (renda < 2600) {
         return "Renda permitida. Minha Casa Minha Vida 1 e 2 - Localização Centro - Faixa 1.5";
      } else if (renda < 3600) {
         return "Renda permitida. Minha Casa Minha Vida Gourmet - Localização Centro - Faixa 2";
      } else if(renda < 4000){
         return "Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 2.5";
      }else if(renda < 5000){
          return "Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 3";
      }else if(renda < 6000){
          return "Renda permitida. Minha Casa Minha Vida  - Localização Sul - Faixa 3.5";
      }else if(renda < 6500){
          return "Renda permitida. Minha Casa Minha Vida  -  Localização Sul - Faixa 4";
      }else if(renda < 8000){
          return "Renda permitida. Minha Casa Minha Vida  - Private - Faixa 4.5";
      }else if(renda < 9000){
          return "Renda permitida. Minha Casa Minha Vida  - Private Premium - Faixa 5";
      }else{
          return "Renda acima do permitida pedido para participar";
      }
      
   }
}
