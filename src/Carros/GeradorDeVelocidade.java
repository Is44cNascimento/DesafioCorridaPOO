package Carros;

import java.util.Random;

public class GeradorDeVelocidade {

    Random gerador = new Random();

    public int gerarVelocidade() {
        int numeroGerado = gerador.nextInt(3) + 1;
        return numeroGerado;
    }

}