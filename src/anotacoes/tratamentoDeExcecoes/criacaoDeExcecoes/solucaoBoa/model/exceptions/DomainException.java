package anotacoes.tratamentoDeExcecoes.criacaoDeExcecoes.solucaoBoa.model.exceptions;

public class DomainException extends Exception{

    // extends RuntimeException = o compilador não obriga o tratamento da exceção.
    // extend Exception = o compilador obriga a tratar a exceção.

    public DomainException(String msg) {
        super(msg);
    }
    

}
