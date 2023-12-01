# Estrutura try-catch

* Bloco try
  * Contém o código que representa a execução a normal do trecho de código que **pode** acarretar em uma exceção.

* Bloco catch
  * Contém o código a ser executado caso uma exceção ocorra.
  * Deve ser especificado o tipo da exceção a ser tratada(upcasting é permitido).

**Exemplo de sintaxe**

``` Java
try{
    bloco de código
}
catch(ExceptionType e){
    bloco de código
}
catch(ExceptionType e){
    bloco de código
}
catch(ExceptionType e){
    bloco de código
}
```