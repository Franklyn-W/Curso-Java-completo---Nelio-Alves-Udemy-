package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio6 {
    
    /*
     * Ler valor interiro N
     * Calcular todos os divisores
     */

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int inteiro = leitor.nextInt();

        for (int i = 1; i <= inteiro; i++) {
            
            if (inteiro % i == 0) {
                System.out.println(i);
            }
        }

        leitor.close();
     }
    
}
