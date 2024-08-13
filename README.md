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

## Palavras reservadas

- A linguagem Java, possui 52 palavras reservadas, e todas são classificadas em grupos e escritas em letras minúsculas.

### **Modificadores de acesso**

- `public` acesso de qualquer classe

- `private` acesso apenas dentro da classe 

- `protected` acesso por classes no mesmo pacote e subclasses (usos de herança)

### Primitivos

- `boolean` verdadeiro ou falso

- `byte` é um tipo com sinal, ele pode armazenar valores entre -128 e 127.

- `char` usado para variáveis de 1 carácter

- `double` usado para números de ponto flutuante e aproximadamente 15 a 16 dígitos decimais significativos.

- `float` usado para números de ponto flutuante e aproximadamente 6 a 7 dígitos decimais.

- `int` para um número inteiro

- `void` indica que o método não tem retorno de valor

### Modificadores de classes, variáveis ou métodos

abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata

class: especifica uma classe


extends: indica a superclasse que a subclasse está estendendo


- `final`: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada


- `implements`: indica as interfaces que uma classe irá implementar


- `nterface`: especifica uma interface

- `native`: indica que um método está escrito em uma linguagem dependente de plataforma, como o C

- `new`: instancia um novo objeto, chamando seu construtor

- `static`: faz um método ou variável pertencer à classe ao invés de às instâncias

- `strictfp`: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões

- `synchronized`: indica que um método só pode ser acessado por uma thread de cada vez

- `transient`: impede a serialização de campos

- `volatile`: indica que uma variável pode ser alterada durante o uso de threads

### Controle de fluxo dentro de um bloco de código

- `break` sai do bloco de codigo em que ele está

- `case` executa um bloco de código dependendo do teste do switch

- `continue` pula a execução do código que viria após essa linha e vai para a próxima passagem do loop

- `default` executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro

- `do` executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente

- `else` executa um bloco de código alternativo caso o teste if seja falso

- `for` usado para realizar um loop condicional de um bloco de código

- `if` usado para realizar um teste lógico de verdadeiro o falso

- `instanceof` determina se um objeto é uma instância de determinada classe, superclasse ou interface

- `return` retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)

- `switch` indica a variável a ser comparada nas expressões case

- `while` executa um bloco de código repetidamente enquanto a condição for verdadeira

### Tratamento de erros

- `assert` testa uma expressão condicional para verificar uma suposição do programador

- `catch` declara o bloco de código usado para tratar uma exceção

- `finally` bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção

- `throw` usado para passar uma exceção para o método que o chamou

- `throws` indica que um método pode passar uma exceção para o método que o chamou

- `try` bloco de código que tentará ser executado, mas que pode causar uma exceção

### Variáveis de referência

- `super` refere-se a superclasse imediata

- `this` refere-se a instância atual do objeto

### Palavras reservadas não utilizadas

- `const` Não utilize para declarar constantes; use public static final

- `goto` não implementada na linguagem Java por ser considerada prejudicial

