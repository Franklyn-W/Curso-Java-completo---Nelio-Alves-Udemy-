package exercicios.vetores.exercicio4;

import java.util.Scanner;

public class Alturas {

    /*
     * Faca um programa para ler NOME, IDADE e ALTURA de N pessoas
     * Mostrar na tela a altura media das pessoas
     * Mostrar a porcentagem de pessoas com menos de 16 anos e seus nomes
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double menor16 = 0;

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoas[] pessoa = new Pessoas[n];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if (idade < 16) {
                menor16++;
            }
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            soma += altura;
            sc.nextLine();

            pessoa[i] = new Pessoas(nome, idade, altura);
        }
        
        double media = soma/pessoa.length;

        menor16 = (menor16/pessoa.length)*100;
        

        System.out.printf("\nAltura media: %.2f\n", media);
        System.out.println("Pessoas com menos de 16 anos: " + menor16 + "%");

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getNome());
            }
        }






        sc.close();
    }
}
