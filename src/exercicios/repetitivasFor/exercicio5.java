package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio5 {

    /*
     * Ler valor N
     * Calcular e escrever o fatorial de N
     * Fatorial de N = N * (N-1)*(N-2)*...*1
     * Por definição, fatorial de 0 é 1
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int fator = leitor.nextInt();
        int fatorial = fator;

        if (fator == 0) {
            fatorial = 1;
        } else {
            for (int i = fator - 1; i > 0; i--) {
                fatorial = fatorial * i;
            }
        }
        System.out.println("Fatorial de " + fator + " é " + fatorial);

        leitor.close();
    }

}
