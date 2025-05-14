package Treinando_APP;

import Treinando_Seção8_Entidades.retangulo_EX01;

import java.util.Scanner;
import java.util.Locale;
public class exercicios_Seção8_POO_APP_EX01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo_EX01 x,y ;
        x = new retangulo_EX01();

        System.out.print("Digite a Largura do triangulo: ");
        x.a = sc.nextDouble();
        System.out.print("Digite a Altura do Triangulo:");
        x.b = sc.nextDouble();


        double area = x.area();
        double perimetro = x.perimetro();
        double diagonal = x.diagonal();
        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);

    }
}
