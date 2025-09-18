package com.caioamaro.QA_tester.exception;

public class CriacaoAutorNomeNull extends RuntimeException {
    public CriacaoAutorNomeNull() {
        super("Nome do Autor encontra-se Nulo porem é obrigatorio para criação");
    }
}
