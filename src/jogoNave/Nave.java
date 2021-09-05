package jogoNave;

public class Nave extends Objeto {

    private double velocidade;
    private int vida;

    public Nave(int posX, int posY, char direcao, double velocidade, int vida) {
        super(posX, posY, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void irA(int posX, int posY, char direcao) {
        super.irA(posX, posY, direcao);
        super.setPosX(posX);
        super.setPosY(posY);
        super.setDirecao(direcao);
    }

    public String girar(char direcao){
        super.setDirecao(direcao);
        return "Girando a " + getDirecao();
    }

    public int restaVida(int valor){
        return this.vida - valor;
    }
}
