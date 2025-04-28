import Carros.Carro;

public class Pista {

    private int tamanhoDaPista;

    public Pista(int tamanhoDaPista) {
        this.tamanhoDaPista = tamanhoDaPista;
    }

    public int getTamanhoDaPista() {
        return tamanhoDaPista;
    }

    public void setTamanhoDaPista(int tamanhoDaPista) {
        this.tamanhoDaPista = tamanhoDaPista;
    }

    Carro carroUm = new Carro("Carro Um");
    Carro carroDois = new Carro("carro Dois");

    public void visual() {

        System.out.println("INICIANDO CORRIDA DE ASTERISCO");
        System.out.println();

        String visualDaPista = "";
        for (int i = 0; i < this.tamanhoDaPista; i++) {
            visualDaPista += "-";
        }
        System.out.println(visualDaPista);
        System.out.println("#");
        System.out.println("#");
        System.out.println(visualDaPista);
        System.out.println();

        do{
            carroUm.corridaIniciar();
            carroDois.corridaIniciar();

            System.out.println(visualDaPista);
            for(int i = 0; i < carroUm.getDistancia(); i++){
                System.out.print(" ");
            }
            System.out.println("#");

            for(int i = 0; i < carroDois.getDistancia(); i++){
                System.out.print(" ");
            }
            System.out.println("#");

            System.out.println(visualDaPista);
            System.out.println();

        }while (carroUm.getDistancia() < this.tamanhoDaPista && carroDois.getDistancia() < this.tamanhoDaPista);

        System.out.println("Distancias Percorridas");
        System.out.println(carroUm.getNomeDocarro() + ": " + carroUm.getDistancia());
        System.out.println(carroDois.getNomeDocarro()+ ": " + carroDois.getDistancia());

        if(carroUm.getDistancia()  > carroDois.getDistancia()){
            carroUm.vencedor();
        }else if(carroDois.getDistancia() > carroUm.getDistancia()){
            carroDois.vencedor();
        }else {
            System.out.println("EMPATE!!!");
        }

    }

}