package exercicios.poo.exercicio3.app;

import java.util.Scanner;

import exercicios.poo.exercicio3.entities.Aluno;

public class program {

    /*
     * Ler o nome do aluno e as tres notas obtidas
     * Mostrar a nota final do aluno
     * Dizer se o aluno ja foi aprovado (PASS) ou nao (FAILED)
     * Em caso negativo, mostrar quantos pontos faltam para obter o minimo para ser
     * aprovado (60 pontos)
     * Criar classe Student para resolução da questão
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = scan.nextLine();
        aluno.n1 = scan.nextInt();
        aluno.n2 = scan.nextInt();
        aluno.n3 = scan.nextInt();

        System.out.printf("NOTA FINAL: %.2f\n", aluno.calcularNota());

        aluno.aprovacao();

        scan.close();
    }
}
