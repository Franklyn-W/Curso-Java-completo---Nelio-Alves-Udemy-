# Classes Abstratas

* São classes que **não** podem ser instanciadas.
* É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata.

#### Exemplo

Suponha que em um negócio relacionado a banco, apenas contas poupança e contas para empresas são permitidas. Não existe conta comum.

Para garantir que contas comuns não possam ser instanciadas, basta acrescentarmos a palavra *"abstract"* na declaração da classe

``` Java
public abstract class Account{
    ...
    }
```

Na UML o nome de uma classe abstrata deve ser em *itálico*

Para esta aula foi reaproveitado o código da pasta [Aula sobre Herança](src\anotacoes\herancaPolimorfismo\herenca)

### Questionamento
* Se a classe Conta não pode ser instanciada, por que simplesmente não criar somente Poupança e ContaJuridica ?
* Resposta:
  * **Reuso**
  * **Polimorfismo**: a superclasse classe genérica nos permite tratar de foma fácil e uniforme todos os tipos de conta, inclusive com polimorfismo se for o caso (como foi feito nos últimos exercícios). Por exemplo, você pode colocar todos os tipos de contas em uma mesma coleção.
* Demo: suponha que você queira:
  * Totalizar o saldo de todas as contas.
  * Depositar 10.00 em todas as contas.

inheritance