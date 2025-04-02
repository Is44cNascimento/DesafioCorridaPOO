import Carros.CarroDois;
import Carros.CarroUm;
import Carros.GeradorDeVelocidade;

public class Principal {
    public static void main(String[] args) {
        GeradorDeVelocidade gv = new GeradorDeVelocidade();
        CarroUm carroUm =new CarroUm(gv.gerarVelocidadeUm(),"",10);
        CarroDois carroDois =new CarroDois();
        Pista pista =  new Pista(carroUm.,0);




        pista.frontEnd();



    }
}