package com.caioamaro.QA_tester.domain.autor;

import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }

    public Autor salvar(Autor autorSalvo) {


        return autorRepository.save(autorSalvo);
    }
}
