
import java.util.Scanner;

public class Atribuicao2 {
    public static void main(String[] args) {
        
        int x,y;

        x = 5;

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        
    }
    

    double calcularArea() {
        
        int baseMenor, altura, baseMaior; 

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Insira a base menor: ");
            baseMenor = entrada.nextInt();

            System.out.print("Insira a base maior: ");
            baseMaior = entrada.nextInt();

            System.out.print("Insira a altura: ");
            altura = entrada.nextInt();
        }

        double area = ((baseMenor + baseMaior)/2) * altura;

        return area;
    }

    double calcularArea2(int baseMenor, int altura, int baseMaior){

        double area = (baseMenor + baseMaior)/2 * altura;

        return area;
    }
}
