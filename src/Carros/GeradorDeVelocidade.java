package Carros;

import java.util.Random;

public class GeradorDeVelocidade {

    Random gerador = new Random(1);


    public GeradorDeVelocidade() {
    }


    public int gerarVelocidadeUm(int bound) {
        while(true){
            return gerador.nextInt(4);
        }


    }
    public int gerarVelocidadeDois(int bound) {
        while(true){
            return gerador.nextInt(bound);
        }


    }

}
