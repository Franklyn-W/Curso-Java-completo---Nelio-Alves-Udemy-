# Bloco finally

* é um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
* Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.

**Sintaxe**

```Java
try {
    bloco de código
}
catch (ExceptionType e){
    bloco de código
}
finally{
    bloco de código
}
```