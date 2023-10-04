package exercicios.construtores;

public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public void criarConta(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        /*
        * this.saldo = depositoInicial
        * Linha retirada para melhoria de codigo, onde sera utilizado a  operação de deposito recebendo o deposito inicial, pois caso ocorra alguma alteracao na politica de deposito, a alteração sera refletida aqui tambem
        */
        deposito(depositoInicial);
    }

      public void criarConta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque (double saque){
        this.saldo -= (saque+5);
    }

    @Override
    public String toString() {
        return 
        "Conta: " + numeroConta 
        + ", Nome: " + nome 
        + ", Saldo atual: $" + String.format("%.2f", saldo) + "\n";
    }

    
    // ---------------------------------------------------------//

    // Get's e Set's


    // Numero da conta não pode ser alterado apos criado, por isso só possui o metodo get para retornar o numero.
    public int getNumeroConta() {
        return numeroConta;
    }

    // O nome pode ser alterado posteriormente, por isso, tem o metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // O saldo só pode ser alterado por meio de saques e depositos, por isso só possiu o metodo get para consulta.
    public double getSaldo() {
        return saldo;
    }

}
