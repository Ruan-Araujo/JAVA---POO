package aula11;

public class Associado {

    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;

    public Associado(String numAssociado, String nome, double valorMensal, String atividade) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public String getNumAssociado() {
        return numAssociado;
    }

    public void setNumAssociado(String numAssociado) {
        this.numAssociado = numAssociado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public double custoMensal(double valor){
        return this.valorMensal += valor;
    }
}
