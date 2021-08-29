package modelandoClasses;

public class Aluno {
    private String nome;
    private String rg;
    private String dataNascimento;

    Turma turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    Aluno(String nome, String rg, String dataNascimento){
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
}
