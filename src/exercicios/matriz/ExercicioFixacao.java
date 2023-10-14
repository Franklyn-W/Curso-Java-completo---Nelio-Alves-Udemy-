package exercicios.matriz;

import java.util.Scanner;

public class ExercicioFixacao {

    // Receber o total de linhas de colunas, podem ser diferentes
    // Receber os valores da matriz
    // Escolher um numero
    // Verificar se esta numero esta na matriz
    // Caso sim, informar sua posição [linha,coluna]
    // Mostrar o valor que esta acima, abaixo, a esquerda e a direita

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade linhas e colunas da matriz: ");
        int qtdLinhas = sc.nextInt();
        int qtdColunas = sc.nextInt();

        int[][] matriz = new int[qtdLinhas][qtdColunas];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Escolha um numero: ");
        int numero = sc.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == numero) {
                    System.out.println("\nPosição: " + linha + "," + coluna);

                    // Se estiver na coluna 0 nao possui numero a esquerda
                    if (coluna != 0) {
                        System.out.println("A esquerda: " + matriz[linha][coluna - 1]);
                    }

                    // Se estiver na ultima coluna, nao possui numero a direita
                    if (coluna != matriz[linha].length - 1) {
                        System.out.println("A direita: " + matriz[linha][coluna + 1]);

                    }

                    // Se estiver na ultima linha, nao possui numero abaixo
                    if (linha != matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[linha + 1][coluna]);
                    }

                    // Se estiver na linha 0, nao possui numero acima
                    if (linha != 0) {
                        System.out.println("Acima: " + matriz[linha - 1][coluna]);
                    }

                }
            }
        }

        sc.close();

    }

}
