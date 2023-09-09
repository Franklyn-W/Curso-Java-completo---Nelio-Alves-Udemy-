import java.util.Locale;
import java.util.Scanner;

public class ExecericioDoWhile {

    /*
     * Ler temperatura em Celsius
     * Mostrar o equivalente em Fahrenheit
     * Perguntar ao usuario se deseja repetir (S/N)
     * Caso o usuario digitar "S", repetir a execução do programa
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        char resp;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double Celsius = leitor.nextDouble();

            double Fahrenheit = (9 * Celsius) / 5 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f\n", Fahrenheit);

            System.out.println("Deseja repetir (s/n)? ");
            resp = leitor.next().charAt(0);
            
        } while (resp == 's');

        leitor.close();

    }
}
