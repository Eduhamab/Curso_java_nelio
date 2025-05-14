package Treinando_APP;

import Treinando_Seção8_Entidades.funcionario_EX02;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_Seção8_POO_APP_EX02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario_EX02 x;
        x = new funcionario_EX02();



        System.out.print("Digite o nome do Funcionario: ");
        x.name = sc.nextLine();
        System.out.print("Digite seu Salario Bruto: ");
        x.salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor do Imposto: ");
        x.imposto = sc.nextDouble();
        double valorSemImposto = x.CalcSemImposto();

        System.out.printf("Funcionario(a) %s, R$ %.2f %n",x.name, valorSemImposto);

        System.out.print("Quanto % voce quer dar de aumento para: " + x.name + " ");
        int salarioBruto = sc.nextInt();
        x.calcAumento(salarioBruto);

        System.out.printf("Salario atualizado é de %.2f", x.salarioBruto);



    }
}
