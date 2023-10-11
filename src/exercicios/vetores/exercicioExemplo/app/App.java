package exercicios.vetores.exercicioExemplo.app;

import java.util.Scanner;

import exercicios.vetores.exercicioExemplo.Entities.Produto;

public class App {

    /*
     * Faca um programa para ler um numero interiro N e os dados (nome e preco) de N
     * produtos
     * Armazene os N produtos em um vetor.
     * Em seguida, mostrar o preco medio dos produtos
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto[] produto = new Produto[n];

        for (int i = 0; i < produto.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double preco = sc.nextDouble();
            produto[i] = new Produto(name, preco);
        }

        double soma = 0;

        for (int i = 0; i < produto.length; i++) {
            soma += produto[i].getPreço();
        }

        double media = soma / n;

        System.out.printf("Media dos precos: %.2f%n", media);

        sc.close();

    }
}