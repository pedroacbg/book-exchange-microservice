# 📚 Book Exchange Microservices

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Docker](https://img.shields.io/badge/Docker-Containerized-blue)
![Architecture](https://img.shields.io/badge/Architecture-Microservices-purple)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

Sistema backend baseado em **arquitetura de microsserviços** para gerenciamento de **troca e aluguel de livros entre usuários**.

O projeto foi desenvolvido com o objetivo de demonstrar a construção de um sistema distribuído utilizando **Java e Spring Boot**, aplicando conceitos modernos de **microservices architecture**, **REST APIs** e **containerização com Docker**.

---

# 🚀 Tecnologias Utilizadas

### Backend

* Java 17
* Spring Boot
* Spring Cloud
* Spring Data JPA
* Spring Security

### Banco de Dados

* MySQL

### Infraestrutura

* Docker
* Docker Compose
* Maven

### Ferramentas

* Swagger / OpenAPI
* GitHub
* Postman

---

# 🏗 Arquitetura do Sistema

O sistema segue o padrão de **arquitetura de microsserviços**, onde cada serviço possui responsabilidade específica e pode ser desenvolvido, implantado e escalado de forma independente.

## Serviços do Sistema

### API Gateway

Responsável por centralizar e encaminhar todas as requisições para os microsserviços internos.

### User Service

Gerencia os usuários da plataforma.

Responsabilidades:

* cadastro de usuários
* autenticação
* gerenciamento de perfis

### Book Service

Gerencia o catálogo de livros disponíveis.

Responsabilidades:

* cadastro de livros
* atualização de informações
* consulta de livros disponíveis

### Exchange Service

Gerencia as operações de troca ou aluguel entre usuários.

Responsabilidades:

* solicitação de troca
* gerenciamento de alugueis
* histórico de transações

---

# 📊 Arquitetura (Visão Simplificada)

Client  
    │  
    ▼  
API Gateway  
    │  
    ▼  
User Service | Book Service | Exchange Service

Cada serviço possui:

* banco de dados próprio
* API REST independente
* deploy isolado

---

# 📁 Estrutura do Projeto

book-exchange-microservice

```
api-gateway
user-service
book-service
exchange-service
docker-compose.yml
```

Cada serviço contém:

* Controller
* Service
* Repository
* Entity
* Configurations

Seguindo boas práticas de organização de projetos **Spring Boot**.

---

# ⚙️ Como executar o projeto

## 1️⃣ Clonar o repositório

git clone https://github.com/pedroacbg/book-exchange-microservice

## 2️⃣ Entrar no diretório

cd book-exchange-microservice

## 3️⃣ Executar com Docker

docker-compose up -d

Isso iniciará todos os microsserviços e bancos de dados necessários.

---

# 🌐 Documentação da API

Após iniciar o sistema, a documentação pode ser acessada via **Swagger**.

Exemplo:

http://localhost:8080/swagger-ui.html

---

# 📌 Principais Funcionalidades

* Cadastro e gerenciamento de usuários
* Cadastro de livros
* Sistema de aluguel de livros
* Sistema de troca de livros entre usuários
* Comunicação entre microsserviços via REST
* Arquitetura baseada em microsserviços
* APIs documentadas com Swagger

---

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em estudo e prática dos seguintes conceitos:

* Arquitetura de microsserviços
* Desenvolvimento de APIs REST com Spring Boot
* Comunicação entre serviços
* Containerização com Docker
* Boas práticas de backend

---

# 👨‍💻 Autor

Pedro Augusto Costa Anjos

LinkedIn
https://www.linkedin.com/in/pedroacbg/

GitHub
https://github.com/pedroacbg
