package exercicios.condicionais;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        // Ler um valor qualquer (double)
        Scanner leitor = new Scanner(System.in);
        double numero = leitor.nextDouble();

        // Mostrar se o valor se encontra em algum dos intervalos pre-definidos;
        if (numero >= 0 && numero < 25) {
            System.out.println("Intervalo [0, 25]");
        } else if (numero >= 25 && numero < 50) {
            System.out.println("Intervalo [25, 50]");
        } else if (numero >= 50 && numero < 75) {
            System.out.println("Intervalo [50, 75]");
        } else if (numero >= 75 && numero < 100) {
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora dos intervalos");
        }

        leitor.close();
        // intervalor (0,25), (25,50), (50,75), (75,100)
    }
}