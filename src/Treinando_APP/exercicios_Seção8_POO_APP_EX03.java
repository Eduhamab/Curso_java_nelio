package Treinando_APP;

import Treinando_Seção8_Entidades.notaALuno_EX03;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_Seção8_POO_APP_EX03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        notaALuno_EX03 x;
        x = new notaALuno_EX03();

        System.out.println("Digite seu nome");
        x.name = sc.nextLine();

        System.out.println("Digite o valor da 1ª nota");
        x.nota1  = sc.nextDouble();

        System.out.println("Digite o valor da 1ª nota");
        x.nota2  = sc.nextDouble();

        System.out.println("Digite o valor da 1ª nota");
        x.nota3  = sc.nextDouble();

        double media = x.notaFinal();
        System.out.println(media);

    }
}
