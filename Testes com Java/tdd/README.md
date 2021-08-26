# TDD e Testes Unitários com JUnit 5

 - TDD = Test Driven Development

 - Primeiramente o desenvolvedor escreve um caso de teste automatizado que define uma melhoria desejada ou uma
 nova funcionalidade. Então, é produzido código que possa ser validado pelo teste para posteriormente o código
 ser refatorado para um código sob padrões aceitáveis.

 - Extreme Programming

 - Metodologia de desenvolvimento de software baseado em testes com ciclo curto de repetições

    - Um código só deve ser implementado quando um teste falhar
    - O mínimo de código deve ser escrito para um teste passar
    - Quando todos os testes passarem o ciclo deve ser repetido para uma nova funcionalidade

 - Código com menos defeitos e design mais limpos

## Clico de desenvolvimento

 - Adicione um teste

 - Execute todos os testes e veja se algum deles falha

 - Escrever código

 - Execute os testes automatizados e veja-os executarem com sucesso

 - Refatorar código

 - Repetir o processo

## JUnit 5

 - Suporte a recursos do Java 8
 
 - JUnit Jupiter:

    - @TestFactory: indica um método que é um fábrica de testes para testes dinâmicos;
    - @DisplayName: define o nome de exibição personalizado para uma classe de teste ou método de teste;
    - @Nested: indica que a classe anotada é uma classe de teste aninhada e não estática;
    - @Tag: declara tags para testes de filtragem;
    - @ExtendWith: é usado para registrar extensões personalizadas;
    - @BeforeEach: indica que o método anotado será executado antes de cada método de tete;
    - @AfterEach: indica que o método anotado será executado antes de todos os métodos de teste na classe atual;
    - @AfterAll: indica que o método anotado será executado após todos os métodos de teste na classe atual;
    - @Disable: é usado para desativar uma classe ou método de teste;

```Java
@BeforeAll
static void setup() {
    log.info("@BeforeAll - executes once before all test methods in this class");
}

@BeforeEach
void init() {
    log.info("@BeforeEach - executes before each test method in this class");
}

@DisplayName("Single test successful")
@Test
void testSingleSuccessTest() {
    log.info("Success");
}

@Test
@Disabled("Not implemented yet")
void testShowSomething() {
    //...
}

@AfterEach
void tearDown() {
    log.info("@AfterEach - executed after each test method.");
}

@AfterAll
static void done() {
    log.info("@AfterAll - executed after all test methods.");
}
```

 - JUnit Vintage: suporta a execução de teste baseados no JUnit 3 e 4 na plataforma JUnit 5

## JUnit 5 - Asserções e Premissas

 - Utilizam os recursos do Java 8 (expressões lambda)

### Asserções

    org.junit.jupiter.api.Assertions

 - É possível usar lambdas em asserções (economiza tempo e recursos - lazy evaluation):

```Java
    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(1, 2, 3)
        .stream()
        .mapToInt(i -> i)
        .sum() > 5, () -> "Sum should be greater than 5");
    }
```

 - Agrupando asserções com assertAll(): permite fazer afirmações mais complexas e identificar a localização exata
 de qualquer falha.

```Java
    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
            () -> assertEquals(numbers[0], 1),
            () -> assertEquals(numbers[3], 3),
            () -> assertEquals(numbers[4], 1)
        );
    }
```

### Premissas

 - São usadas para executar testes somente se determinadas condições forem atendidas.

    - assumeTrue();
    - assumeFalse();
    - assumingThat();

```Java
    @Test
    void trueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void falseAssumption() {
        assumeFalse(5 < 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void assumptionThat() {
        String someString = "Just a string";
        assumingThat(
            someString.equals("Just a string"),
            () -> assertEquals(2 + 2, 4)
        );
    }
```

## Testes de exceções no JUnit5

 - assetThrows():

```Java
    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
        throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

    @Test
    void assertThrowsException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
        Integer.valueOf(str);
        });
    }
```

## Suítes de teste - JUnit 5

 - Agregação de várias classes de teste em um conjunto de testes para serem executadas juntas.

    - @SelectPackages: é usado para especificar os nomes dos pacotes a serem selecionados ao executar um conjunto
    de testes.

    - @SelectClasses: é usada para especificar as classes a serem selecionadas ao executar um conjunto de testes.

```Java
    @RunWith(JUnitPlatform.class)
    @SelectPackages("com.")
    public class AllUnitTest {
        // ...
    }

    @RunWith(JUnitPlatform.class)
    @SelectClasses({AssertionTest.class, AssumptionTest.class, ExceptionTest.class})
    public class AllUnitTest {
        
    }
```

## Testes dinâmicos - JUnit 5

 - Permite declarar e executar casos de teste gerados em tempo de execução.

 - Os testes dinâmicos permite a definição de casos de testes dinamicamente no tempo de execução.

 - Podem ser gerados por um método de fábrica anotado com @TestFactory:

```Java
    @TestFactory
    public Stream<DynamicTest> translateDynamicTestsFromStream() {
        return in.stream()
        .map(word ->
            DynamicTest.dynamicTest("Test translate " + word, () -> {
                int id = in.indexOf(word);
                assertEquals(out.get(id), translate(word));
            })
        );
    }
```
