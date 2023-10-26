package exercicios.herancaPolimorfismo.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.herancaPolimorfismo.exercicio1.entities.Funcionario;
import exercicios.herancaPolimorfismo.exercicio1.entities.FuncionarioTerceirizado;

public class App {

    public static void main(String[] args) {

        List<Funcionario> listFunc = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade funcionarios: ");
        int qtdFunc = scanner.nextInt();

        for (int i = 1; i <= qtdFunc; i++) {

            System.out.println("Dados do " + i + "° funcionario:");

            System.out.print("Terceirizado (s/n): ");
            char terceirizado = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Valor da hora trablhada: ");
            Double valorHora = scanner.nextDouble();

            if (terceirizado == 's') {
                System.out.print("Tarifa do terceirizado: ");
                Double tarifa = scanner.nextDouble();

                Funcionario funct = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, tarifa);
                listFunc.add(funct);

            } else {
                Funcionario func = new Funcionario(nome, horasTrabalhadas, valorHora);
                listFunc.add(func);

            }

        }

        System.out.println("\nPagamentos");
        for (Funcionario funcionario : listFunc) {
            System.out.printf(funcionario.getNome() + " - $" + "%.2f\n", funcionario.pagamento());
        }

        scanner.close();
    }
}
