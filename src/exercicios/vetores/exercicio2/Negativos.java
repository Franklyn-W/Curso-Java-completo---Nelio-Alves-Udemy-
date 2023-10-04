package exercicios.vetores.exercicio2;

import java.util.Scanner;

public class Negativos {

    /*
     * Faca um programa que leia um numero inteiro positivo N
     * N deve ser no maximo 10
     * Depois ler N numeros inteiros (positivos e negativos)
     * Armazenar e um vetor
     * Mostrar na tela todos os numeros negativos do vetor
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}
