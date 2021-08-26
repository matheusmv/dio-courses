# Explorando Mocks e Asserts

 - Objetos que simulam o comportamento de objetos reais de forma controlada.

## Frameworks

 - Mockito

```Java
public class MockitoTest {

    public void test() {

        List mock = mock(List.class);

        when(mock.get(0)).thenReturn("one");
        when(mock.get(1)).thenReturn("two");

        // ...

        verify(mock).clear();
    }
}
```

 - EasyMock

```Java
public class EasyMockTest {

    public void test() {

        List mock = createNiceMock(List.class);

        expect(mock.get(0)).andStubReturn("one");
        expect(mock.get(1)).andStubReturn("two");

        mock.clear();

        replay(mock);

        // ...

        verify(mock);
    }
}
```

 - PowerMockito: API de extensão do Mockito que oferece recursos para trabalhar com a API de reflections de
 maneira simples e ajuda a superar algumas limitações (falta de capacidade para trabalhar com métodos static, 
 final ou private).

## [Hamcrest](http://hamcrest.org/JavaHamcrest/)

 - Framework para escrever objetos correspondentes, permitindo que regras de 'match' sejam definidas de forma
 declarativa. Existem várias situações em que os matchers são inestimáveis, como validação de UI ou filtragem
 de dados, mas é na área de escrever testes flexíveis que os matchers são mais comumente usados.

## [AssertJ](https://assertj.github.io/doc/)

 - Biblioteca Java que fornece um rico conjunto de asserções e mensagens de erro, melhora a legibilidade do código
 de teste e é projetada para ser super fácil de usar.
