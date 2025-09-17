package com.caioamaro.QA_tester.domain.autor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AutorServiceTest {

    @Mock
    private AutorRepository autorRepository;

    @InjectMocks
    private AutorService autorService;

    @Test
    void deveSalvarUmAutorComSucesso(){
        //Var
        Long id = 1L;
        String name = "Machado de Assis";

        //TRIPLE A

        //ARRANGE
        Autor autorSalvo = new Autor(name);
        Autor autorEsperado = new Autor(id, name);
        when(autorRepository.save(any(Autor.class))).thenReturn(autorEsperado);

        //ACT
        Autor resultado = autorService.salvar(autorSalvo);

        //ASSERT
        assertThat(resultado)
                .isNotNull()
                .extracting(Autor::getId, Autor::getName)
                .containsExactly(id, name);
    }


}
