package jogoNave;

// implementar a lógica dos elementos do jogo: nave, nave inimiga, asteróide.
// objetos gráficos que ocupam uma posição no espaço (x, y) e à medida que se movem ocupam uma nova localização

public class Objeto {

    private int posX;
    private int posY;
    private char direcao;



    public Objeto(int posX, int posY, char direcao) {
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void irA(int posX, int posY, char direcao){
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }
}
