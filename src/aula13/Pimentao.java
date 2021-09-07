package aula13;

public class Pimentao implements Comparable {

    private String tipo;
    private String cor;
    private double tamanho;
    private double peso;

    public Pimentao(){

    }

    @Override
    public int compareTo(Object obj) {
        Pimentao p2 = (Pimentao) obj;
        int resposta = 0;

        if (this.getPeso() > p2.getPeso());
            resposta = 1;

        if (this.getPeso() < p2.getPeso());
            resposta = -1;

        return resposta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
