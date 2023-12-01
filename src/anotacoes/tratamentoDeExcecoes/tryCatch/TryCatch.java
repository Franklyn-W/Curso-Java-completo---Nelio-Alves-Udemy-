package anotacoes.tratamentoDeExcecoes.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{

            
            String[] vect = sc.nextLine().split(" ");
            
            int position = sc.nextInt();
            // InputMismatchException = possibilidade de erro caso o usuário digite uma letra ao invés de um numero
            
            System.out.println(vect[position]);
            // ArrayIndexOutOfBoundsException: possibilidade de erro caso o usuário tente acessar uma posição que não existe no array
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position.");
        }
        catch(InputMismatchException e){
            System.out.println("Input error.");
        }

        System.out.println("End of program");
        // Caso ocorra qualquer exception acima, essa mensagem não será exibida, pois a aplicação será encerrada


        sc.close();
    }
    
}
