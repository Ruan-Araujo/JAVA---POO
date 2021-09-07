package aula12;

abstract public class Funcionario {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String matricula;

    public Funcionario(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf;


    }

    abstract public void pagamento();
}
