package exercicios.condicionais;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double merreca = leitor.nextDouble();

        /*
         * 0 ~ 2000 = isento
         * 2000,01 ~ 3000 = 8%
         * 3000,01 ~ 4500 = 18%
         * 4500,01 ~ ... = 28%
         */

        double renda = merreca;
        double imposto = 0;

        if (renda > 4500.00) { // 5000
            renda = renda - 4500; // 500
            imposto += (renda * 0.28); // 500 * 18%
            renda = 4500; // 4500 
        }
        if (renda > 3000.00) {
            renda = renda - 3000;
            imposto += (renda * 0.18);
            renda = 3000;
        }
        if (renda > 2000.00) {
            renda = renda - 2000;
            imposto += (renda * 0.08);
            renda = 2000;
            System.out.printf("R$ %.2f", imposto);
        } else {
            System.out.println("Isento");
        }

        leitor.close();
    }
}
