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

Um problema de produtividade começou a ser notado no desenvolvimento de aplicações Web Java. Os desenvolvedores
perceberam que a maior parte do tempo era gasto com queries SQL através do JDBC.

Um outro problema percebido era a mudança de paradigma. A programação orientada a objetos é diferente do esquema
entidade relacional, sendo necessário esquematizar dois modelos para um mesmo sistema.

Como solução para esses 2 problemas, foi proposto um modelo de mapeamento chamado Mapeamento Objeto Relacional 
(ORM) para representar tabelas de um banco de dados relacional através de classes Java.

    Tabela <---> Classe
    Coluna <---> Atributo
    Registro <---> Objeto

Para padronizar as interfaces das implementações ORM foi criada uma especificação oficial chamada JPA. Ela descreve
como deve ser o comportamento dos frameworks Java ORM que desejarem implementar a sua especificação. Logo somente
com a especificação JPA não será possível executar operações entre a aplicação e o banco de dados.

Apesar de ser somente a especificação, o JPA possui algumas classes, interfaces e anotações que ajudam o
desenvolvedor a abstrair o código. Esses artefatos estão presentes no pacote javax.persistence que ajudam a 
manter o código independente da implementação utilizada.

Entre os principais artefatos do JPA, podem ser destacados:

- Anotação @Entity: indica a aplicação que os objetos da classe especificada serão persistidos no banco de dados.
Também podem ser utilizadas outras anotações para auxiliar no mapeamento da classe, tais como:
    - @Id: é obrigatório especificar ao menos uma id para a entidade.
    - @Column: é uma anotação opcional. Por padrão o atributo da entidade é usado para realizar o mapeamento com o
    nome da coluna do banco de dados. Essa anotação será necessária caso os atributos da entidade sejam diferentes
    das colunas do banco de dados.
    - @Table: é uma anotação opcional. Por padrão o nome da entidade é usado para realizar o mapeamento com o nome
    da tabela do banco de dados. Essa anotação será necessária caso o nome da entidade seja diferente do nome da
    tabela no banco de dados.

- Anotações para representar relacionamentos entre tabelas do banco de dados:
    - @ManyToMany
    - @ManyToOne
    - @OneToMany
    - @OneToOne

Nas anotações de relacionamento, a propriedade "fetch" exige atenção especial do desenvolvedor. Seus possíveis
valores são eager (ansioso) ou lazy (preguiçoso). Suas características são:
    
- Eager: a entidade mapeada com esse atributo sempre será carregada na aplicação quando a entidade que está
mapeando for consultada, mesmo que nunca seja utilizada durante a execução da aplicação.

- Lazy: a entidade mapeada com esse atributo somente será carregada na aplicação quando esta for explicitamente
consultada pela entidade que está mapeando (é o mais aconselhável de usar caso não se saiba, em um primeiro
momento, o real número de frequência de consultas).

Para persistir dados com as entidades mapeadas, é obrigatório iniciar uma transação. Para podermos manipular
transações, é necessário utilizar o seguinte método do entityManager:

- getTransaction: retorna uma EntityTransaction, sendo obrigatório o seu uso ao utilizar algum método que realize
transações no banco de dados. Pode utilizar os seguintes métodos:
    - begin: inicia uma transação.
    - commit: finaliza uma transação, persistindo todos os dados que foram modificados desde o inicio da transação.
    - rollback: finaliza uma transação, revertendo todos os dados que foram modificados desde o inicio da
    transação.

Os principais métodos do entityManager para interagir com as entidades são:

- find: retorna a entidade que está persistida no banco de dados através da sua chave primária.
- persist: presiste a entidade no banco de dados (É necessário ter iniciado um transação).
- remove: apaga a entidade do banco e dados (É necessário ter iniciado um transação).

### Implementações do JPA (Hibernate e EclipseLink)

- Hibernate: é uma ferramenta ORM open source e é a lider de mercado, sendo a inspiração para a especificação JPA.
O Hibernate nasceu sem JPA e tinha sua própria implementação ORM, porém as versões atuais já possuem 
compatibilidade com a especificação JPA e são mais aconselhaveis de usar do que a implementação nativa.

- EclipseLink: é um projeto open source de persistência da Eclipse Foundation. Ele é a implementação de referência
do JPA, além de permitir desenvolvedores interagirem com vários serviços de data, incluindo banco de dados, web
services, OXM, EIS. Alguns padrões suportados pelo EclipseLink são: JPA, JAXB, JCA, SOD.

### Linguagens de consulta orientada a objetos

O JPQL (Java Persistence Query Language) é uma linguagem de consulta independente orientada a objetos definida pelo
JPA.

JPQL é usado para realizar consultas no banco de dados. É inspirado no SQL, porém ele interage com o banco de dados
através das entidades do JPA, ao invés de interagir diretamente nas tabelas de banco de dados.

Com o JPQL é possível utilizar as propriedades de orientação a objetos nas consultas realizadas no banco de dados,
através das entidades mapeadas, tal como herança.

Vantagens ao utilizar JPQL em relação aos métodos básicos de gestão de entidade do EntityManager:

- Operações de busca, atualização e remoção de entidades em massa, ao invés de realizar operações em apenas uma
instância por vez através de chaves primárias.

- Realizar consultas mais complexas.

- Realizar funções de agregação.

Vantagens ao utilizar o JPQL em relação ao SQL são:

- Não é necessário realizar joins explicitamente entre entidades que estão com anotações de relacionamento, pois
os joins são criados automaticamente durante a consulta.

- JPQL utiliza as funcionalidades de carregamento "lazy / eager" nos relacionamentos entre entidades, aumentando a
eficiência das consultas na aplicação.

- As consultas podem ser armazenadas em cache para melhor desempenho da aplicação.

Além do JPQL, existem outras linguagens para realizar consultas através dos frameworks ORM:

- HQL: Hibernate Query Language.
- EQL: EclipseLink Query Language.

Existe uma alternativa a consultas JPQL a partir do JPA 2.0 chamada JPA Criteria API, que é muito útil para
construir consultas dinâmicas.

No JPQL as consultas só são verificadas no momento da execução, não sendo possível detectar erros de sintaxe na
consulta durante a compilação. Já o JPA Criteria API consegue detectar esses erros no momento de compilação.

Essa funcionalidade se torna possível por que no JPA Criteria API as consultas são definidas como instância de
objetos Java que representam elementos de consulta. Já as consultas JPQL são definidas apenas como "string".

O JPA Criteria API é mais complicado de se utilizar do que o JPQL. Sendo assim, para consultas estáticas simples,
é preferível utilizar o JPQL, enquanto que para consultas dinâmicas é preferível o JPA Criteria API.

Em relação a eficiência, tanto consultas JPQL quanto consultas JPA Criteria são equivalentes em poder e eficiência.

### JPA Criteria API

Para verificar os erros em tempo de compilação, é necessário utilizar o JPA Metamodel para referenciar os atributos
das entidades.

O JPA Metamodel provê a habilidade de examinar o modelo de persistência de um objeto para consultar os detalhes de
uma entidade JPA. Para cada entidade, uma classe metamodelo é criada com o mesmo nome da classe, porém procedido
pelo símbolo _ (underscore) e com os atributos estáticos que representam os campos de persistência.

Sem o JPA Metamodel, os atributos serão referenciados através de String, tendo como principal desvantagem o risco
de ocorrer algum erro em tempo de execução para o usuário final.
