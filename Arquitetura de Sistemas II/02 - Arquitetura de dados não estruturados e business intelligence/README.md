# Arquitetura de dados não estruturados e business inteligence

## Business Intelligence em Modelos de Dados

 - Oferece um "norte" para modelar os dados em apoio a decisões estratégicas em uma empresa;

 - Fornece ferramentas para a organização de uma empresa a tomar decisões estratégicas de negócio;

                    (Dados gerenciais)
                            +
                    (Dados da operação)
        SGBD's  -->         +           --> BI - Data
                    (Pesquisa de campo)
                            +
                    (Indicadores de mercado)

 - Ferramentas:

     - tableau;
     - Power BI;
     - IBM Cognos Analytics;
     - QlikView;

## Data Warehouse

 - Estilo de modelagem de dados, para "acomodar" os dados de forma eficiente;

 - OLTP (On-Line Transaction Processing);

     - Foco no nível operacional da organização. Visa a execução operacional do negócio;
     
     - Alta velocidade na manipulação de dados operacionais, porém ineficiente para geração de análises gerenciais;
     
     - O dados são normalmente estruturados em um modelo relacional normalizado, otimizado para utilização
     transacional. Os dados possuem alto nível de detalhes;
     
     - O armazenamento é feito em sistemas convencionais de banco de dados através dos sisemas de informações da
     organização;
     
     - É utilizado por técnicos e analistas e engloba vários usuários da organização;
     
     - A atualização dos dados é feita no momento da transação Frequência muito alta de atualizações;
     
     - Dados voláteis, passíveis de modificação e exclusão;

     - Podem ser feito leitura, inserção, modificação e exclusão dos dados;

 - OLAP (On-Line Analytical Processing);

     - Foco no nível estratégico da organização. Visa a análise empresarial e tomada de decisão;

     - Otimização para a leitura e geração de análises e relatórios gerenciais;

     - Os dados estão estruturados na modelagem dimensional. Os dados normalmente possuem alto nível de 
     sumarização;

     - O armazenamento é feito em estruturas de Data Warehouse com otimização no desempenho em grandes volumes de
     dados;

     - É utilizado pelos gestores e analístas para a tomada de decisão;

     - A atualização das informações é feita no processo de carga dos dados. Frequência baixa, podendo ser diária,
     semanal, mensal ou anual (ou critério específico);

     - Dados históricos e não voláteis. Os dados não sofrem alterações, salvo necessidades específicas (por 
     motivos de erros ou inconsistências de informações);

     - É permitido apenas a inserção e leitura. Sendo que para o usuário está apenas disponível a leitura;

## Big Data e dados não estruturados

 - Big data é um termo que descreve um grande volume de dados - tanto estruturados quanto não estruturados;

 - Formatados diversos de informação onde algum tipo de conhecimento pode ser retirado;

 - Dados semi-estruturados:

     - Possuem um estrutura básica;
     - XML, RDF, OWL, JSON;
     - A informação pode ser alterada sem uma regra muito explícita;
     - Bancos de dados NoSQL - MongoDB, Cassandra, Redis;
     - Maior flexibilidade para inserir dados;

 - Dados não estruturados:

     - coleção de dados estruturados e não estruturados;
     - redes sociais, dispositivos, email, audio, etc;
     - hadoop, Apache Spark, etc;
