package anotacoes.herancaPolimorfismo.classesAbstratas;

import java.util.ArrayList;
import java.util.List;

import anotacoes.herancaPolimorfismo.classesAbstratas.entities.Conta;
import anotacoes.herancaPolimorfismo.classesAbstratas.entities.ContaJuridica;
import anotacoes.herancaPolimorfismo.classesAbstratas.entities.Poupanca;

public class App {

    public static void main(String[] args) {

        /*
         * Conta acc1 = new Conta(1001, "Alex", 1000.0);
         * Esse instanciação não pode ser realizada, pois a classe Conta é do tipo
         * abstrata.
         * 
         * Conta acc2 = new Poupanca(1002, "Maria", 1000.0, 0.01);
         * Conta acc3 = new ContaJuridica(1003, "Bob", 1000.0, 500.0);
         */

         List<Conta> list = new ArrayList<>();

         list.add(new Poupanca(1001, "Alex", 500.0, 0.01));
         list.add(new ContaJuridica(1002, "Jose", 1000.0, 400.0));
         list.add(new Poupanca(1004, "Bob", 300.0, 0.01));
         list.add(new ContaJuridica(1005, "Ana", 500.0, 500.0));

         double soma = 0;

         for (Conta conta : list) {
            soma += conta.getSaldo();
         }

         System.out.printf("Saldo total: %.2f%n", soma);

         for (Conta conta : list) {
            conta.deposito(10.0);
            System.out.printf("Saldo da conta %d: %.2f%n", conta.getNumero(),conta.getSaldo());
         }
         
    }
}
