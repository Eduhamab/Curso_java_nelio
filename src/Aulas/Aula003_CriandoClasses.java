package Aulas;

import Aulas_entidades.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Aula003_CriandoClasses {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os valores dos lados do 1ª Triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores dos lados do 2ª Triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaA = x.area();
        double areaB = y.area();

        System.out.printf("Area do triangulo A é: %.4f %n", areaA);
        System.out.printf("Area do triangulo B é: %.4f %n", areaB);

        if (areaA > areaB) {
            System.out.println("Maior area Triangulo A");
        } else {
            System.out.println("Maior area Triangulo B");
        }
        sc.close();
    }
}
