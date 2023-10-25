# Anotações sobre Herança e Polimorfismo

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

## Polimorfismo



Em POO, polimorfismo é um recurso que permite que varáveis de um mesmo tipo mais génerico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.

``` java
Conta x = new Conta(1020, "Alex");
Conta y = new Poupanca(1023, "Maria", 0.01);

x.saque(50.0);
y.saque(50.0)
```
``` java
//Conta:
public void saque (double valor){
  saldo -= valor + 5.0
}

//Poupança
public void saque (double valor){
  saldo -= valor
}
```

* A associação do tipo específico com o tipo generico é feita em tempo de execução(upcasting).
* O compilador não sabe para qual tipo específico a chamada do método saque esta sendo feita, ele só sabe que as duas variáveis (x e y) são do tipo Conta.





***

[Dicas de formatação de .md](https://medium.com/walternascimentobarroso-pt/curso-r%C3%A1pido-de-markdown-4af49e3bfa65, "Dicas de markdown")

