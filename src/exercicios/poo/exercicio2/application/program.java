package exercicios.poo.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.poo.exercicio2.entities.Funcionario;

public class program {

    /*
     * Ler nome, salario bruto e imposto de um funcionario
     * Mostrar os dados do funcionario (nome e salario liguido)
     * Aumentar o salario bruto com base em porcentagem informada
     * Mostrar novamente os dados do funcionario (nome e salario liguido atualizado)
     */
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = scan.nextLine();
        System.out.print("Salario bruto: ");
        func.salarioBruto = scan.nextDouble();
        System.out.print("Taxa de imposto: ");
        func.imposto = scan.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + func);
        
        System.out.println();
        System.out.print("Informe o percentual de ajuste salarial: ");
        func.reajustarSalario(scan.nextDouble());
        
        System.out.println();
        System.out.println("Dados do funcionario atualizado: " + func);










        scan.close();
        
        
        
    }
}
