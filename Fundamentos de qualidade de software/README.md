# Fundamentos de qualidade de software

## O que é Teste de Software?

É um processo que faz parte do ciclo de vida do software, e tem como principal objetivo avaliar a qualidade do 
software e reduzir o risco de falha no software em operação.

Os bugs são inevitáveis no desenvolvimento de um produto. Por isso, existem diversas técnicas de desenvolvimento
e processos de controle de qualidade realizados durante o ciclo de vida de desenvolvimento de software que 
buscam evitar que um erro afete a experiência e confiança do usuário na aplicação.

Corrigir erros durante o desenvolvimento é mais barato que realizar correções durante a fase de produção.

## Princípios de Testes de Software

 - O teste mostra a presença de defeitos e não a sua ausência;
 - Testes exaustivos são impossíveis;
 - O teste inicial economiza tempo e dinheiro;
 - Cuidado com o paradoxo do pesticida;
 - O teste depende do contexto;
 - Ausência de erros é uma ilusão.

## Tipos de teste

 - Teste de Funcionalidade
 - Teste de Usabilidade
 - Teste de Performace
 - Teste de Segurança

## Técnicas de Teste

 - Teste Funcional (Black-Box)
 - Teste Estrutural (White-Box)

## Níveis de Teste

 - Teste de Unidade
 - Teste de Integração
 - Teste de Sistema
 - Teste de Aceitação (Visão do Cliente)

## Processo de Teste

                Planejar
                /       \
               /         \
        Entregar        Projetar
               \         /
                \       /
                Executar

 - Planejar: estratégia, plano de testes, cenários básicos; (Azure, JIRA, TestLink)

    - Leitura dos requisitos;
    - Levantamento de dúvidas;
    - Idéias de teste;
    - Estimativa.

 - Projetar: elaborar casos de teste, técnicas de testes; (Azure, JIRA, TestLink)

    - Nome/Título;
    - Objetivo;
    - Pré-condições;
    - Passo a passo;
    - Resultado esperado.

 - Executar: execução de testes, bugs; (Bugzilla, JIRA, mantis, REDMINE, Azure)

 - Entregar: evidências de testes. (Azure, JIRA, TestLink)

## Testes Estáticos

 - Verificação de diagramas;
 - Código;
 - Plano de Teste;
 - Especificação de Teste;
 - Script de Teste;
 - Manual de Usuário
 ...

## Técnicas utilizadas para gerar casos de teste

 - Partição por Equivalência;

 - Análise do Valor limite: área em que os testes podem gerar defeitos. Os testes podem ser desenhados para cobrir
 tanto os valores válidos, quanto os inválidos.
    - Identificar as partições equivalentes e os ranges de valores relacionados.
    - Identificar os valores máximos e mínimos (resultando em partições válidas e inválidas).
    - Desenvolver as condições de testes para cada valor limite identificado.

 - Tabela de decisão: ajuda a testar regras de negócios sobre várias condições do sistema (input do usuário) e as
 ações correspondentes (system outputs).

 - Testes por transição de estados: são utilizados no design da aplicação para representar o comportamento de um
 sistema em um número finito de estados.
    - A transição é iniciada por um evento;
    - O evento resulta em uma transição;
    - A mudança de estado pode fazer com que o software execute uma ação.

## Técnicas de Testes baseados na experiência

 - Suposição de erro:
    - Como o aplicativo funcionou no passado;
    - Quais tipos de erros os desenvolvedores tendem a fazer;
    - Falhas ocorridas em outros aplicativos.

 - Teste exploratório:
    - Sem um roteiro previamente definido. São modelados, executados, registrados e avaliados dinamicamente durante
    a execução do teste.

## Evidências de erro

 - Print do erro
 - Descrição do passo a passo de como chegar ao problema
 - Descrição do erro mostrado na tela
 - Navegador, sistema operacional usado
 - Versão do sistema testado

## Evidências de sucesso

 - Print do resultado esperado
 - Nome ou id do caso de teste
 - Data da execução e versão do sistema realizado
 - Ciclo do teste

## Quando parar os testes?

 - Quando atingir um confiança nos requisitos;
 - Quando os critérios de encerramento forem atingidos;
 - Quando o custo para identificação dos defeitos não compensam mais.

## Entrega

 - Documentação (Casos de teste / Script de teste)
 - Status Report
 - Evidências de Testes
