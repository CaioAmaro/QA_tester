# API de Gerenciamento de Biblioteca 📖

![Status do Build](https://img.shields.io/badge/build-passing-brightgreen)
![Linguagem](https://img.shields.io/badge/language-Java%2017-blue)
![Framework](https://img.shields.io/badge/framework-Spring%20Boot%203-green)
![Licença](https://img.shields.io/badge/license-MIT-informational)

## 🎯 Sobre o Projeto

Este projeto consiste em uma API RESTful para o gerenciamento de uma biblioteca, permitindo operações de CRUD (Criar, Ler, Atualizar, Deletar) para Livros e Autores.

O principal objetivo deste projeto foi aplicar e solidificar conhecimentos em **Qualidade de Software e Automação de Testes**, utilizando uma abordagem guiada por testes desde o início do desenvolvimento (**TDD**) e validando as funcionalidades com testes de integração. Este repositório serve como um portfólio prático de minhas habilidades em QA e desenvolvimento backend.

---

## ✨ Funcionalidades

- [✔] CRUD completo para Autores.
- [✔] CRUD completo para Livros.
- [✔] Associação de Livros a Autores existentes.
- [✔] Regra de negócio para impedir a exclusão de Autores com Livros associados.
- [✔] Validação de dados de entrada.

---

## 🛠️ Tecnologias Utilizadas

As seguintes ferramentas e tecnologias foram utilizadas na construção do projeto:

| Ferramenta | Descrição |
|------------|-------------|
| **Java 17** | Linguagem de programação principal. |
| **Spring Boot 3** | Framework para criação da API REST. |
| **Maven** | Gerenciador de dependências e build. |
| **Spring Data JPA**| Camada de persistência de dados. |
| **H2 Database** | Banco de dados em memória para ambiente de desenvolvimento e testes. |
| **JUnit 5** | Framework para a escrita de testes unitários e de integração. |
| **Mockito** | Framework para a criação de mocks em testes unitários. |
| **AssertJ** | Biblioteca de asserções para testes mais fluentes e legíveis. |
| **Lombok** | Biblioteca para reduzir código boilerplate (getters, setters, etc.). |

---

## 🚀 Começando

Siga as instruções abaixo para configurar e executar o projeto em seu ambiente local.

### Pré-requisitos

- [Java 17 (ou superior)](https://www.oracle.com/java/technologies/downloads/)
- [Maven 3.8 (ou superior)](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads/)

### Instalação

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    ```
2.  Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```
3.  Instale as dependências com o Maven:
    ```bash
    mvn clean install
    ```

---

## ▶️ Executando a Aplicação

Para iniciar a API, execute o seguinte comando na raiz do projeto:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

---

## ✅ Executando os Testes

A suíte de testes é uma parte fundamental deste projeto e foi desenvolvida com TDD. Para rodar todos os testes (unitários e de integração), utilize o comando:

```bash
mvn test
```

Um relatório de cobertura de testes pode ser gerado com o plugin JaCoCo (se configurado).

---

## API Endpoints

Abaixo estão os principais endpoints disponíveis na API. Para uma documentação interativa completa, você pode usar ferramentas como o Postman ou Insomnia.

### Autores

| Método | Endpoint     | Descrição                  | Exemplo de Body                               |
|--------|--------------|----------------------------|-----------------------------------------------|
| `POST` | `/autores`   | Cria um novo autor.        | `{"name": "George Orwell"}`                 |
| `GET`  | `/autores`   | Lista todos os autores.    | N/A                                           |
| `GET`  | `/autores/1` | Busca um autor pelo ID.    | N/A                                           |

### Livros

| Método | Endpoint   | Descrição                | Exemplo de Body                                       |
|--------|------------|--------------------------|-------------------------------------------------------|
| `POST` | `/livros`  | Cria um novo livro.      | `{"title": "1984", "author": {"id": 1}}` |
| `GET`  | `/livros`  | Lista todos os livros.   | N/A                                                   |

---

## 👨‍💻 Autor

**[Caio Amaro]**

- LinkedIn: [https://linkedin.com/in/seu-linkedin](https://linkedin.com/in/seu-linkedin)
- GitHub: [https://github.com/seu-usuario](https://github.com/seu-usuario)

---
## Agradecimentos
- Agradeço ao Professor **Nataniel Paiva** e à **Faculdade Gran** pelo excelente material de estudo que serviu de base para este projeto.
