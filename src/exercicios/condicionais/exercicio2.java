package exercicios.condicionais;

import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        //ler um numero interiro
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        //dizer se é par ou impar

        if (numero%2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        leitor.close();
    }
}
