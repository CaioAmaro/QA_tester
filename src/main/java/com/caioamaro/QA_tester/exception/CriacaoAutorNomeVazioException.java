package com.caioamaro.QA_tester.exception;

public class CriacaoAutorNomeVazioException extends RuntimeException {

    public CriacaoAutorNomeVazioException() {
        super("Nome do Autor encontra-se vazio porem é obrigatorio para criação.");
    }

}
