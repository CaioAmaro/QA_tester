package com.caioamaro.QA_tester.domain.autor;

import com.caioamaro.QA_tester.exception.CriacaoAutorNomeNull;
import com.caioamaro.QA_tester.exception.CriacaoAutorNomeVazioException;
import com.caioamaro.QA_tester.web.dto.autor.CreateAutorDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AutorServiceTest {

    @Mock
    private AutorRepository autorRepository;

    @InjectMocks
    private AutorService autorService;

    @Test
    void deveCriarAutorComSucesso(){
        //Var
        Long id = 1L;
        String name = "Machado de Assis";

        //TRIPLE A

        //ARRANGE
        CreateAutorDTO autor = new CreateAutorDTO(name);
        Autor autorEsperado = new Autor(id, name);
        when(autorRepository.save(any(Autor.class))).thenReturn(autorEsperado);

        //ACT
        Autor resultado = autorService.criar(autor);

        //ASSERT
        assertThat(resultado)
                .isNotNull()
                .extracting(Autor::getId, Autor::getName)
                .containsExactly(id, name);
    }

    @Test
    void deveLancarExceptionCriarNomeVazio(){
        //ARRANGE
        CreateAutorDTO autorNomeVazio = new CreateAutorDTO("");

        //ACT E ASSERT
        Exception exception = assertThrows(CriacaoAutorNomeVazioException.class, () -> autorService.criar(autorNomeVazio));

        assertThat(exception.getMessage()).isEqualTo("Nome do Autor encontra-se vazio porem é obrigatorio para criação.");
    }

    @Test
    void deveLancarExceptionCriarAutorNomeNull(){
        CreateAutorDTO autorNomeNull = new CreateAutorDTO(null);

        Exception exception = assertThrows(CriacaoAutorNomeNull.class, () -> autorService.criar(autorNomeNull));

        assertThat(exception.getMessage()).isEqualTo("Nome do Autor encontra-se Nulo porem é obrigatorio para criação");
    }

}
