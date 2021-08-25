package modelandoClasses;

public class CartaoCredito {
    private int numero;
    private String dataValidade;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    CartaoCredito(int numero, String dataValidade){
        this.numero = numero;
        this.dataValidade = dataValidade;
    }
}
