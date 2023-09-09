package exercicios.condicionais;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        //Leia a hora inicial e final de um jogo
        Scanner leitor = new Scanner(System.in);

        int horaInicio = leitor.nextInt();
        int horaFinal = leitor.nextInt();

        //Calcule a duração do jogo, sabendo que pode comecar em um dia e terminar no outro
        int duracaoJogo;

        if (horaInicio >= horaFinal) {
            duracaoJogo = (horaFinal - horaInicio) + 24;
        } else {
            duracaoJogo = horaFinal - horaInicio;
        }
        System.out.println("O jogo durou " + duracaoJogo + " hora(s)");

        leitor.close();

        //Duração minima de 1 hora e maxima de 24 horas
    }
}
