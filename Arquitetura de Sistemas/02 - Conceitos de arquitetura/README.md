# Arquitetura de sistemas

## Monolito

Esse modelo é a forma de desenvolver um sistema a fim de que todas as funções estejam em um único processo. Os
diversos módulos do sistema são executados em uma mesma máquina, compartilhando recursos de processamento, 
memória, bancos de dados e arquivos.

Como o sistema está inteiro naquele bloco, o desenvolvimento é mais ágil e é possível subir uma prova de conceito 
(Proof of Concept, ou PoC) ou uma primeira versão (Minimum Viable Product, ou MVP) para validar um produto ou 
negócio. O sistema monolítico é de desenvolvimento e compreensão simplificados, permitindo a execução por uma 
equipe menor e com menos qualificação.

- Vantagens:

    - Baixa complexidade
    - Monitoramento simplificado

- Desvantagens:

    - Stack única
    - Compartilhamento de recursos
    - Acoplamento
    - Escalabilidade complexa

## Microserviços

É uma maneira diferente de organizar e desenvolver softwares que visa criar diversos sistemas independentes, 
mas interligados. Desse modo, cada um dos microsserviços funciona dentro de seu próprio processo, com seu código 
especialista e banco de dados independente.

Os microsserviços podem ser grandes e complexos sistemas interligados em outros microsserviços de diversos 
tamanhos e funcionalidades.

Por ser uma estrutura mais complexa, exige um maior nível de automação das implementações. Além disso, orquestrar 
todos os microsserviços é essencial para que tudo funcione. A complexidade exige desenvolvedores com qualificação 
maior ou, ao menos, uma boa coordenação de DevOps (Desenvolvimento e Operações) para assegurar um bom 
funcionamento.

### Com comunicação direta entre serviços

- Vantagens:

    - Stack dinâmica
    - Simples escalabilidade

- Desvantagens:

    - Acoplamento
    - Monitoramento mais complexo
    - Provisionamento mais complexo

### Utilizando Message Broker para comunicação entre serviços

- Vantagens:

    - Stack dinâmica
    - Simples escalabilidade
    - Desacoplamento

- Desvantagens:

    - Monitoramento mais complexo
    - Provisionamento mais complexo

### Utilizando um gerenciador de pipeline para gerenciar o fluxo de comunicação entre serviços

- Vantagens:

    - Stack dinâmica
    - Simples escalabilidade
    - Desacoplamento
    - Menor complexidade

- Desvantagens:

    - Provisionamento mais complexo
    - Plataforma inteira depende do gerenciador de pipeline

## Gerenciamento de erros e volume de acesso

- Casos com maior complexidade:

    - Processos assíncronos (Comunicação entre serviços utilizando um Message Broker)
    - Gerenciador de Pipeline

- Solução:

    - Dead letter queue
    - Filas de re-tentativas
