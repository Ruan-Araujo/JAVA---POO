package jogoNave;

public class Asteroide extends Objeto{

    private int danos;


    public Asteroide(int posX, int posY, char direcao, int danos) {
        super(posX, posY, direcao);
        this.danos = danos;
    }

    @Override
    public void irA(int posX, int posY, char direcao) {
        super.irA(posX, posY, direcao);
    }

    public int danos(){
        return this.danos;
    }
}
