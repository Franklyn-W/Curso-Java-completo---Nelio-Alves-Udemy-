package exercicios.vetores.exercicio10;

import java.util.Scanner;

public class MaisVelho {

    /*
     * Ler numero N, que vai representar a quantidade de entradas
     * Ler N conjunto de nomes e idades de pessoas
     * Os nomes devem ser armazenados em um vetor e idade em outro
     * Mostrar o nome da pessoa mais velha
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qtdPessoas];
        int[] idades = new int[qtdPessoas];

        int maiorIdade = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();

            if (idades[i] > idades[maiorIdade]) {
                maiorIdade = i;
            }
        }

        System.out.println("\nPessoa mais velha: " + nomes[maiorIdade]);

        sc.close();
    }
}
