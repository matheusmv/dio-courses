# Desenvolvimento e operação de software integrado

## DevOps

Conjunto de práticas que integram e automatizam os processos entre as equipes de desenvolvimento, operações e de
apoio (como QA) para a produção rápida e confiável de software.

 - Framework CALMS:

     - Culture: trabalho colaborativo/equipe;

     - Automation: eliminar o trabalho manual repetitivo;

     - Lean: focar nas entregas de valor ao cliente - melhoria contínua;

     - Measurement: obter métricas para novas melhorias/resposta a incidentes;

     - Sharing: descentralização de conhecimento/evitar que processos se tornem dependentes;

 - Os três caminhos:

     - Flow: a otimização do fluxo visa eliminar desperdícios, gargalos no processo, transferência de 
     responsabilidade e tempos de espera. Esse caminho é trilhado entre a demanda e a entrega em produção.

     - Feedback: cliclos rápidos de feedbacks visam resolver problemas o quanto antes, testando tudo, alertando
     em qualquer falha, considerando todas as métricas coletadas no ambiente produtivo sobre o valor entregado.

     - Learning: o aprendizado contínuo visa gerar conhecimento através da experimentação. Hipóteses são melhores
     do que uma certeza imediata. Este caminho é fruto do processo científico e produz segurança psicológica.

 - Ferramentas de planejamento:

     - Microsoft Teams;
     - draw.io;
     - Balsamiq;
     - roadmunk;
     - Confluence;
     - Jira;

 - Codificação:

     - Visual Studio;
     - GitHub;
     - Sublime Text;
     - cmder;
     - git;
     - vs code;
     - notepad++;

 - Build:

     - containerd;
     - docker;
     - NuGet;
     - npm;
     - cri-o;
     - .NET CLI
     - MSBuild;

 - Testes:

     - Postman;
     - Selenium;
     - sonarqube;
     - loader.io;

 - Deploy:

     - Azure Pipelines;
     - circleci;
     - AppVeyor;
     - GitLab CI;
     - Jenkins;
     - Travis CI;

 - Operação:

     - Kubernetes;
     - Azure;
     - puppet;
     - Terraform;
     - AWS;
     - OPENSHIFT;

 - Monitoramento:

     - DATADOG;
     - Prometheus;
     - APPMETRICS;
     - Rollbar;
     - ZABBIX;
     - New Relic;
     - Pushover;
     - Seq;
     - Monitis;

## Continuous Integration

Prática de desenvolvimento de software de DevOps em que os desenvolvedores, com frequência, juntam suas alterações 
de código em um repositório central. Depois disso, builds e testes são executados.

 - Se refere ao estágio de build ou integração do processo de lançamento de software.

 - Os principais objetivos da integração contínua são encontrar e investigar bugs mais rapidamente, melhorar a
 qualidade do software e reduzir o tempo que leva para validar novas atualizações de software.

 - Continuous delivery: aprovar implantação (deploy).

 - Continuous deployment: implantação automática.

No passado, os desenvolvedores de uma equipe podiam trabalhar isoladamente por um longo período e só juntar suas
alterações à ramificação mestre quando concluíssem seu trabalho. Dessa forma, a junção das alterações de códigos
era difícil e demorada, além de resultar no acúmulo de erros sem correção por longos períodos.

 - Principais ferramentas:

     - circleci;
     - AppVeyor;
     - Azure Pipelines;
     - GitLab CI;
     - Travis CI;
     - Jenkins;

## Continuous Inspection

 - Análise de complexidade ciclomática/cognitiva;

 - Repetição de código;

 - Padronização e Estilo;

 - Código seguro;

 - Principais ferramentas:

     - sonarqube;
     - CODE CLIMATE;
     - CODACY;
