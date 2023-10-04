package exercicios.vetores.exercicio5;

import java.util.Scanner;

public class NumerosPares {
    
    /*
     * Faca um programa que leia N numeros inteiros
     * Armazene em um vetor
     * Mostre na tela todos os numeros pares
     * Mostre a quantidae de numeros pares
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int qtdPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNumeros pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                qtdPares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + qtdPares);

        sc.close();

    }
}
