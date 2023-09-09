package exercicios.sequenciais;
import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2.0);
        double area2 = 3.14159 * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n", area);
        System.out.printf("A = %.4f%n", area2);

        scanner.close();
        
    }
}
