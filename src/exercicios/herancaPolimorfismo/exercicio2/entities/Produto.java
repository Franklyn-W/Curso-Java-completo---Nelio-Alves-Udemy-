package exercicios.herancaPolimorfismo.exercicio2.entities;

import java.text.DecimalFormat;

public class Produto {
    private String nome;
    private Double preco;

    private DecimalFormat df = new DecimalFormat("#.00");

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String precoFormatado(Double preco) {
        return df.format(preco);
    }

    public String etiquetaPreco() {
        return getNome() + " $ " + precoFormatado(getPreco());
    }
}
