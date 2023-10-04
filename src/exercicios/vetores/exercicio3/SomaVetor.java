package exercicios.vetores.exercicio3;

import java.util.Scanner;

public class SomaVetor {

    /*
     * Faca um programa que leia N numeros reais
     * Armazene-os em um vetor
     * Imprima todos os elementos do vetor
     * Mostrar a soma e a media dos valores do vetor
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        
        double[] reais = new double[n];

        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite um numero: ");
            reais[i] = sc.nextDouble();
        }

        double soma = 0;
        

        System.out.print("\nValores: ");
        for (int i = 0; i < reais.length; i++) {
            soma += reais[i];
            System.out.print(reais[i]+" ");
        }

        double media = soma / n;

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Media = %.2f\n", media);

        


        sc.close();
    }
}
