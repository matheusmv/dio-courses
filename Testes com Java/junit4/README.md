# Aplicando testes com Java

## Junit

 - Framework simples e de código aberto;
 - Testes Unitários;
 - Organização do código;

## Asserts

 - Utilizados para validação dos testes;
 - Indicam se o resultado coincide com o esperado em um ponto de execução do código;

```Java
public class AssertTest {

    @Test
    public void testAssertArrayEquals() {

        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("test", "test");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    public void testAssertNotNull() {

        var object = new Object();

        assertNotNull(object);
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertNotSame() {

        var expectedObject = new Object();
        var actualObject = new Object();

        assertNotSame(expectedObject, actualObject);
    }

    @Test
    public void testAssertSame() {

        var number = Integer.valueOf(768);

        assertSame(number, number);
    }
}
```

## Rules

 - Componente que intercepta uma chamada para o método do teste e permite executar algo antes ou após a execução do
 método;
 - Configurar / Criar recusos externos e Desalocar / Remover os recursos após os testes;

```Java
public class RuleTest {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {

        File createdFile = tmpFolder.newFile("file.txt");

        assertTrue(createdFile.isFile());
        assertEquals(tmpFolder.getRoot(), createdFile.getParentFile());
    }
}
```

## Testando Exceções

 - Exceções esperadas;

```Java
public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void mustThrowIndexOutOfBoundsException() {
        var object = new ArrayList<Object>().get(0);
    }
}
```

 - Exceções esperadas Rule;

```Java
public class ExceptionTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {

        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");

        list.get(0);
    }
}
```

 - Try/Catch;

```Java
public class ExceptionTest {
    
    @Test
    public void shouldTestTryCatchException() {
        try {
            new ArrayList<Object>().get(0);
            fail("Expected indexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(exception.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
```
