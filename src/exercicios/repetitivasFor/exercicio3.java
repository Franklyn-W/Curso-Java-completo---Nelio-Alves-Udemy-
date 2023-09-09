package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio3 {
    
    /*
     * Ler inteiro N
     * N representa o numero de casos de teste que vem a seguir
     * Cada caso utiliza 3 valores reais, cada um com uma casa decimal.
     * Apresentar a media ponderada para cada conjunto de 3 valores
     * Primeiro valor tem peso 2
     * Segundo valor tem peso 3
     * Terceiro valor tem peso 5
     */

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int numeroCasos = leitor.nextInt();
        int peso01 = 2;
        int peso02 = 3;
        int peso03 = 5;

        for (int i = 0; i < numeroCasos; i++) {
            
            double valor01 = leitor.nextDouble();
            valor01 = valor01 * peso01;

            double valor02 = leitor.nextDouble();
            valor02 = valor02 * peso02;
            double valor03 = leitor.nextDouble();
            valor03 = valor03 * peso03;

            double mediaPonderada = (valor01 + valor02 + valor03) / (peso01 + peso02 + peso03);

            System.out.printf("Media ponderada dos valores informados: %.1f \n", mediaPonderada);
        }

        leitor.close();
     }
}
