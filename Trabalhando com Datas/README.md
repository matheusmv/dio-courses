# Trabalhando com Datas

## Classe Date

    java.util.Date

- Construtores:

    - Deprecated:

            Date(int year, int month, int date)

            Date(int year, int month, int date, int hrs, int min)

            Date(int year, int month, int date, int hrs, int min, int sec)

            Date(String s)

    - Funcionais:

            Date()

        ***Aloca um objeto Date e o inicializará com o milissegundo mais próximo do período da sua execução.***

            Date(long date)

        ***Recebe como argumentos os milissegundos como base padrão de tempo (epoch) e usa como referência***
        ***1 de janeiro de 1970 00:00:00.***

- Obs.: O epoch timestamp é um padrão largamente aceito para representar uma data com um inteiro 32-bits a partir
do início do Unix Epoch.

- Métodos úteis:

    - ***after(Date)***: checa se o objeto Data de referência é posterior ao comparado.
    - ***before(Date)***: checa se o objeto Data de referência é anterior ao comparado.
    - ***compareTo(Date)***: compara dois objetos Data.
    - ***equals(Date)***: checa se os objetos são iguais.
    - ***getTime()***: retorna a data em milissegundos.
    - ***setTIme(long)***: define uma data com base em milissegundos.
    - ***from(Instant)***: define uma data com base em um Instant.
    - ***toInstant()***: retorna um Instant com base em um Date.

## Classe Instant

    java.time.Instant

- JDK 1.8
- Imutável e Thread safe
- Modela um ponto instantâneo de uma linha do tempo
- Indicado para gravar marcações temporais em eventos de uma aplicação

## Classe Calendar

    java.util.Calendar

Classe abstrata que provê métodos para converter data entre um instante específico. Possui alguns campos
específicos como MONTH, YEAR, HOUR etc.

## Classe DateFormat

    java.text.DateFormat

Oferece uma maneira de formatar e parsear a saída das datas.

## Classe SimpleDateFormat

    java.text.SimpleDateFormat

Traz uma grande facilidade ao definir um padrão de formatação para a saída de data desejada.

    dd/MM/yyyy HH:mm:ss:mmm

## Java8+

    java.time.LocalDate
    java.time.LocalTime
    java.time.LocalDateTime

Melhorias no pacote java.time que foi herdado do projeto Joda Time.

- ***LocalDate***

    - classe imutável para representar uma data
    - seu formato padrão é yyyy-MM-dd

- ***LocalTime***

    - classe imutável que representa um padrão de hora-minuto-segundo
    - pode ser representado até o nível de nanosegundos

- ***LocalDateTime***

    - classe imutável que permite trabalhar com dia e hora de uma só vez
    - permite manipular a data e a hora com precisão de nano segundos
