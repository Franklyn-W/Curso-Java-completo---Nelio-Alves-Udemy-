package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio7 {

    /*
     * Ler um numero interiro positivo N
     * A seguir imprimir N linhas
     * Onde o primeiro numero sera o numero da linha
     * Depois o quadrado (N²) e o cubo (N³) do valor
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int linhas = leitor.nextInt();

        for (int i = 1; i <= linhas; i++) {

            double quadrado = Math.pow(i, 2.0);
            double cubo = Math.pow(i, 3.0);

            System.out.printf("%d %.0f %.0f \n", i, quadrado, cubo);

        }

        leitor.close();

    }
}
