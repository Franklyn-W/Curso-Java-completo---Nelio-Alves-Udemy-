# Exceções

* Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa **em execução**.

* Em Java, uma exceção é um objeto herdado da classe:
  * [java.lang.Exception](https://docs.oracle.com/javase/10/docs/api/java/lang/Exception.html) - o compilador obriga a tratar ou propagar.
  * [java.lang.RuntimeException](https://docs.oracle.com/javase/10/docs/api/java/lang/RuntimeException.html) - o compilador não obriga a tratar ou propagar.
  
* Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada(tratada) ou o programa seja encerrado.

## Hierarquia de exceções do Java

A informação completa sobre as hierarquias do Java podem ser obtidas [neste link](https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html)


Todas as exceções e erros estão dentro da superclasse **Throwable**, a partir dela temos algumas classes como **Error** e **Exception**.
* Classe **Error** - São erros que não se espera que o programador trate.
  * **OutOfMemoryError**: Estouro de memória, vai ocasionar a quebra e a paralisação do programa.
  * **VirtualMachineError**: Erro na maquina virtual do Java.

* Classe **Exception**: São os erros que ocorrem no programa e que se espera que o programador trate-as.
  * **IOException**: Erro ocasionado por algum problema relacionado a entrada ou saída de informações no programa
  * **RunTimeException**: Especifica exceções que não necessariamente precisam ser tratadas, são erros que **podem** ocorrer durante a execução do programa.
    * **IndexOutOfBoundsException**: Quando o programa tenta acessar uma posição inexistente em um array.
    * **NullPointerException**: Quando o programa tenta acessar uma variável que esta com valor nulo;

## Por que exceções?

* O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas.
* Vantagens:
  * Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
  * Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
  * A exceção pode carregar dados quaisquer.