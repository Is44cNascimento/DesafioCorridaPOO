package Carros;

import java.util.Vector;

public class CarroUm {

    GeradorDeVelocidade gv = new GeradorDeVelocidade();

    private int velocidade;
    private String venceu;
    private int distancia;


    public CarroUm() {
    }

    public CarroUm(int velocidade) {
        this.velocidade = velocidade;



    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getVenceu() {
        return this.venceu;
    }

    public void setVenceu(String venceu) {
        this.venceu = venceu;
    }

    public int getDistancia() {
        return this.distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int velocidadeCarroUm(){

        int velocidadeCarroUm ;

        while(true){
            setVelocidade(gv.gerarVelocidadeUm(4));
            setDistancia(getVelocidade() + getDistancia());

            velocidadeCarroUm = getDistancia();
            return velocidadeCarroUm;
        }


    }
}
