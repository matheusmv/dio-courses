# Banco de Dados com Java

Um Banco de Dados armazena dados de forma estruturada, tornando o acesso e atualização dos dados mais rápido,
pois aumenta a eficiência computacional (menor "gasto" de memória, processamento e tempo).

## Introdução ao JDBC

JDBC (Java Database Connectivity) é uma API com diversas classes e interfaces escritas na linguagem Java que estão
presentes nos pacotes java.sql e javax.sql. Elas permitem que programas em Java realizem conexões em bancos de
dados para realizar consultas. Uma dessas classes principais é o driver JDBC que intermedia essa interação.

Sem API JDBC, seria necessário conhecer o protocolo proprietário de cada banco de dados qpara se conectar e
realizar consultas. Já com a API JDBC, é utilizada somente uma interface Java para qualquer banco de dados, 
deixando o driver implementar as especificações de cada banco de dados, enquanto o desenvolvedor se preocupa apenas
em selecionar um driver e criar as consultas.

- Classes e Intefaces:

    - Classe DriverManager: responsável pela comunicação com os drivers disponíveis. É utilizada para criar uma
    Connection com o banco de dados através de uma URL que especifica o driver, a localização e o nome do Banco de
    dados.

    - Interface Connection: representa a conexão com o banco de dados. Permite criar Statements que constroem
    consultas SQL.

    - Interface Statement: executar comandos SQL comuns.

    - PreparedStatement: executar comandos SQL parametrizáveis.

        ***Obs.: Preferir PreparedStatement ao Statement quando for parametrizar a consulta***
        ***- Previne SQL Injection***
        ***- Melhora legibilidade***
        ***- Melhora desempenho***

    - CallableStatement: executar stored procedures.

    - Existem 3 métodos para executar comandos SQL:

        - execute: pode executar qualquer tipo de SQL
        - executeQuery: usado para executar "SELECT"
        - executeUpdate: usado para comandos de alteração de bando de dados (INSERT, UPDATE, DELETE, CREATE, ALTER)

    - ResultSet: objeto que contem os dados de uma determinada consulta no banco de dados.

        - São utilizados os métodos getters para buscar dados do ResultSet. Tais como: getInt, getFloat e getString
        - O método next() é utilizado para percorrer os registros do ResultSet.

## JPA


