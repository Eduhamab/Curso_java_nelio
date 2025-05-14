package Treinando_Seção8_Entidades;

public class retangulo_EX01 {
    public  double a;
    public double b;

    public double area(){
        return a * b;
    };

    public double perimetro(){
      return (a * 2 ) + (b * 2);
    };

    public double diagonal(){
        double calc = (a * a ) + (b * b);
        return Math.sqrt(calc);
    };

}
