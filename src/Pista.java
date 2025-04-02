import Carros.CarroUm;
import Carros.GeradorDeVelocidade;

public class Pista {


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



    public void frontEnd() {

        while(true){
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







