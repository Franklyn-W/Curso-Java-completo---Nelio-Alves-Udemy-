package exercicios.repetitivas;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        /*
         * 1 - Alcool
         * 2 - Gasolina
         * 3 - Diesel
         * 4 - sysout (Muito Obrigado)
         */

        Scanner leitor = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Qual seu combustivel preferido? ");
        System.out.println("1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Fim");

        int combustivelPreferido = leitor.nextInt();

        while (combustivelPreferido != 4) {
            switch (combustivelPreferido) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            
            System.out.println("Qual seu combustivel preferido? ");
            System.out.println("1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Fim");
            combustivelPreferido = leitor.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);

        leitor.close();
    }
}
