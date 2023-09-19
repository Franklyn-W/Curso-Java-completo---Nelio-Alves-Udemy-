package exercicios.sequenciais;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double valorTotal = 0;
        
        for (int i = 0; i < 2; i++) {

            //int idPeca = sc.nextInt();
            int qtdPeca = sc.nextInt();
            double valorPeca = sc.nextDouble();
            valorTotal += valorPeca*qtdPeca;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f, pelas peças", valorTotal);

        sc.close();
    }
}
