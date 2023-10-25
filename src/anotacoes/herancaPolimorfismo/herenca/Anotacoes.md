# Anotações

## Casting

* Upcasting
  * Casting da sublasse para superclasse
  * Uso comum: polimorfismo


* Downcasting
  * Casting da superclasse para subclasse
  * Uso do metodo instanceOf()
  * Uso comum: métodos que recebem parametros genericos (Ex. Equals)

## Sobreposicao ou sobrescrita

* É a implementação de um metodo de uma superclase na subclasse  

* É fortemente recomendavel usar a anotacao __@Override__ em um metodo sobrescrito
  * Facilita a leituraa e compreensao do codigo
  * Avisamos ao compilador (boa pratica)

## Classes e metodos final

* Palavra chave: __final__
* Clase: Evita que a classe seja herdada
    ```java 
    public final class SavingAccount{}
    ```

* Metodo: evita que o metodo seja sobreposto

### Porquê?
* Segurança: dependendo das regras de negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.
  * Geralmente convém acrescentar __final__ em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências.

* Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução
  * Exemplo: String.