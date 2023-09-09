package exercicios.repetitivasFor;

import java.util.Scanner;

public class exercicio2 {

    /*
     * Ler um valor interiro N
     * N vai representar a quantidade de interiros X que serão lidos em seguida
     * Mostrar quantos destes valores X estão dentro do intervalo [10, 20]
     * E quantos estão fora do intervalo.
     */

    public static void main(String[] args) {

        Scanner leitoScanner = new Scanner(System.in);

        int N = leitoScanner.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {

            int X = leitoScanner.nextInt();

            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }

        }

        System.out.println("Dentro do intervalo: " + in);
        System.out.println("Fora do intervalo: " + out);

        leitoScanner.close();

    }
}
