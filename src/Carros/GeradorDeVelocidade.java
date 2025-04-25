package Carros;

import java.util.Random;

public class GeradorDeVelocidade {

    Random gerador = new Random();


    public GeradorDeVelocidade() {

    }

    public int gerarVelocidade() {
        int numeroGerado = gerador.nextInt(4);
    return numeroGerado;
    }

}