package exercicios.vetores.exercicioFixacao;

import java.util.Scanner;

public class App {

    /*
     * Um pensionato possui 10 quartos para aluguel
     * Identificação dos quartos 1 a 10
     * Inicialmente todos os quartos estão vazios
     * Ler a quantidade N de quartos de serão alugados
     * Registrar o aluguel do quarto
     * Deve constar o nome e email do hospede e o numero do quarto
     * Ao final mostrar relatorio de todos os quartos locados, por ordem de quarto
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Object[] quartos = new Object[9];

        System.out.print("Quantos quartos serão locados? ");

        int qtdQuartos = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < qtdQuartos; i++) {

            System.out.println();
            System.out.println("Informações do "
                    + (i + 1)
                    + ("° aluguel: "));
            System.out.print("Nome: ");
            String nome = leitor.nextLine();

            System.out.print("Email: ");
            String email = leitor.nextLine();

            System.out.print("Numero do quarto: ");
            int nrQuarto = leitor.nextInt();
            leitor.nextLine();

            Pessoas hospede = new Pessoas(nome, email, nrQuarto);

            quartos[nrQuarto] = hospede;
        }

        System.out.println("\nQuartos ocupados: ");
        for (Object hospedes : quartos) {

            if (hospedes != null) {
                System.out.println(hospedes.toString());
            }

        }

        leitor.close();

    }
}
