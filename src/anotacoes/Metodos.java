package anotacoes;

import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe tres numeros:  ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maisAlto = calcularMaior(a, b, c);

        mostrarResultado(maisAlto);

        sc.close();

    }

    public static int calcularMaior(int x, int y, int z){

        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else{
            aux = z;
        }

        return aux;

    }

    public static void mostrarResultado(int resultado){

        System.out.println("Valor mais alto = " + resultado);
    }
}
