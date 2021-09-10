package aula14;

public class Jogador implements Comparavel {

    private String nome;
    private int numCamisa;
    private boolean lesionado;
    private boolean titular;

    public Jogador(String nome, int numCamisa, boolean lesionado, boolean titular) {
        this.nome = nome;
        this.numCamisa = numCamisa;
        this.lesionado = lesionado;
        this.titular = titular;
    }


    @Override
    public int compareTo(Jogador jogador) {
        if (this.numCamisa == jogador.numCamisa){
            return 0;
        }else {
            return 1;
        }

    }
}
