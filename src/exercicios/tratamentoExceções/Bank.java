package exercicios.tratamentoExceções;

import java.util.Locale;
import java.util.Scanner;

import exercicios.tratamentoExceções.models.entities.Account;
import exercicios.tratamentoExceções.models.exceptions.DomainException;

public class Bank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdrwa limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        try {
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            account.Withdraw(amount);

            System.out.printf("New balance: %.2f", account.getBalanceAccount());

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
