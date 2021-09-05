package modelandoClasses;

// Classe
public class Conta {
    private int num;
    private double saldo;
    private double limite;

    // Relacionamento - Agregação.
    Agencia agencia;

    // Getters && Setters
    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Construtor
    Conta(int num, double saldo, double limite){
        this.num = num;
        this.limite = limite;
        this.saldo = saldo;
    }

    // Atribuindo métodos

    // Depositar
    void deposita(double valor){
        this.saldo += valor;
    }

    // Consultar Saldo
    double consultarSaldoDisponivel(){
        return this.saldo + this.limite;
    }

    // saque
    void saque(double valor){
        System.out.println(this.saldo -= valor);
    }

    // impressão de extrato
    void extrato(){
        System.out.println("Saldo: " + this.consultarSaldoDisponivel());
    }
}
