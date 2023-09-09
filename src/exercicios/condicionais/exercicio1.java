package exercicios.condicionais;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        //ler um numero interiro
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        //dizer se é negativo ou não

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        leitor.close();
    }
}
