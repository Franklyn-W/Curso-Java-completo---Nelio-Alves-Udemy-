package exercicios.condicionais;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        //ler dois valores interiros
        Scanner leitor = new Scanner(System.in);
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        //dizer se são multiplos ou não

        //Ordenação dos valores
        if (numero2 > numero1) {
            int x = numero1;
            numero1 = numero2;
            numero2 = x;
            System.out.println("Feito inversão");
        }

        //Resolução com if/else
        if (numero1 % numero2 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        //Resolução com operador ternario
        System.out.println((numero1 % numero2== 0) ? "São multiplos" : "Não são multiplos");

        leitor.close();
    }
}
