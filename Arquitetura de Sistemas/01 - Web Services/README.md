# Web Services

Serviços Web são soluções para aplicações se comunicarem independente de linguagem, softwares e hardwares 
utilizados.

Inicialmente Serviços Web foram criados para troca de mensagens utilizando a linguagem XML (Extensible Markup
Language) sobre o protocolo HTTP sendo identificado por URI (Uniform Resouce Identifier).

Podemos dizer que Serviços Web são API's que se comunicam por meio de redes sobre o protocolo HTTP.

- Vantagens:

    - Linguagem comum
    - Integração
    - Reutilização de implementação
    - Segurança
    - Custos

- Principais Tecnologias

    - SOAP
    - REST
    - XML
    - JSON

## SOAP

- Simple Object Access Protocol.

- É um protocolo baseado em XML para acessar serviços web principalmente por HTTP.

- Pode-se dizer que SOAP é uma definição de como serviços web se comunicam.

- Foi desenvolvido para facilitar integrações entre aplicações.

- Permite integrações entre aplicaçõs, idenpendente de linguagem, pois usa como linguagem comum o XML.

- É independente de plataforma e software.

- Meio de transporte genérico, ou seja, pode ser usado por outros protocolos além do HTTP.

- Estrutura SOAP:

        +----------------------+
        |     SOAP Envelop     |
        | +------------------+ |
        | |   SOAP Header    | |
        | +------------------+ |
        | +------------------+ |
        | |    SOAP Body     | |
        | |                  | |
        | +------------------+ |
        +----------------------+

    - SOAP Envelop é o primeiro elemento do documento e é usado para encapsular toda a mensagem SOAP.
    
    - SOAP Header é o elemento onde possui informações de atributos e metadados da requisição.

    - SOAP Body é o elemento que contém os detalhes da mensagem.

- Exemplo:

        <soap:Envelop xmlns:soap="http://www.w3.org/2003/05/soap-envelop">
            <soap:Header>
            </soap:Header>
            <soap:Body>
                <m:MetodoEndereco xmlns:m="http://www.example.org;/endereco">
                    <m:Cidade>Rio de Janeiro</m:Cidade>
                    <m:CEP>99999-99</m:CEP>
                    <m:Logradouro>Avenida Atlântida</m:Logradouro>
                    <m:Numero>99</m:Numero>
                </m:MetodoEndereco>
            </soap:Body>
        </soap:Envelop>

### XML

- Extensible Markup Language.

- É uma linguagem de marcação criada na década de 90 pela W3C.

- Facilita a separação de conteúdo.

- Não tem limitação de criação de tags.

- Linguagem comum para integrações entre aplicações.

### WSDL

- Web Services Description Language.

- Usado para descrever Web Services, funciona como um contrato do serviço.

- A descrição é feito em um documento XML, onde é descrito o serviço, especificaçõs de acesso, operações e métodos.

### XSD

- XML Schema Definition

- É um schema no formato XML usado para definir a estrutura de dados que será validada no XML.

- O XSD funciona como uma documentação de como deve ser montado o SOAP Message (XML) que será enviado através de
Web Service.

## REST

- Representational State Transfer.

- É um estilo de arquitetura de software que define a implementação de um serviço web.

- Podem trabalhar com os formatos XML, JSON ou outros.

- Permite integraçõs entre aplicações e também entre cliente e servidor em páginas web e aplicaçõs.

- Utiliza dos métodos HTTP para definir a operação que está sendo efetuada.

- Arquitetura de fácil compreensão.

### API

- Application Programming Interface

- São conjuntos de rotinas documentados e disponibilizados por uma aplicação para que outras aplicações possam
consumir suas funcionalidades.

- Ficou popular com o aumento dos serviços web.

- As maiores plataformas de tecnologia disponibilizam APIs para acessos de suas funcionalidades, algumas delas
são: Facebook, Twitter, Telegram, Whatsapp, GtiHub...

- Principais métodos HTTP:

    - GET: solicita a representação de um recurso.
    - POST: solicita a criação de um recurso.
    - DELETE: solicita a exclusão de um recurso.
    - PUT: solicita a atualização de um recurso.

### JSON

- JavaScript Object Notation.

- Formatção leve utilizada para troca de mensagens entre sistemas.

- Usa-se uma estrutura de chave e valor e também de listas ordenadas.

- Um dos formatos mais populares e mais utilizados para troca de mensagens entre sistemas.

### Código de Estado

- Usado pelo servidor para avisar o cliente sobre o estado da operação solicitada.

- 1xx: Informativo

- 2xx: Sucesso

- 3xx: Redirecionamento

- 4xx: Erro do Cliente

- 5xx: Erro do Servidor
