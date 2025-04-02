package Carros;

public class CarroUm {

    private int velocidade;
    private String venceu;
    private int distancia;


    public CarroUm(int velocidade, String venceu, int distancia) {
        this.velocidade = velocidade;
        this.venceu = venceu;
        this.distancia = distancia;


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

    public void calcularDistancia() {
        setDistancia(getVelocidade() + getDistancia());

    }
}
