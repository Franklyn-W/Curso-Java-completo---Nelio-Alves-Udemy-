package anotacoes.herancaPolimorfismo.herenca;

import anotacoes.herancaPolimorfismo.herenca.entities.Conta;
import anotacoes.herancaPolimorfismo.herenca.entities.ContaJuridica;
import anotacoes.herancaPolimorfismo.herenca.entities.Poupanca;

public class App {

    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Jose", 1000.0);

        ContaJuridica contaJ = new ContaJuridica(1002, "Maria", 0.0, 500.0);

        // Upcasting

        Conta conta2 = contaJ;
        Conta conta3 = new ContaJuridica(1003, "Zeca", 0.0, 0.0);
        Conta contaP = new Poupanca(1004, "Ana", 1000.0, 0.01);

        // Downcasting

        ContaJuridica contaJ2 = (ContaJuridica) conta3;
        contaJ2.emprestimo(100.0);
        /*
         * Casting nao permitido por imcompatibilidade de tipos
         * Necessario realizar casting manual
         */

        // ContaJuridica contaJ3 = (ContaJuridica) conta4;
        /*
         * Ocorrera erro em tempo de execucao, mesmo com casting manual
         * ContaJuridica e Poupança herdam de Conta, porem nao podem ser convertidos
         * entre sim
         */

        if (contaP instanceof ContaJuridica) {
            ContaJuridica contaJ3 = (ContaJuridica) contaP;
            contaJ3.emprestimo(200.0);
            System.out.println("Emprestimo");
        }

        if (contaP instanceof Poupanca) {
            Poupanca contaP1 = (Poupanca) contaP;
            contaP1.rendimento();
            System.out.println("Rendimento");
        }

        Conta contaS1 = new Conta(1001, "Zeca", 1000.0);
        contaS1.saque(200.0);
        System.out.println(contaS1.getSaldo());

        Conta contaS2 = new Poupanca(1002, "Jose", 1000.0, 0.01);
        contaS2.saque(200.0);
        System.out.println(contaS2.getSaldo());

        Conta contaS3 = new ContaJuridica(1003, "Luis", 1000.0, 500.0);
        contaS3.saque(200.0);
        System.out.println(contaS3.getSaldo());

    }
}
