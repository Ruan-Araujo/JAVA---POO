package aula12;

public class ContaPoupanca extends Conta{

    private float taxaJuros;

    public ContaPoupanca(String numeroConta, String agencia, String banco, double saldo, float taxaJuros) {
        super(numeroConta, agencia, banco, saldo);
        this.taxaJuros = taxaJuros;
    }


    @Override
    public String depositar(double valor) {
        double saldoAtual = super.getSaldo() + valor;
        return "Você depositou: " + saldoAtual;
    }

    @Override
    public String sacar(double valor) {
        if (valor <= super.getSaldo());{
            double saldo = super.getSaldo() - valor;
            return "Você sacou: " + saldo;
        }
    }

    @Override
    public void saldo() {
       double extrato = super.getSaldo();
        System.out.println("Seu saldo atual é: " + extrato);
    }
}
