package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_002_InicioDeFunções {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 3 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();

        int maior = max(a, b,c);
        verResultado(maior);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux ;
        if(x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void verResultado(int valor){

        System.out.printf("O maior é : %d", valor);
    }

}


