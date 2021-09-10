package aula13;

public class ContaCorrente extends Conta implements GerarImposto{

    private double saldoPermitido;
    public ContaCorrente(double saldo) {
        super(saldo);
        this.saldoPermitido = 100;
    }

    @Override
    public double imposto(double porcentagem) {
        return 0;
    }
}
