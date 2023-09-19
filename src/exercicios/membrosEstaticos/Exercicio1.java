package exercicios.membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    /*
     * Ler cotação do $ dolar
     * Ler o valor de dolares que a pessoa quer comprar
     * Informar quantos reais será pago, considerando o acrescimo de 6% de IOF sobre
     * o valor em dolar
     * Criar classe CurrencyConverter, que seraa responsavel pelos calculos
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double precoDolar = leitor.nextDouble();

        System.out.print("Quantos dolares deseja comprar? ");
        double dolarAComprar = leitor.nextDouble();

        System.out.printf("Você pagará %.2f reais", CurrencyConverter.valorFinal(precoDolar, dolarAComprar));

        leitor.close();
    }
}
