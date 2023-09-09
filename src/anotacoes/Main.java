package anotacoes;
import java.util.Locale;

public class Main{

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;

		System.out.print("Ola mundo!");
		System.out.println(y);
		System.out.println(x);

		System.out.printf("%.2f%n", x); // Limitando a quantidade de casas decimais
		System.out.printf("%.4f%n", x); 
		System.out.println("Bom dia!");
		
		Locale.setDefault(Locale.US); // Alterando a formatação do texto, para usar ponto ao inves de virgula. Padrão pt-br para US
		System.out.printf("%.4f%n", x);

		//Concatenação de varios elementos
		System.out.println("Resultado = " + x + " Metros"); // com println
		System.out.printf("Resultado = %.2f metros%n", x); // com printf

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		/*
		 * %s = texto
		 * %d = inteiro
		 * %.2f = float, o numero indica a qtd de casas decimais
		 * %n = quebra de linha
		 */


		
		 


	}
}
