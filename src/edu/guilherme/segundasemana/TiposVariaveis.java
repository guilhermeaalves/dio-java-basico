package edu.guilherme.segundasemana;

import java.util.Date;

public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Tipos de variáveis em Java

       byte idade = 123;
       short ano = 2024; 
       int cep = 21070333; // se começar com 0, talvez tenha que ser outro tipo
       long cpf = 98765432109L; // se começar com 0, talvez tenha que ser outro tipo
       float pi = 3.14F;
       double salario = 1300.33; 
       String meuNome = "Guilherme Alves"; 
       char sexo = 'M'; // usado para apenas 1 caracter 
       boolean estaTrabalhando = true; // usado para valores booleanos, como true ou false
       Date dataNascimento = new Date(); // criando um novo objeto
        System.out.println(dataNascimento);

        // tipo long precisa terminar com L e tipo float com F

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int NUMERO = 1000; // assim que é declarada uma const no Java, com a palavra final e deve ser escrita em CAIXA ALTA.

    }
}
