package edu.guilherme.segundasemana;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();   

        System.out.println("Canal atual?: " + smartTv.canal);
        smartTv.mudarCanal(1);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("Volume atual?: " + smartTv.volume);
        
        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("Volume atual?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

    }
}
