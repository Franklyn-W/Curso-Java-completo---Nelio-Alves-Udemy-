package exercicios.herancaPolimorfismo.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercicios.herancaPolimorfismo.exercicio2.entities.Produto;
import exercicios.herancaPolimorfismo.exercicio2.entities.ProdutoUsado;
import exercicios.herancaPolimorfismo.exercicio2.entities.ProtutoImportado;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        List<Produto> listProdutos = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int qtdProd = scanner.nextInt();

        for (int i = 1; i <= qtdProd; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Novo, Usado ou Importado (N/U/I)? ");
            char tipo = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            Double preco = scanner.nextDouble();

            if (tipo == 'N') {
                Produto prod = new Produto(nome, preco);
                listProdutos.add(prod);
            }
            if (tipo == 'I') {
                System.out.print("Taxa alfandegaria: ");
                Double tx = scanner.nextDouble();

                Produto prod = new ProtutoImportado(nome, preco, tx);
                listProdutos.add(prod);
            }
            if (tipo == 'U') {
                System.out.print("Data de fabricação (dd/mm/aaaa): ");
                Date data = sdf.parse(scanner.next());

                Produto prod = new ProdutoUsado(nome, preco, data);
                listProdutos.add(prod);
            }
        }

        System.out.println("\nEtiqueta dos produtos:");
        for (Produto produto : listProdutos) {
            System.out.println(produto.etiquetaPreco());
        }
        System.out.println();

        scanner.close();

    }
}
