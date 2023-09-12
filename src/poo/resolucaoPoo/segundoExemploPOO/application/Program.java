package poo.resolucaoPoo.segundoExemploPOO.application;

import java.util.Locale;
import java.util.Scanner;

import poo.resolucaoPoo.segundoExemploPOO.entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Informe os dados do produtos abaixo");
        System.out.print("Nome do produto: ");
        product.nome = sc.nextLine();
        System.out.printf("Infome o preco do produto %s: ", product.nome);
        product.preco = sc.nextDouble();
        System.out.printf("Infome a quantidade do produto %s: ", product.nome);
        product.quantidade = sc.nextInt();

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
