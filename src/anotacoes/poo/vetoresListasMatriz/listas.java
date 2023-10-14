package anotacoes.poo.vetoresListasMatriz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

    /*
     * .size() - retorna o tamanho da lista
     * .add() - Insere item na lista
     * .add(int, obj) - informando posição e item
     * .remove(obj) - Remove objeto especifico da lista
     * .remove(int) - Remove objeto de posicao especifica
     * .removeIf(predicate) - Remove com base em um padrao especifico
     * .indexOf(obj) - Retorna a posição do objeto informado
     * .lastIndexOf(obj) - Retorna a ultima posicao do objeto
     * 
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        list.add(2, "Marco");

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");

        // list.remove("Ana");
        // list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        // Remover todo elemento x, tal que o char na posicao 0 seja igual a M
        // Remover a String da lista, se a primeira letra for igual a M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-------------------------");

        // Mostrar os nomes que comecam com a letra A

        // Para realizar a filtragem diretamente na lista original
        //list.removeIf(x -> x.charAt(0) != 'A');

        List<String> resultado = list.stream()
                // Cria nova lista para armazenar o resultado
                // Converte a lista com todos os nomes em um stream, pois o tipo stream aceita
                // operacoes Lambda
                .filter(x -> x.charAt(0) == 'A')
                // Chamar a funcao filter, que deve receber um predicado (funcao lambda)
                // Filtrando as pessoas que comecam com a letra A
                .collect(Collectors.toList());
                // depois converter novamente o stream para tipo list atraves da classe
                // Collectors

        for (String x : resultado) {
            System.out.println(x);
        }
        System.out.println("-------------------------");

        // Buscando o primeiro nome com a letra A
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //.orElse(null)/.orElse("String") - Retorna nulo caso nao seja localizado nenhum item que atenda a demanda, pode substituir o nulo por uma String
        System.out.println(nome);





    }
}
