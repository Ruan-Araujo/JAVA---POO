package modelandoClasses;

public class Conta {
    private int num;
    private double saldo;
    private double limite;

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

    Conta(int num, double saldo, double limite){
        this.num = num;
        this.limite = limite;
        this.saldo = saldo;
    }
}
