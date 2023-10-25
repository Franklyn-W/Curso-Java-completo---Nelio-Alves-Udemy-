package anotacoes.herancaPolimorfismo.herenca.entities;

public class Poupanca extends Conta{
    
    private Double taxaDeJuro;

    public Poupanca() {
    }

    public Poupanca(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }

    public Poupanca(Integer numero, String titular, Double saldo, Double taxaDeJuro) {
        super(numero, titular, saldo);
        this.taxaDeJuro = taxaDeJuro;
    }

    public Double getTaxaDeJuro() {
        return taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }

    public void rendimento(){
        saldo += saldo * taxaDeJuro;
    }

    @Override
    public void saque(Double valor) {
        // TODO Auto-generated method stub
        saldo -= valor;
    }

    




    
}
