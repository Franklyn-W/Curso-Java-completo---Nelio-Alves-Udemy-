package exercicios.construtores;

public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public void CriarConta(int numeroConta, String nome, double deposito) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = deposito;
    }

      public void CriarConta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void Deposito(double deposito){
        this.saldo += deposito;
    }

    public void Saque (double saque){
        this.saldo -= (saque+5);
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + ", Nome: " + nome + ", Saldo atual: " + saldo + "\n";
    }

    
    // ---------------------------------------------------------//


    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
