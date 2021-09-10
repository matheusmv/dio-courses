# Integração de sistemas e Mensageria

 - Arquitetura utilizando mensageria:

   - Vantagens:

     - Desacomplamento - serviços não tem comunicação direta;
     - Facil plug & play - adição, modificações e evolução dos serviços;
     - Comunicação assíncrona;
     - Simples escalabilidade;
     - Broadcasting;
     - Permite Event Source;

   - Desvantagens:

     - Single point of failure;
     - Difícil monitoramento;

## Comunicação

 - Exemplo 1:

        1º: Web app  -->  Proxy HTTP  -->  Serviço 1  -->  Message Broker

        2º: Message Broker  -->  Serviço 2  -->  Message Broker

        3º: Message Broker  -->  Serviço 3

 - Exemplo 2:

                                Serviço 1
                              /           \
                             /             \
                          Msg               Msg
                           /                 \
                      Serviço 2           Serviço 3
                        /  \                 /  \
                       /    \               /    \
                      Msg    Msg           Msg    Msg
                     /        \           /        \
                Serviço 4  Serviço 5   Serviço 6  Serviço 7

## Gerenciamento de erros

 - Dead letter queue (Filas de re-tentativas);
 - Monitoramento entre serviços;
 - Rastreamento de fluxo;
