# Universal Backend

## Descrição

O Universal Backend é uma aplicação backend desenvolvida em **Spring Boot** com **Kotlin**, projetada para facilitar a criação e gerenciamento de operações CRUD de maneira genérica. Este projeto tem como objetivo oferecer uma base modular, escalável e bem documentada para sistemas backend.

---

## Recursos

- Estrutura genérica para operações CRUD.
- Suporte a múltiplos bancos de dados:
  - **H2 (padrão para testes)**
  - **MySQL**
  - **PostgreSQL**
  - Outros podem ser configurados facilmente.
- Documentação automática de APIs com **SpringDoc OpenAPI**.
- Modularidade para adicionar novas entidades de forma rápida.
- Baseado em **Kotlin**, aproveitando todas as suas vantagens de sintaxe e segurança.
- Suporte a validação de dados com o Spring Validator.
- Configuração de perfis (`application.yml`) para múltiplos ambientes.

---

## Pré-requisitos

Certifique-se de ter instalado:

- **Java 17** ou superior
- **Maven**
- **Kotlin** (opcional, integrado via Maven)
- Banco de dados (opcional para produção)

---

## Configuração e Execução

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/ruancrdz/universal-backend.git
cd universal-backend
```

Passo 2: Configurar o Banco de Dados

No arquivo src/main/resources/application.yml, configure o banco de dados desejado. Por padrão, o projeto usa o banco H2.

Exemplo para MySQL:
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/sua-base
    username: seu-usuario
    password: sua-senha
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
Passo 3: Executar o Projeto

Compile o projeto com o Maven:
```bash
mvn clean install
```
Execute a aplicação:
mvn spring-boot:run
Acesse a aplicação no navegador em: http://localhost:8080
Documentação da API

Acesse a interface interativa do Swagger para explorar os endpoints disponíveis:

    URL: http://localhost:8080/swagger-ui.html

Estrutura do Projeto
```bash
src
├── main
│   ├── kotlin/com/universalbackend
│   │   ├── core          # Componentes genéricos de CRUD (Controller, Service, etc.)
│   │   ├── modules       # Módulos específicos (exemplo: client, football, etc.)
│   │   └── common        # Classes comuns (exemplo: ApiResponse, ErrorMessages)
│   └── resources
│       ├── application.yml   # Configuração da aplicação
│       └── db/migration      # Scripts SQL para migração de banco (Flyway, opcional)
├── test                     # Testes unitários
└── pom.xml                  # Configuração do Maven
```
Contribuição

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

Faça um fork do repositório.
Crie uma branch para sua feature/bugfix:

    git checkout -b minha-feature

Envie um pull request.

Tecnologias Utilizadas

    Spring Boot
    Kotlin
    Spring Data JPA
    SpringDoc OpenAPI
    H2 / MySQL / PostgreSQL
    Maven

Contato

Para dúvidas ou sugestões, entre em contato:

    Nome: Ruan Cardozo Montanari
    Email: ruancrdz2004@gmail.com
    GitHub: https://github.com/ruancrdz


---
