package Carros;



public class Carro {


    GeradorDeVelocidade gv = new GeradorDeVelocidade();

    private int velocidade;
    private String venceu;
    private int distancia;

    public Carro(String venceu) {
        this.venceu = venceu;
    }

    public int getVelocidade() {
        return velocidade;
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


    public void corridaIniciar() {
        for(int i =0; i<1; i++){
            setVelocidade(gv.gerarVelocidade());
        }


        setDistancia(getDistancia() + getVelocidade());

    }

    public void venceuIniciar() {
        String[] trofeu = {
                "        . . . . . . . .        ",
                "      . . . . . . . . . .      ",
                "     . . . . . . . . . . .     ",
                "    . . . .    1  . . . . .    ",
                "     . . . . . . . . . . .     ",
                "      . . . . . . . . . .      ",
                "        . . . . . . . .        ",
                "          . . . . . .          ",
                "            . . . .            ",
                "              . .              ",
                "              . .              ",
                "              . .              ",
                "          . . . . . .          ",
                "         . . . . . . .         ",
                "        . . . . . . . .        ",
                "       . . . . . . . . .       "
        };

        System.out.println("O "+getVenceu()+" venceu!!!!!!");

        for(int i =0; i< trofeu.length; i++){
            System.out.println(trofeu[i]);
        }

    }

}
