package com.caioamaro.QA_tester.domain.autor;

import com.caioamaro.QA_tester.exception.CriacaoAutorNomeNull;
import com.caioamaro.QA_tester.exception.CriacaoAutorNomeVazioException;
import com.caioamaro.QA_tester.web.dto.autor.CreateAutorDTO;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }

    public Autor criar(CreateAutorDTO dto) {

        validacaoCreateAutorDTO(dto);

        Autor autor = new Autor(dto);

        return autorRepository.save(autor);
    }

    private void validacaoCreateAutorDTO(CreateAutorDTO dto){
        if(dto.name() == null){
            throw new CriacaoAutorNomeNull();
        }

        if(dto.name().isBlank()){
            throw new CriacaoAutorNomeVazioException();
        }
    }
}
