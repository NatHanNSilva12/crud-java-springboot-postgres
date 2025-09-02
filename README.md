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
```bash
CREATE DATABASE productdb;
```

Configure suas credenciais no src/main/resources/application.properties:
```bash

spring.datasource.url=jdbc:postgresql://localhost:5432/productdb
spring.datasource.username=postgres
spring.datasource.password=senha123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```


# Inicie o projeto com:

    mvn spring-boot:run

    A API estará disponível em http://localhost:8080/api/products

# Endpoints (Insomnia / Postman)

GET todos produtos:

    URL: http://localhost:8080/api/products
    Response: Lista todos produtos salvos.

GET produto por Id:

    URL: http://localhost:8080/api/products/{id}
    Response: Busca o produto pelo Id.

POST criar um novo produto:

    URL: http://localhost:8080/api/products
    Body: { "name": "Laptop", "description": "A high-performance laptop.", "price": 1200.00 }

PUT update de um produto existente:

    URL: http://localhost:8080/api/products/{id}
    Body: { "name": "Updated Laptop", "description": "An updated high-performance laptop.", "price": 1300.00 }

DELETE um produto:

    URL: http://localhost:8080/api/products/{id}
    Response: No content (HTTP 204).

# Licença

Este projeto é só um estudo, fique à vontade pra usar como base ou evoluir. Se quiser colocar alguma licença, manda aí que a gente já adiciona.
