package Treinando_Seção8_Entidades;

public class funcionario_EX02 {
   public String name;
   public double salarioBruto;
   public double imposto;

   public double CalcSemImposto(){
      double   salarioSemImposto  = salarioBruto - imposto;
       return  salarioSemImposto;
   }

   public void calcAumento(int salarioBruto){
        this.salarioBruto += (salarioBruto  * this.salarioBruto) /100 ;
   }

}
