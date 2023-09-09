package anotacoes;
import java.util.Locale;

public class ExercicioFormatacao {

    public static void main(String[] args) {

        /*
         * Em um novo programa, inicie as seguintes variaveis
         */

        String produto1 = "Computador";
        String produto2 = "Mesa de escritorio";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        /*
         * Em seguida, usando os valores das variaveis, produza a seguinte saida na tela do console:
         * Produtos:
         * Computador, com o preço de R% 2100,00
         * Mesa de escritorio, com o preço de R% 650,50
         * 
         * Registro: 30 anos, codigo 5290 e genero: F
         * 
         * Medida informando ate a oitava casa decimal: 53,23456700
         * Arredondando para 3 casas decimais: 53,235
         * Utilizando padrão US: 53.235
         */

         System.out.println("Produtos");
         System.out.printf("%s, com o preço de R$ %.2f%n", produto1, preco1);
         System.out.printf("%s, com o preço de R$ %.2f%n", produto2, preco2);

         System.out.printf("Cadastro: %d anos de idade, codigo %d e genero: %s%n", idade, codigo, genero);

         System.out.printf("Valor da medida até a oitava casa decimal: %.8f%n", medida);
         System.out.printf("Arrendondado até a terceira casa decimal: %.3f%n", medida);
         System.out.printf(Locale.US,"Convertendo para padrão US: %.3f",medida);
    }
}
