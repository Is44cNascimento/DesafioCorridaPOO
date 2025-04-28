package Carros;



public class Carro {


    GeradorDeVelocidade gv = new GeradorDeVelocidade();

    private int velocidade;
    private String nomeDoCarro;
    private int distancia;

    public Carro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getNomeDocarro() {
        return this.nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public int getDistancia() {
        return this.distancia;
    }

    public void setDistancia(int distancia)  {
        this.distancia = distancia;
    }


    public void corridaIniciar() {
        setVelocidade(gv.gerarVelocidade());
        setDistancia(getDistancia() + getVelocidade());
    }

    public void vencedor() {
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

        System.out.println("O "+ getNomeDocarro() +" venceu!!!!!!");

        for(int i =0; i< trofeu.length; i++){
            System.out.println(trofeu[i]);
        }

    }

}