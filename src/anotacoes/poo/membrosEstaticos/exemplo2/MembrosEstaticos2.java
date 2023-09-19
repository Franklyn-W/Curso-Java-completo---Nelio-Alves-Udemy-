package anotacoes.poo.membrosEstaticos.exemplo2;

import java.util.Locale;
import java.util.Scanner;

import anotacoes.poo.membrosEstaticos.exemplo2.util.Calculadora;

public class MembrosEstaticos2 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI: %.2f\n", calc.PI);

        sc.close();
    }


}
