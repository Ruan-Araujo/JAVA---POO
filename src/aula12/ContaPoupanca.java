package aula12;

public class ContaPoupanca extends Conta{

    private double saldo;
    private double taxaJuros;

    public ContaPoupanca(double saldo, double taxaJuros) {
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Você depositou: " + valor);
    }

    @Override
    public void sacar(double valor) {
        System.out.println(valor <= this.saldo ? "Você sacou " + valor : "Saldo insuficiente");
    }

    @Override
    public void mostrarSaldo() {
        System.out.println(this.saldo);
    }

    public void taxaJuros(){
        System.out.println("Sua taxa de juros é " + saldo * taxaJuros);
    }
}
