# DesignPatterns-CepAPI
Este repositório contém 2 projetos Java, um em Maven e outro em Spring. 
O projeto Maven "learn-design_patterns-java" apresenta a ideia de padrões de projeto, 
enquanto o projeto Spring "stdyproject-cep_api-spring" é uma demonstração de como 
eles são utilizados na prática.

## learn-design_patterns-java
Este projeto apresenta a ideia dos padrões de projeto Singleton, 
Lazy Singleton, Eager Singleton e Holder Singleton. 
Além disso, o projeto demonstra o uso dos padrões de projeto Strategy e Facade, 
todos implementados na classe "App.java" de forma clara e objetiva. 
Cada padrão está separado em sua própria pasta, permitindo uma fácil navegação 
e compreensão do código.

## stdyproject-cep_api-spring
Este projeto é uma demonstração de como é feita a utilização de uma API para 
recuperar informações sobre CEP (Código de Endereçamento Postal) através 
do consumo de outra API "viacep.com.br/ws/". Aqui você pode ver como 
a lógica funciona por debaixo dos panos e como é feita a integração dessas APIs.

O projeto stdyproject-cep_api-spring demonstra o uso da API REST 
utilizando CRUD (Create, Read, Update, Delete). O banco de dados utilizado é o PostgreSQL, 
que foi implementado com o uso do Docker e pgAdmin. 
Os métodos GET, POST, PUT e DELETE estão diretamente conectados ao banco de dados, 
permitindo a criação, leitura, atualização e exclusão de dados.

Este projeto requer que você tenha o Docker instalado em sua máquina. 
Para iniciar, basta acessar a pasta "docker" do repositório e 
digitar "docker-compose up -d" no terminal. Isso iniciará o banco de dados PostgreSQL. 
Quando o banco de dados estiver pronto, basta iniciar o projeto Spring. 
Para acessar a documentação com Swagger, adicione "localhost:8080/swagger-ui/index.html", 
à URL após iniciar o projeto.
