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

    System.out.println("INICIANDO CORRIDA DE ASTERISCO");
        boolean parar = false;

        String tamanhoDaPista="------------------------------";

        do{

                    carroUm.corridaIniciar();
                    carroDois.corridaIniciar();

                System.out.println(tamanhoDaPista);
                for(int i = 0; i < carroUm.getDistancia(); i++){

                    setDistanciaCarroUm(carroUm.getDistancia());
                    System.out.print(" ");
                }
                System.out.println("#");



                for(int i = 0; i < carroDois.getDistancia(); i++){
                System.out.print(" ");
                setDistanciaCarroDois(carroDois.getDistancia());
            }
                System.out.println("#");



                System.out.println(tamanhoDaPista + "\n");





            }while (distanciaCarroDois <= 20 || distanciaCarroUm <= 20);

                if(distanciaCarroUm  > distanciaCarroDois){
                    carroUm.venceuIniciar();

                }if(distanciaCarroDois > distanciaCarroUm){
                    carroDois.venceuIniciar();
            } if(distanciaCarroUm == distanciaCarroDois){
                    System.out.println("EMPATE!!!");
        }
        }

    }







