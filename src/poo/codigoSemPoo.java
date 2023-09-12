package poo;

import java.util.Locale;
import java.util.Scanner;

public class CodigoSemPoo {
    

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // modificação do local padrão para padrão US, para aceitar . ao inves de , na casa decimal

        Scanner sc = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Informe as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Informe as medidas do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        /*
         * Area do triangulo
         * Area = raiz(p*(p-a)*(p-b)*(p-c))
         * P = (a + b + c)/2
         */

        double P = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(P * (P - xA) * (P - xB) * (P - xC));

        P = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(P * (P - yA) * (P - yB) * (P - yC));

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
