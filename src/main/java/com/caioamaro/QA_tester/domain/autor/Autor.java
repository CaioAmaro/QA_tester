package com.caioamaro.QA_tester.domain.autor;

import com.caioamaro.QA_tester.web.dto.autor.CreateAutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nacionalidade;

    public Autor(CreateAutorDTO dto) {
        this.name = dto.name();
    }
}
