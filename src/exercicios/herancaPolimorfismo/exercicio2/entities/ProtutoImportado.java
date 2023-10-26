package exercicios.herancaPolimorfismo.exercicio2.entities;

public class ProtutoImportado extends Produto {
    private Double txAlfandega;

    public ProtutoImportado() {
    }

    public ProtutoImportado(String nome, Double preco, Double txAlfandega) {
        super(nome, preco);
        this.txAlfandega = txAlfandega;
    }

    public Double getTxAlfandega() {
        return txAlfandega;
    }

    public void setTxAlfandega(Double txAlfandega) {
        this.txAlfandega = txAlfandega;
    }

    public Double precoTotal() {
        return super.getPreco() + txAlfandega;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome()
                + " $ "
                + super.precoFormatado(precoTotal())
                + " (Taxa alfandegaria: $ "
                + super.precoFormatado(getTxAlfandega()) + ")";

    }

}
