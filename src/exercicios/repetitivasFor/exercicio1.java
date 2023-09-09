package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio1 {
    
    /*
     * Leia um valor interiro X (1 <= X <= 1000)
     * Mostre os numeros impares de 1 até X
     * Um valor por linha
     * Inclusive o X, se for o caso
     */

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++){

            if (i % 2 == 1) {
                System.out.println(i);
            }
        }



        leitor.close();
        
     }
     
     
}
