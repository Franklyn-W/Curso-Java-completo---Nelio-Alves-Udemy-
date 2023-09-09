package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio4 {

    /*
     * Ler numero inteiro N
     * N representa o numero de repetiçoes do codigo
     * Ler pares de numeros
     * Mostrar o resultado da divisão do primeiro pelo segundo
     * No caso de denominador igual a 0, mostrar mensagem "divisao impossivel"
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int repetidor = leitor.nextInt();

        for (int i = 0; i < repetidor; i++) {

            double numerador = leitor.nextDouble();
            double denominador = leitor.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisao impossivel");
                continue;
            }

            double quociente = numerador / denominador;

            System.out.printf("%.1f \n", quociente);

        }

        leitor.close();

    }
}
