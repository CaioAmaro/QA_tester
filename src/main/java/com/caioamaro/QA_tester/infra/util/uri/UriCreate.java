package com.caioamaro.QA_tester.infra.util.uri;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Component
public class UriCreate {

    public URI buildLocation(Long id){

        return ServletUriComponentsBuilder
                .fromCurrentRequest() //URL REQUISIÇÃO ATUAL
                .path("/{id}") //ADICIONA NA URL
                .buildAndExpand(id) // COLOCA O VALOR DO ID
                .toUri(); //TRANSFORMA PRA URI
    }
}
