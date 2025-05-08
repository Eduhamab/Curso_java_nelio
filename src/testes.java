import java.util.Scanner;
import java.util.Locale;

public class testes {
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
