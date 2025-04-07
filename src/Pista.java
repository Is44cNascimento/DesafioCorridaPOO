import Carros.CarroDois;
import Carros.CarroUm;
import Carros.GeradorDeVelocidade;

public class Pista {

    CarroUm carroUm = new CarroUm();
    CarroDois carroDois = new CarroDois();

    GeradorDeVelocidade geradorDeVelocidade = new GeradorDeVelocidade();

    private int distanciaCarroUm;
    private int distanciaCarroDois;

    public int getDistanciaCarroUm() {
        return distanciaCarroUm;
    }

    public void setDistanciaCarroUm(int distanciaCarroUm) {
        this.distanciaCarroUm = distanciaCarroUm;
    }

    public int getDistanciaCarroDois() {
        return distanciaCarroDois;
    }

    public void setDistanciaCarroDois(int distanciaCarroDois) {
        this.distanciaCarroDois = distanciaCarroDois;
    }


    public boolean parar(){
        while(true) {
            if (getDistanciaCarroUm() >= 30) {
                return true;
            }
            if (getDistanciaCarroUm() >= 30) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void frontEnd() {

        System.out.println("_______________________________");
        boolean parar = parar();

        while (parar == false) {

                carroUm.corridaIniciar();
                carroDois.corridaIniciar();


                System.out.println("_______________________________");
                for(int i = 0; i < carroUm.getDistancia(); i++){

                    System.out.print(" ");
                }
                System.out.println("#");
                for(int i = 0; i < carroDois.getDistancia(); i++){
                System.out.print(" ");
            }
                System.out.println("#");

                System.out.println("_______________________________");
                System.out.println("");

            }
        }

    }







