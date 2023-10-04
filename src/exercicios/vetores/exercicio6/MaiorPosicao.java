package exercicios.vetores.exercicio6;

import java.util.Scanner;

public class MaiorPosicao {

    /*
     * Faca um programa que leia N numeros reais
     * Armazene em um vetor
     * Mostre na tela o maior numero do vetor
     * Mostre a posicao no vetor (considerando 0 como inicio)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double maior = 0;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posicao do maior valor: " + posicao);

        sc.close();
    }
}
