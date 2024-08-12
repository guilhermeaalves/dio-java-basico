package edu.guilherme.primeirasemana;
public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Guilherme";
        String segundoNome = "Alves";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        // int minhaIdade = 17;

        // boolean verdadeira = true;

        // boolean falsa = false;

        // minhaIdade = 18;  // Para alterar o valor de uma variável //

        // System.out.println("Hello world");

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método".concat(" ").concat(primeiroNome).concat(" ").concat(segundoNome);
    }

}
