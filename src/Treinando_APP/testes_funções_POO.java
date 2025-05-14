package Treinando_APP;

/*
// Desafio 1 Crie um programa para receber as notas digitadas pelo usuario e retornar se ele foi aprovado ou reprovado
public class testes_funções_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;
        System.out.println("Vamos ver se você passou de ano, Digite a sua 1ª nota ");
        n1 = sc.nextDouble();
        System.out.println("Digite a sua 2ª nota ");
        n2 = sc.nextDouble();
        System.out.println("Digite a sua 3ª nota ");
        n3 = sc.nextDouble();


        Double result = isAproved(n1, n2, n3);
        showResult(result);
        sc.close();
    }

    public static Double isAproved(Double x, Double y, Double z) {
        Double media = (x + y + z) / 3;

        if (media >= 7) {
            System.out.println("Parabens você foi aprovado");
        } else if (media >= 5 && media <= 6) {
            System.out.println("Você esta de recuperação");
        } else {
            System.out.println("REPROVADO ESTUDE MAIS!!!!!");
        }
        return media;
    }

    public static void showResult(Double resultado) {
        System.out.printf("Sua nota foi: %.1f", resultado);
    }
}
*/

/* fazer um exercicio sem ORIENTAÇÃO A OBJETOS
public class testes_funções_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aX, aY, aZ, bX, bY, bZ;

        System.out.println("Digite os valores dos lados do 1ª Triangulo: ");
        aX = sc.nextDouble();
        aY = sc.nextDouble();
        aZ = sc.nextDouble();
        System.out.println("Digite os valores dos lados do 2ª Triangulo: ");
        bX = sc.nextDouble();
        bY = sc.nextDouble();
        bZ = sc.nextDouble();

        double p = (aX + aY + aZ) / 2;
        double areaA = Math.sqrt(p * (p - aX) * (p - aY) * (p - aZ));

        p = (bX + bY + bZ) / 2;

        double areaB = Math.sqrt(p * (p - bX) * (p - bY) * (p - bZ));


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
*/

/*
public class testes_funções_POO {

    public static void main(String[] args) {
        System.out.println("hello word");
    }
}
*/