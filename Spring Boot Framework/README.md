# Spring Boot

- Criado pela Spring Source em 2012.
- Facilita o setup de projetos Spring (Spring Initializr).

    - start.spring.io

- Sem necessidade de criar arquivos de configuração.
- Foco em produtividade.
- Maior tempo no desenvolvimento de valor.

- Dependências auto configuráveis pelo Spring Boot (Starters):

    - spring-boot-starter-web
        - spring-boot-starter
            - spring-boot
            - spring-boot-autoconfigure
            - spring-boot-starter-logging
        - spring-web
        - spring-webmvc
        - spring-boot-starter-tomcat
            - Tomcat-embed-core
            - Tomcat-embed-logging-juli

- Execução simplificada (sem deploy em servidor externo).

## FatJar/ UberJar

- Artefato do projeto pronto para execução.
- Container web embutido na geração e execução (Tomcat).
- Deploy embarcado com outros containers são opcionais.
- Dependências principais do projeto embarcado.

- Execução direta através de um único java -jar:

        mvn 'package' && java -jar target/spring-boot-example-0.1.0.jar

- War:

    - Gradle:

            apply plugin: 'war'

            war {
                baseName = 'myapp'
                version = '0.5.0'
            }
    
    - Maven:

            <packaging>war</packaging>

## Sping Boot Profiles

- Ambientes para desenvolvimento, teste e produção.

- Banco de dados para cada ambiente.

- Execução de testes unitários em ambiente local.

- Suíte de testes completas em ambiente de teste.

- Simulação do ambiente real em staging.

- Deploy simplificado em produção.

## Variáveis de ambiente

- Injetada através da anotação @Value no projeto

        @Value(${NOME_DA_VARIAVEL:VALOR_DEFAULT})
