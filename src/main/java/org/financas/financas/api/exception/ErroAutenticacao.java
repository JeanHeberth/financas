package org.financas.financas.api.exception;

public class ErroAutenticacao extends RuntimeException {

    public ErroAutenticacao(String messagem) {
        super(messagem);
    }
}
