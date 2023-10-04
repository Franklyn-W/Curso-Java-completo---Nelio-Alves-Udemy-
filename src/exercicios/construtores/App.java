package exercicios.construtores;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBem vindo ao Banco Tamandua");
        System.out.println("Selecione a operação que deseja realizar");
        int opcaomenu;
        Conta conta = new Conta();

        do {
            System.out.println("1 - Abertura de conta");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");

            System.out.print("Digite o numero da opção desejada: ");
            opcaomenu = sc.nextInt();

            switch (opcaomenu) {
                case 1:
                    System.out.print("\nInforme o numero da conta: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine(); // Para consumir 'o enter' que ficou pendente por causa do nextInt anterior

                    System.out.print("Informe o nome do titular: ");
                    String nome = sc.nextLine();

                    System.out.print("Deseja realizar deposito inicial (s/n)?: ");
                    String opcao = sc.nextLine();

                    if (opcao.equalsIgnoreCase("s")) {
                        System.out.print("Informe o valor do deposito inicial: $");
                        double deposito = sc.nextDouble();

                        conta.criarConta(numeroConta, nome, deposito);
                    } else {
                        conta.criarConta(numeroConta, nome);
                    }

                    System.out.println("\nConta Criada com sucesso!\n"
                            + conta.toString());
                    break;

                case 2:
                    System.out.print(
                            "\nInforme o valor a ser depositado: $");
                    double deposito = sc.nextDouble();

                    conta.deposito(deposito);

                    System.out.println(
                            "\nDeposito realizado com sucesso!\n"
                                    + conta.toString());
                    break;

                case 3:
                    System.out.println("\nInformamos que cobramos a taxa de $ 5 para cada saque realizado.");
                    System.out.print("Informe o valor que deseja sacar: $");
                    double saque = sc.nextDouble();

                    conta.saque(saque);

                    System.out.println("Saque realizado com sucesso!\n"
                            + conta.toString());

                case 4:
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
        while (opcaomenu != 4);
        sc.close();
    }
}
