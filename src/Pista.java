import Carros.Carro;


public class Pista {
    Carro carroUm = new Carro("Carro Um");
    Carro carroDois = new Carro("carro Dois");


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


        String tamanhoDaPista="------------------------------";

        do{

                    carroUm.corridaIniciar();
                    carroDois.corridaIniciar();

                    if(carroUm.getDistancia() > tamanhoDaPista.length()){
                        carroUm.setDistancia(tamanhoDaPista.length());
                    }
                    if(carroDois.getDistancia() > tamanhoDaPista.length()){
                        carroDois.setDistancia(tamanhoDaPista.length());
                    }

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







