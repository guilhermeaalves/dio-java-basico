package edu.guilherme.terceirasemana;

// Definindo a classe de exceção personalizada
class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido. Deve conter exatamente 8 caracteres.");
    }
}

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("CEP Formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um CEP formatado
        return "23.765-064";
    }
}
