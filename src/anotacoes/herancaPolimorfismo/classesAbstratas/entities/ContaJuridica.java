package anotacoes.herancaPolimorfismo.classesAbstratas.entities;

public class ContaJuridica extends Conta {

    private Double limiteDeCredito;

    public ContaJuridica() {
        super();
    }

    public ContaJuridica(Integer numero, String titular, Double saldo, Double limiteDeCredito) {
        super(numero, titular, saldo);
        this.limiteDeCredito = limiteDeCredito;
    }

    public Double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(Double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public void emprestimo(Double valor) {
        if (valor <= limiteDeCredito) {
            saldo += valor - 10;

        }
    }

    @Override
    public void saque(Double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }

}
