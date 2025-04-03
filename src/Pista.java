import Carros.CarroDois;
import Carros.CarroUm;
import Carros.GeradorDeVelocidade;

public class Pista {

    CarroUm carroUm = new CarroUm();
    CarroDois carroDois = new CarroDois();
    GeradorDeVelocidade geradorDeVelocidade = new GeradorDeVelocidade();

    private int distanciaCarroUm;
    private int distanciaCarroDois;

    public Pista() {
    }

    public Pista(int distanciaCarroUm, int distanciaCarroDois) {
        this.distanciaCarroUm = distanciaCarroUm;
        this.distanciaCarroDois = distanciaCarroDois;


    }

    public int getDistanciaCarroUm() {
        return this.distanciaCarroUm;
    }

    public void setDistanciaCarroUm(int distanciaCarroUm) {
        this.distanciaCarroUm = distanciaCarroUm;
    }

    public int getDistanciaCarroDois() {
        return this.distanciaCarroDois;
    }

    public void setDistanciaCarroDois(int distanciaCarroDois) {
        this.distanciaCarroDois = distanciaCarroDois;
    }


    public boolean verificarVencedor(int velocidadeCarroUm, int velocidadeCarroDois) {

    if(velocidadeCarroUm < 30 ) {
        return true;
    } if(velocidadeCarroDois < 30 ) {
        return true;
        }
    return false;


    }
    public void ativar(){

        while(verificarVencedor(0, 0)){
            carroUm.velocidadeCarroUm();
            carroDois.velocidadeCarroDois();

            setDistanciaCarroUm(carroUm.velocidadeCarroUm());
            setDistanciaCarroDois(carroDois.velocidadeCarroDois());

        }
    }

    public void frontEnd() {
        ativar();



        while(verificarVencedor(carroUm.velocidadeCarroUm(),carroDois.velocidadeCarroDois())){
            System.out.println("_______________________________");
            for(int i = 0; i < getDistanciaCarroUm(); i++){

                System.out.print(" ");
            }
            System.out.println("#");
            for(int i = 0; i < getDistanciaCarroDois(); i++){
                System.out.print(" ");
            }
            System.out.println("#");




            System.out.println("_______________________________");
            System.out.println("");
        }





        }

    }







