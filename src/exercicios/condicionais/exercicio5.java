package exercicios.condicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        
        List<Produtos> cardapio = new ArrayList<>();

        Produtos produto1 = new Produtos(1, "Cachorro Quente", 4);
        Produtos produto2 = new Produtos(2, "X-Salada", 4.5);
        Produtos produto3 = new Produtos(3, "X-Bacon", 5);
        Produtos produto4 = new Produtos(4, "Torrada Simples", 2);
        Produtos produto5 = new Produtos(5, "Refrigerante", 1.5);

        cardapio.add(produto1);
        cardapio.add(produto2);
        cardapio.add(produto3);
        cardapio.add(produto4);
        cardapio.add(produto5);

        
        
        
        //Leia o codigo e a quantidade de um item

        Scanner leitor = new Scanner(System.in);

        int codigoItem = leitor.nextInt();
        int qtdItem = leitor.nextInt();

        double valorTotal = 0;
        
        
        //Calcule e mostre o valor da conta a pagar
        for (Produtos produtos : cardapio) {
            if (produtos.getCodigoItem() == codigoItem) {
                valorTotal = produtos.getValorItem() * qtdItem;
            }
        }

        System.out.printf("Total: R$ %.2f", valorTotal);

        leitor.close();


    }
}

class Produtos{
    int codigoItem;
    String nomeItem;
    double valorItem;

    public Produtos(int codigoItem, String nomeItem, double valorItem) {
        this.codigoItem = codigoItem;
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
    }
    public int getCodigoItem() {
        return codigoItem;
    }
    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }
    public String getnomeItem() {
        return nomeItem;
    }
    public void setnomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public double getValorItem() {
        return valorItem;
    }
    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoItem;
        result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valorItem);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produtos other = (Produtos) obj;
        if (codigoItem != other.codigoItem)
            return false;
        if (nomeItem == null) {
            if (other.nomeItem != null)
                return false;
        } else if (!nomeItem.equals(other.nomeItem))
            return false;
        if (Double.doubleToLongBits(valorItem) != Double.doubleToLongBits(other.valorItem))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Produtos [codigoItem=" + codigoItem + ", nomeItem=" + nomeItem + ", valorItem=" + valorItem + "]";
    }
    public String getNomeItem() {
        return nomeItem;
    }
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
}
    