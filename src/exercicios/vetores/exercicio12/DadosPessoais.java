package exercicios.vetores.exercicio12;

import java.util.Scanner;

public class DadosPessoais {

    /*
     * Ler N que representa a quantidade de pessoas a serem inseridas
     * Ler altura e genero das pessoas
     * Mostrar a maior e a menor altura do grupo
     * Mostrar a media de altura entre as mulheres
     * Mostraar quantidade de homens
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas pessoas são digitadas? ");
        int qtdPessoas = leitor.nextInt();
        leitor.nextLine();

        double[] altura = new double[qtdPessoas];
        char[] genero = new char[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            altura[i] = leitor.nextDouble();

            System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
            genero[i] = leitor.next().charAt(0);
        }

        double maiorAltura = 0;
        double menorAltura = 10;
        double mediaAltura = 0;
        int qtdHomens = 0;

        for (int i = 0; i < qtdPessoas; i++) {

            if (maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }

            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }

            if (genero[i] == 'M') {
                qtdHomens++;
            } else {
                mediaAltura += altura[i];
            }
        }

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Media da altura das mulheres: %.2f\n", (mediaAltura / (qtdPessoas - qtdHomens)));
        System.out.println("Quantidade de homens: " + qtdHomens);

        leitor.close();

    }
}
