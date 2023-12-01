package exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.Circulo;
import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.Formato;
import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.Retangulo;
import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.enums.EnumCores;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Formato> formas = new ArrayList<>();

        System.out.print("Informe o numero de formas: ");
        int qtdFormas = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < qtdFormas; i++) {
            System.out.println("Informe os dados da " + (i + 1) + "ª forma:");
            System.out.print("Forma retangular ou circular (r/c)? ");
            char formato = leitor.next().toLowerCase().charAt(0);
            System.out.print("Qual a cor (PRETO/AZUL/VERMELHO)? ");
            EnumCores cor = EnumCores.valueOf(leitor.next().toUpperCase());

            if (formato == 'r') {
                System.out.print("Lagura: ");
                Double largura = leitor.nextDouble();
                System.out.print("Altura: ");
                Double altura = leitor.nextDouble();

                formas.add(new Retangulo(cor, largura, altura));
            }

            if (formato == 'c') {
                System.out.print("Raio: ");
                Double raio = leitor.nextDouble();

                formas.add(new Circulo(cor, raio));
            }
        }

        System.out.println("\nArea dos formatos informados: ");
        for (Formato formato : formas) {
            System.out.printf("%.2f%n", formato.area());
        }

        leitor.close();
    }
}
