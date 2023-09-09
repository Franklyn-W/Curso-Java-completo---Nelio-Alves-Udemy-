package exercicios.sequenciais;

import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner foo = new Scanner(System.in);

        int idFuncionario = foo.nextInt();
        int horasTrabalhada = foo.nextInt();
        double valorDaHora = foo.nextDouble();

        double salario = horasTrabalhada * valorDaHora;

        System.out.println("Id do funcionario = " + idFuncionario);
        System.out.printf("Salario = %.2f", salario);

        foo.close();
        
    }
}
