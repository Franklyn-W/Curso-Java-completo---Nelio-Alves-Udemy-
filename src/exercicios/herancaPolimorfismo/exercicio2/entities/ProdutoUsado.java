package exercicios.herancaPolimorfismo.exercicio2.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataFabricacao;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome()
                + " (usado) $ "
                + super.precoFormatado(getPreco())
                + " (Data de fabricação: "
                + sdf.format(getDataFabricacao()) + ")";
    }

}
