package exercicios.composicao.exercicio1.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicios.composicao.exercicio1.entities.Client;
import exercicios.composicao.exercicio1.entities.Order;
import exercicios.composicao.exercicio1.entities.OrderItem;
import exercicios.composicao.exercicio1.entities.Product;
import exercicios.composicao.exercicio1.entities.enums.OrderStatus;

public class Program {

    /*
     * Ler os dados de um pedido com N itens;
     * N sera fornecido pelo usuario;
     * Mostrar sumario do pedido
     * - O instante do pedido, deve ser o instante do sistema: new Date();
     */

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order Summary: ");
        System.out.println(order);

        sc.close();
    }
}
