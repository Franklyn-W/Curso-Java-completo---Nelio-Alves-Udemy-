package exercicios.poo.exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.poo.exercicio1.entities.Retangulo;

public class Exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Entre com a altura e a largura do retangulo: ");
        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();

        System.out.printf("AREA: " + String.format("%.2f\n", ret.calcularArea()));
        System.out.printf("PERIMETRO: " + String.format("%.2f\n", ret.calcularPerimetro()));
        System.out.printf("DIAGONAL: " + String.format("%.2f\n", ret.calcularDiagonal()));

        sc.close();
    }
}
