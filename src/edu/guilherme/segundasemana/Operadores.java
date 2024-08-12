package edu.guilherme.segundasemana;

public class Operadores {

    public static void main(String[] args) {

        int numero = 5;

        numero = -numero; // deixa o numero negativo

        System.out.println(numero);

        numero = numero * -1; // deixa o numero positivo

        System.out.println(numero);

        int a, b;

        // Op ternário, é basicamente um resumo do if else, ? = if, : = else

        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // comparações

        String nome1 = "Guilherme";
        String nome2 = new String("Guilherme");

        System.out.println(nome1.equals(nome2)); // o método equals, faz uma comparação entre objetos e retorna false ou true
    }
}
