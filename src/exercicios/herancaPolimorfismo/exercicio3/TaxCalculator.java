package exercicios.herancaPolimorfismo.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.herancaPolimorfismo.exercicio3.entities.Company;
import exercicios.herancaPolimorfismo.exercicio3.entities.Individual;
import exercicios.herancaPolimorfismo.exercicio3.entities.TaxPayer;

public class TaxCalculator {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int quantityTaxPayers = sc.nextInt();
        
        for (int i = 1; i <= quantityTaxPayers; i++) {
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (i/c)? ");
            char typePayer = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (typePayer == 'i') {
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, health));
            }

            if (typePayer == 'c') {
                System.out.print("Number employees: ");
                int numberEmployees = sc.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberEmployees));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID");

        Double totalTax = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(),taxPayer.taxesPaid());

            totalTax += taxPayer.taxesPaid();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTax);










        sc.close();
    }
}
