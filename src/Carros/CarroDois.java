package Carros;

public class CarroDois {

    GeradorDeVelocidade gv = new GeradorDeVelocidade();

    private int velocidade;
    private String venceu;
    private int distancia;


    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getVenceu() {
        return venceu;
    }

    public void setVenceu(String venceu) {
        this.venceu = venceu;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void corridaIniciar() {
        for(int i =0; i<1; i++){
            setVelocidade(gv.gerarVelocidade());
        }


        setDistancia(getDistancia() + getVelocidade());
    }

}
