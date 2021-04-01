# Spring Boot REST API

## Spring Boot REST api para gerenciar alocação de profissionais em projetos

[![GitHub license](https://img.shields.io/github/license/Pietrogon/todo-list)](https://github.com/Pietrogon/spring-boot-rest-api/blob/main/LICENSE)

<p align="center">
 <a href="#Projeto">Projeto</a> •
 <a href="#Tecnologias">Tecnologias</a> •
 <a href="#-rodando-a-database-mysql">Rodando o Back End</a> • 
 <a href="#-rodando-o-servidor">Rodando o Back End</a> • 
 <a href="#Autor">Autor</a>
</p>

<h4 align="center"> 
	🚧  Em construção...  🚧
</h4>

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring Boot](https://start.spring.io/)
- [Docker](https://www.docker.com/)
- [MySQL](https://www.mysql.com/)

### 🎲 Rodando a Database MySQL

```bash
# Clone este repositório
$ git clone https://github.com/Pietrogon/spring-boot-rest-api

# Entrar na pasta do projeto
$ cd spring-boot-rest-api

# Montar o Docker
$ docker build -t projectdb .

# Rodando o MySQL
$ docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=ProjectDB -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin projectdb
```

### 🎲 Rodando o Servidor

```bash
# Clone este repositório
$ git clone https://github.com/Pietrogon/spring-boot-rest-api

# Entrar na pasta do projeto
$ cd spring-boot-rest-api
```

### Autor
---
Feito com ❤️
👋🏽 Entre em contato!

<a href="https://www.linkedin.com/in/pietrogon/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/50971136?s=460&u=c34b99858602c2e9d81aeb015275268d35d3c733&v=4" width="100px;" alt=""/>
</a>
</br>
<a href="https://www.linkedin.com/in/pietrogon/">
Pietro Gonçalves
</a>

[![Linkedin Badge](https://img.shields.io/badge/-Pietrogon-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/pietrogon/)](https://www.linkedin.com/in/pietrogon/) 
[![Gmail Badge](https://img.shields.io/badge/-pietrogon@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:pietrogon@gmail.com)](mailto:pietrogon@gmail.com)