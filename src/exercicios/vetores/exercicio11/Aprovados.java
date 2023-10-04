package exercicios.vetores.exercicio11;

import java.util.Scanner;

public class Aprovados {

    /*
     * Receber inteiro N que representa o a quantidade de alunos
     * Receber nome do aluno e as notas do 1° e 2° semestre
     * Cada informação deve estar em um vetor proprio
     * Mostrar o nome dos alunos aprovados, que possuem media das notas maior ou igual a 6
     */

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos alunos sera digitados? ");
        int qtdAlunos = leitor.nextInt();
        leitor.nextLine();

        String[] nomeAlunos = new String[qtdAlunos];
        double[] nota1Bi = new double[qtdAlunos];
        double[] nota2bi = new double[qtdAlunos];

        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Digite o nome, a primeira e a segunda nota do " + (i+1) + "° aluno:");
            nomeAlunos[i] = leitor.nextLine();
            nota1Bi[i] = leitor.nextDouble();
            nota2bi[i] = leitor.nextDouble();
            leitor.nextLine();
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < nomeAlunos.length; i++) {
            double media = (nota1Bi[i] + nota2bi[i]) / 2;
            if (media >= 6) {
                System.out.println(nomeAlunos[i]);
            }
            
        }




        leitor.close();
     }

    
}