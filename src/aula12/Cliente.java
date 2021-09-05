package aula12;
// Clientes: os clientes serão identificados com um número de cliente, nome, RG e CPF.

abstract public class Cliente {

    private String numeroCliente;
    private String nome;
    private String rg;
    private String cpf;
    private String tipoConta;

    public Cliente(String numeroCliente, String nome, String rg, String cpf, String tipoConta) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
