package exercicios.vetores.exercicio8;

import java.util.Scanner;

public class AbaixoDaMedia {

    /*
     * Ler numero inteiro N
     * Preencher o vetor com N inteiros reais
     * Mostrar a media aritmetica de todos os elementos, com 3 casas decimais
     * Mostrar os elementos que estão abaixo da media, com uma casa decimal
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanho = scanner.nextInt();

        double media = 0;

        double[] reais = new double[tamanho];

        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite um numero: ");
            reais[i] = scanner.nextDouble();
            media += reais[i];
        }

        media = media/reais.length;
        System.out.printf("\nMedia do vetor = %.3f\n", media);

        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < reais.length; i++) {
            if (reais[i] < media) {
                System.out.println(reais[i]);
            }
        }



        scanner.close();
        
    }
}
