package edu.guilherme.terceirasemana;

// class ExemploBreakContinue.java
public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);

        }

    }
}
