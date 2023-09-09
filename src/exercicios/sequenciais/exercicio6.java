package exercicios.sequenciais;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        
        //A, B e C do tipo double
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        // Area do triangulo A de base e C de altura
        // Area = (base * altura) / 2

        double areaTriangulo = (A * C) / 2;

        // Area do circulo de raio C
        // A = pi * raio²

        double areaCirculo = 3.14159 * Math.pow(C, 2.0);

        // Area do trapezio de bases A e B e C de altura
        // Area = (Base maior + base menor) * altura / 2

        double areaTrapezio = (A + B) * C / 2;

        // Area do quadrado de lado B
        // Area = Lado²

        double areaQuadrado = Math.pow(B, 2.0);


         // Area do retangulo de lados A e B
         // Area = base * altura

         double areaReatangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaReatangulo);

        entrada.close();
    }
}