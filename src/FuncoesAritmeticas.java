import java.util.Scanner;


public class FuncoesAritmeticas {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;

        Scanner entradScanner = new Scanner(System.in);
        
        System.out.print("Informe o valor de A: ");
        a = entradScanner.nextDouble();

        System.out.print("Informe o valor de B: ");
        b = entradScanner.nextDouble();

        System.out.print("Informe o valor de C: ");
        c = entradScanner.nextDouble();

        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Valor de X' = " + x1);
        System.out.println("Valor de x\" =" + x2);
        System.out.println("Valores absolutos de: A = " + (int)Math.abs(a) + " B = " + (int)Math.abs(b) + " C = " + (int)Math.abs(c));

        entradScanner.close();
        


    }
}