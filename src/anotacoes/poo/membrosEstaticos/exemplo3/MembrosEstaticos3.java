package anotacoes.poo.membrosEstaticos.exemplo3;

import java.util.Locale;
import java.util.Scanner;

import anotacoes.poo.membrosEstaticos.exemplo3.util.Calculadora;

public class MembrosEstaticos3 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculadora.circunferencia(raio);

        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI: %.2f\n", Calculadora.PI);

        sc.close();
    }


}
