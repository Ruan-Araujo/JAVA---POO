package aula12;
// Os clientes serão identificados com um número de cliente, sobrenome, CPF e conta.
public class Cliente {

    private String numCliente;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Conta tipoConta;

    public Cliente(String numCliente, String nome, String sobrenome, String cpf, Conta tipoConta) {
        this.numCliente = numCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Conta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
