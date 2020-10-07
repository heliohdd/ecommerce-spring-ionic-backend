

<h3>
    <a href=https://webservice-spring-jpa-heroku.herokuapp.com/users>Demonstração</a>
</h3>

Observação: Pode ser que a aplicação leve alguns segundos na primeira vez que for ativado o link.

# Índice

- [Sobre](#-sobre)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Estrutura das Entidades](#-estrutura-das-entidades) <!-- [Como testar o projeto no Postman](#-como-usar-o-projeto-no-postman)-->
- [Como baixar o projeto](#-como-baixar-o-projeto)


## 🔖 Sobre

O projeto **[ecommerce-spring-ionic-backend](https://github.com/heliohdd/ecommerce-spring-ionic-backend)** é a implementação de uma **API RESTful** na Plataforma **Heroku** que é um **PaaS**, ou seja, uma plataforma como serviço que oferece recursos de alta **escalabilidade** seguindo o moderno modelo de **containers** que permitem alta **disponibilidade** da aplicação.

Essa é uma versão demonstrativa que disponibiliza os seguintes recursos: ```Categoria``` e seus ```Produtos``` , ```Cliente``` e seu respectivo ```Telefone``` e ```Endereço```, bem como ```Pedido```, formas de ```Pagamento``` preferida, itens do pedido e informações de entrega.

Maiores informações sobre a estrutura das entidades estão na seção [Estrutura das Entidades](#-estrutura-das-entidades).

Esta e uma solução digital da categoria **e-commerce**, contendo todo o workflow essencial à implantação de uma loja virtual. Sua estrutura atende à finalidade básica de ```Cadastro``` de clientes, e ```Registro``` de pedidos contendo informações relacionadas ao histórico de compras e pagamentos bem como  dos produtos adquiridos.

Este projeto apresenta de forma prática a implementação de um modelo conceitual sobre o paradigma **orientado a objetos**, usando boas práticas de desenvolvimento e padrões de mercado.

---

## 🚀 Tecnologias Utilizadas

O projeto foi  desenvolvido utilizando as seguintes tecnologias.
<!--

<h3>
    <img src=Pictures/spring-boot.png>
</h3>

-->

- [Spring Boot](https://spring.io/)
- [Apache Tomcat](http://tomcat.apache.org/)
- [Maven](https://maven.apache.org/)
- [Postman](https://www.postman.com/)
- [H2](https://www.h2database.com/html/main.html)


---

## 🧮 Estrutura das Entidades

Conceitualmente o projeto é formado pelas entidades ```Cliente```, ```Endereço```, ```Cidade``` e ```Estado```; ```Pedido``` e ```Pagamento```;  ```Produto``` e ```Categoria```  sendo estruturadas como exemplos abaixo:

### Cliente

```json
{
    "id": Integer,
    "name": String,
    "email": String,
    "phone": String,
    "password": String
}
```

### Endereço

```json
{
    "id": Integer,
    "logradouro": String,
    "numero": String,
    "complemento": String,
    "bairro": String,
    "cep": String
}
```

### Cidade

```json
{
    "id": Integer,
    "nome": String
}
```

### Estado

```json
{
    "id": Integer,
    "nome": String
}
```

### Pedido

```json
{
    "id": Integer,
    "instante": Date
}
```

### Produto

```json
{
    "id": Integer,
    "nome": String,
    "preco": Double
}
```

### Categoria

```json
{
    "id": Integer,
    "nome": String
}
```



## 📂 Como conferir o projeto na internet

O ***deploy*** do projeto pode ser acessado através deste <a href= https://curso-spring-ionic-hd.herokuapp.com/users>link</a>.

Como este projeto está desenvolvido no **Back-End**, a página retornará o conteúdo no formato **JSON**, o qual é destinado a ser consumido por requisições **HTTP** geradas pelo **Front-End**, que fará a interface com o usuário possibilitando uma experiência visual agradável e a adequada formatação com que a informação será apresentada.

Os links abaixo direcionam para os recursos disponíveis correspondente a cada entidade .

- [Clientes](https://curso-spring-ionic-hd.herokuapp.com/clientes)
- [Pedidos](https://curso-spring-ionic-hd.herokuapp.com/pedidos)
- [Produtos](https://curso-spring-ionic-hd.herokuapp.com/produtos)
- [Categorias](https://curso-spring-ionic-hd.herokuapp.com/categorias)

Obs.: Este projeto implementa o módulo **Spring Security** incluindo as funcionalidades de **Autenticação e Autorização** para acesso aos **endpoints** estando disponível apenas o acesso a **Clientes**. Para acesso a todos os recursos será incluso orientações para a utilização da ferramenta **Postman** a qual permite acesso pleno inclusive através de **token**.

<!--Para acesso utilizando as funções de **Autenticação e Autorização** consultar a seção **[Como testar o projeto no Postman](#-como-usar-o-projeto-no-postman)**. -->

---

<!--## 📂Como testar o projeto no Postman

Esta **API** pode ter toda sua funcionalidade testada através do aplicativo [Postman](https://www.postman.com/) conforme exemplos abaixo.



---

-->

## 📂 Como baixar o projeto

```bash
# Clonar o repositório
$ git clone https://github.com/heliohdd/ecommerce-spring-ionic-backend.git

# Entrar no diretório
$ cd ecommerce-spring-ionic-backend

# Importar projeto através do STS 4 (ou IDE de preferência)

# Iniciar o projeto clicando com o botão direito no arquivo "WebserviceApplication.java" acionando as opção "Run as" e "Spring Boot App".

```

---

Desenvolvido por Hélio Dourado
