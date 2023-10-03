package anotacoes.poo.construtores.app;

import java.util.Locale;
import java.util.Scanner;

import anotacoes.poo.construtores.entities.Product;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do produtos abaixo");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.printf("Infome o preco do produto %s: ", nome);
        double preco = sc.nextDouble();
        //System.out.printf("Infome a quantidade do produto %s: ", nome);
        //int quantidade = sc.nextInt();
        Product product = new Product(nome, preco);

        product.setNome("Computador");
        System.out.println("\nNome atualizado: " + product.getNome());
        product.setPreco(1200.00);
        System.out.println("Preco atualizado " + product.getPreco());



        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Informe a quantidade a ser ADICIONADA no estoque: ");
        int quantidade = sc.nextInt();
        product.adicionarProduto(quantidade);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Informe a quantidade a ser REMOVIDA no estoque: ");
        quantidade = sc.nextInt();
        product.removerProduto(quantidade);

        System.out.println();
        System.out.println(product);

        sc.close();

    }
}
