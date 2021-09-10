package aula14;

import java.util.Date;

public class Empregado {

    private String nome;
    private Date dataContratacao;

    private int calcularTempServ(){
        Date dataAtual = new Date();
        return dataAtual.getYear() - dataContratacao.getYear();
    }

    public Empregado(String nome, Date dataContratacao) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}
