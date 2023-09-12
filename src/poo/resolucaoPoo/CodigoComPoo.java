package poo.resolucaoPoo;

import java.util.Locale;
import java.util.Scanner;

import poo.resolucaoPoo.entidades.Triangulo;

public class CodigoComPoo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        /*
         * modificação do local padrão para padrão US, para aceitar .(ponto) ao inves de ,(virgula) na casa decimal
         */
        Scanner sc = new Scanner(System.in);
        
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Informe as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        /*
         * Area do triangulo
         * Area = raiz(p*(p-a)*(p-b)*(p-c))
         * P = (a + b + c)/2
         */

        double P = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(P * (P - x.a) * (P - x.b) * (P - x.c));

        P = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(P * (P - y.a) * (P - y.b) * (P - y.c));

        System.out.printf("Area do triangulo X: %.4f\n", areaX);
        System.out.printf("Area do triangulo Y: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Triangulo X tem a maior area");
        } else {
            System.out.println("Triangulo Y tem maior area");
        }

        sc.close();
    }
}
