package anotacoes.poo.vetoresListasMatriz;

import java.util.Scanner;

public class Vetor1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;
        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}
