package Carros;

import java.util.Random;

public class GeradorDeVelocidade {

    Random gerador = new Random();


    public GeradorDeVelocidade() {
    }


    public int gerarVelocidadeUm() {
        while(true){
            return gerador.nextInt(4);
        }


    }
    public int gerarVelocidadeDois() {
        while(true){
            return gerador.nextInt(4);
        }


    }

}
