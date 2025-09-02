# CRUD de Produtos com Spring Boot e PostgreSQL

Um projeto simples de API REST para gerenciar produtos (CRUD). Usei Java 17, Spring Boot, Spring Data JPA e PostgreSQL. O projeto segue uma arquitetura em **três camadas** (controller → service → repository) e usa `record` como DTO.

---

## 📚 Tecnologias

- **Java 17+**
- **Spring Boot** (versão 3.x)
- **Spring Data JPA**
- **PostgreSQL**
- **Maven** para gerenciamento de dependências
- **Postman** ou **Insomnia** para testes da API
- Eventualmente: **DevTools** pro hot reload no desenvolvimento.

---

##  Como rodar localmente

1. Clone este repositório:
   ```bash
   git clone https://github.com/NatHanNSilva12/crud-java-springboot-postgres.git
   cd crud-java-springboot-postgres

    Crie o banco de dados no PostgreSQL (por ex. via psql ou pgAdmin):
   CREATE DATABASE productdb;


Configure suas credenciais no src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/productdb
spring.datasource.username=postgres
spring.datasource.password=senha123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Inicie o projeto com:

    mvn spring-boot:run

    A API estará disponível em http://localhost:8080/api/products

# Endpoints (Insomnia / Postman)

Use Endpoints como estes—sem chaves {} no número.
Método	Endpoint	Descrição
GET	/api/products	Lista todos
GET	/api/products/1	Busca pelo ID
POST	/api/products	Cria (no body: { "name": "...", "description": "...", "price": ... })
PUT	/api/products/1	Atualiza produto
DELETE	/api/products/1	Remove produto
Estrutura do projeto

└── src
    └── main
        └── java
            └── com.example.demo
                ├── controller
                │   └── ProductController.java
                ├── service
                │   └── ProductService.java
                ├── repository
                │   └── ProductRepository.java
                ├── dto
                │   └── ProductDTO.java  (Java record)
                └── model
                    └── Product.java

    Controller: recebe as requisições HTTP

    Service: lógica e conversão entre entity e DTO

    Repository: interface com o banco via Spring Data JPA

    DTO: record ProductDTO(id, name, description, price) pra mapear os dados
    Medium

# Licença

Este projeto é só um estudo, fique à vontade pra usar como base ou evoluir. Se quiser colocar alguma licença, manda aí que a gente já adiciona.
