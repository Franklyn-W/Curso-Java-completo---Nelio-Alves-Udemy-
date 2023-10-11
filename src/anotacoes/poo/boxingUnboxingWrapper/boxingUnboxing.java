package anotacoes.poo.boxingUnboxingWrapper;

public class boxingUnboxing {
    
    public static void main(String[] args) {
        
        int x = 20;

        // Object obj = x;
        Integer obj = x;
        System.out.println(obj);

        // int y = (int) obj; // Necessario realizar wrapper quando o objeto instanciado é do tipo Object (pode-se dizer indefinido)
        int y = obj;
        System.out.println(y);
    }
}
