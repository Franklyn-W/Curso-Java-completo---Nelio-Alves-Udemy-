package anotacoes.tratamentoDeExcecoes.stackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

    public static void main(String[] args) {

        method1(); // Chamada do method1;

        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("*** METHOD 1 START ****");
        method2(); // chamada do method2
        System.out.println("*** METHOD 1 END ***");

    }

    public static void method2() {

        System.out.println("*** METHOD 2 START ****");

        Scanner sc = new Scanner(System.in);

        try {

            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position.");
            e.printStackTrace(); // Imprimi na tela as informações sobre o erro, sem finalizar a aplicação.
        } catch (InputMismatchException e) {
            System.out.println("Input error.");
        }

        sc.close();
        System.out.println("*** METHOD 2 END ***");
    }

}
