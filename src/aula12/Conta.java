package aula12;
//Contas: nossas contas bancárias permitem depositar,
  //      sacar dinheiro e relatar saldo. Uma conta possui um cliente associado.

abstract public class Conta {
    private String numeroConta;
    private String agencia;
    private String banco;
    private double saldo;

    public Conta(String numeroConta, String agencia, String banco, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract String depositar(double valor);
    public abstract String sacar(double valor);
    public abstract void saldo();
}
