package anotacoes.poo.vetoresListasMatriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        // Para preencher a matriz
        for (int l = 0; l < matriz.length; l++) { // Percorre as linhas
            for (int c = 0; c < matriz[l].length; c++) { // Percorre as colunas
                matriz[l][c] = sc.nextInt();
            }
        }

        // matriz.length - retorna quantidade de linhas da matriz
        // matriz[l].length - retorna a quantidade de colunas

        // Mostrar a diagonal principal da matriz
        System.out.println("Diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Percorrer matriz e contar numeros negativos

        int contador = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] < 0) {
                    contador++;
                }
            }
        }

        System.out.println("\n3Qtd de numeros negativos: " + contador);

        sc.close();

    }
}
