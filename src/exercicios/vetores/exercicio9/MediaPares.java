package exercicios.vetores.exercicio9;

import java.util.Scanner;

public class MediaPares {

    /*
     * Ler um numero inteiro N
     * Ler N numeros inteiros e armazenar no vetor
     * Mostrar a media somente dos numeros pares, com uma casa decimal
     * Se nenhum numero for par, mostrar a mensagem NENHUM NUMERO PAR
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanho = leitor.nextInt();
        double media = 0;
        int contPares = 0;

        int[] inteiros = new int[tamanho];

        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um numero: ");
            inteiros[i] = leitor.nextInt();
            if (inteiros[i] % 2 == 0) {
                media += inteiros[i];
                contPares++;
            }
        }

        media = media / contPares;

        if (media > 0) {
            System.out.printf("\nMedia dos pares: %.1f", media);
        } else {
            System.out.println("\nNenhum numero par");
        }

        leitor.close();
    }
}
