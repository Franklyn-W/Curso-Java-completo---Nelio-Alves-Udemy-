package anotacoes;

public class FuncoesString {
    
    /*
     * Principais funcoes para trabalhar com String
     * 
     * Formartar
     *  toLowerCase() - converter tudo para minusculo
     *  toUpperCase() - converter tudo para maiusculo
     *  trim() - remover espacos
     * 
     * Recortar 
     *  substring(inicio) - recortar string indicando apenas inicio
     *  substring(inicio, fim) - recortar string indicando inicio e fim
     * 
     * Substituir
     *  Replace (char, char) - substituir uma letra por outra
     *  Replace(string, string) - substituir uma string por outra
     * 
     * Buscar
     *  IndexOf - indica a localização da string ou letra
     *  LastIndexOf - indica a ultima localização da string ou letra
     * 
     * split(" ") - utilizado para separar strings de uma frase, indicando o item separador
     */

     public static void main(String[] args) {
        

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();

        String s4 = original.substring(2);
        String s5 = original.substring(2, 9);

        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s1 + "-");
        System.out.println("toUpperCase: -" + s2 + "-");
        System.out.println("trim: -" + s3 + "-");

        System.out.println("substring(2): -" + s4 + "-");
        System.out.println("substring(2, 9): -" + s5 + "-");

        System.out.println("replace('a', 'x'): -" + s6 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s7 + "-");

        System.out.println("indexOf(\"bc\"): " + i);
        System.out.println("lastIndexOf(\"bc\"): " + j);

        String s = "batata maca limao laranja";
        String [] vetor = s.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);

        for (String palavra : vetor) {
            System.out.println(palavra);
        }
     }
}
