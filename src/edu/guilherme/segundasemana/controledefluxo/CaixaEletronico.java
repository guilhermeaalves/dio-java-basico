package edu.guilherme.segundasemana.controledefluxo;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 21.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }else
            System.out.println("Saldo insuficiente !");
    }
}