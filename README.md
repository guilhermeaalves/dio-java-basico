# dio-java-basico
Repositório dedicado aos meus estudos de Java básico da DIO

## Anatomia das Classes 

```java
public class MinhaClasse {
    
}
```

**No Java, nós sempre trabalhamos com classes**, "Uma classe é um modelo ou estrutura que define as propriedades (atributos) e comportamentos (métodos) de objetos. Portanto, todo programa Java é estruturado em torno de classes." 

- Para que uma aplicação Java possa ser executada, ela precisa ter um ponto de entrada, que é o método main. O método `main` deve estar contido em uma classe. O formato básico é:

**(Importante lembrar, que o nome de uma classe, tem que ser igual ao do arquivo Java)**

- Para que uma aplicação Java possa ser executada, ela precisa ter um ponto de entrada, que é o método main. O método `main` deve estar contido em uma classe. O formato básico é:
´

```java
public class MinhaClasse {
    public static void main(String[] args) {
        
    }
}
```

## Estrutura de variáveis

A declaração de variáveis no Java, segue o seguinte padrão:

```java
tipo NomeBemDefinido = Atribuição;
```
- O tipo da variável é o tipo de dado que a variável irá armazenar, como `int`, `String`, etc.

- O nome das variáveis, é sempre escrito em camelCase e PascalCase.

Exemplo: 

```java
String meuNome = "Guilherme";

int minhaIdade = 17;

boolean verdadeira = true;

boolean falsa = false;

minhaIdade = 18;  // Para alterar o valor de uma variável //
```

## Declarando métodos

A declaração de métodos no Java, segue o seguinte padrão:

```java
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
```
- O tipo de retorno, é o tipo de dado que o método irá retornar.

Exemplo:

```java
int somar (int numero1, int numero2)

String formatarCep (long cep)
```

Outro exemplo: 

```java
public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Guilherme";
        String segundoNome = "Alves";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do método".concat(" ").concat(primeiroNome).concat(" ").concat(segundoNome);

    }

}
```

- O método `nomeCompleto` é basicamente uma função, mas não é, pois ela têm parâmetros e um retorno, mas no Java, as "funções" que pertencem a uma classe são chamadas de "métodos".

- E o método `.concat`, é usado basicamente para concatenar, no exemplo, foi concatenado um espaço vazio, o `primeiroNome`, mais um espaço vazio e o `segundoNome`.