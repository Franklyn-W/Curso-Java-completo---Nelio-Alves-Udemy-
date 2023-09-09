package exercicios.repetitivasWhile;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = leitor.nextInt();
        
        while ((senha != 2002)) {
            System.out.println("Senha Invalida");
            System.out.println("Informe a senha: ");
            senha = leitor.nextInt();
        }

        System.out.println("Acesso Permitido");

        leitor.close();
    }

}
