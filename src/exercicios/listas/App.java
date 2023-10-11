package exercicios.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    /*
     * Ler quantos funcionarios serao registradod
     * Ler o ID, nome e salario de cada funcionario
     * Perguntar qual o ID do funcionario que vai receber aumento
     * Receber a porcentagem de aumento
     * Listar as informacoes dos funcionarios
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Funcionarios> listaFuncionarios = new ArrayList<>();

        System.err.print("Quantos funcionarios serao cadastrados? ");
        int qtdFunc = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < qtdFunc; i++) {
            System.out.println("\nDados do " + (i + 1) + "° funcionario:");

            System.out.print("Id: ");
            Integer id = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Nome: ");
            String nome = leitor.nextLine();

            System.out.print("Salario: ");
            Double salario = leitor.nextDouble();

            Funcionarios funcionario = new Funcionarios(id, nome, salario);

            listaFuncionarios.add(funcionario);
        }

        boolean alterado = false;
        do {

            System.out.print("\nQual o ID do funcionario que tera o salario aumentado: ");
            Integer id = leitor.nextInt();
            leitor.nextLine();

            /* Alternativa 1
             * Funcionarios idFuncionarios = listaFuncionarios.stream()
             * .filter(x -> x.getIdFuncionario() == id)
             * .findFirst()
             * .orElse(null);
             */

            // Alternativa 2
            Integer posicao = posicaoLista(listaFuncionarios, id);

            if (posicao == null) {
                System.out.println("Id nao localizado.");
                System.out.println("\nLista de funcionarios");
                for (Object funcionario : listaFuncionarios) {
                    System.out.println(funcionario);
                }
            } else {
                System.out.print("Qual a porcentagem de aumento? ");
                double tx = leitor.nextDouble();
                listaFuncionarios.get(posicao).ajustarSalario(tx);
                alterado = true;
            }

        } while (alterado == false);

        System.out.println("\nLista de funcionarios");
        for (Object funcionario : listaFuncionarios) {
            System.out.println(funcionario);
        }
        leitor.close();
    }

    public static Integer posicaoLista(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdFuncionario() == id) {
                return i;
            }
        }
        return null;
    }
}
