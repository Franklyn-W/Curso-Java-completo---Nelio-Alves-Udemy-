package anotacoes.herancaPolimorfismo.herenca.entities;

public class Conta {
// public final class Conta - não permitiria nenhuma classe extender (herdar) seus conteudos;

    private Integer numero;
    private String titular;
    // Private só permite acesso de modificacao da propria classe
    protected Double saldo;
    /*
     * Alterado de private para protected para dar acesso de modificaca a classes
     * que estao no mesmo pacote (package);
     */

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    // ///////////////////////////
    public void saque(Double valor) {
    // final void saque - nao permitiria a sobreposicao do metodo nas classes que extendem a classe Conta
        saldo -= valor + 5.0;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

}
