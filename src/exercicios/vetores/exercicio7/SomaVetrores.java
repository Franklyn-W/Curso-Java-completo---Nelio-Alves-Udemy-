package exercicios.vetores.exercicio7;

import java.util.Scanner;

public class SomaVetrores {

    /*
     * Leia dois vetores A e B, contendo N elementos cada
     * Gere o vetor C
     * Preencha com a soma dos elementos correspondentes de A e B
     * Imprima os valores do Vetor C.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Digite os valores de A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }


        sc.close();
    }
}
