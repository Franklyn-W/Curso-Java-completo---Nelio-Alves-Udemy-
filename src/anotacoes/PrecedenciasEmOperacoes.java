package anotacoes;

public class PrecedenciasEmOperacoes {

	public static void main(String[] args) {
		
		//teste de precedencias em expressoes matematicas
		System.out.println("Precedencias em operacoes matematicas");
		System.out.println("2*6/3 = " + 2*6/3);
		System.out.println("3+2*4 = " + (3+2*4));
		System.out.println("(3+2)*4 = " + (3+2)*4);
		System.out.println("60/(3+2)*4 = " + 60/(3+2)*4);
		System.out.println("60/((3+2)*4) = " + 60/((3+2)*4));
		System.out.println("Prioriadade da esquerda para a direita, operação entre parenteses tem prioridade maxima");
		System.out.println("Primeiro: *(Multiplicacao), /(Divisao), %(Modulo de divisao)");
		System.out.println("Segundo: +(Soma), -(Subtracao) \n");
		
		//Utilizando operador mod
		System.out.println("Utilizando o operador mod (Resto da divisão)");
		System.out.println("14 % 3 = " + 14%3);
		System.out.println("19 % 5 = " + 19%5);
	}

}
