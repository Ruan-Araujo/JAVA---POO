package aula12;

import java.util.Scanner;

public class ContaCorrente extends Conta{

    private double saldo;
    private double chequeEspecial;

    public ContaCorrente(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Você depositou: " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo){
            System.out.println("Você sacou " + valor);
        }else {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Deseja usar o cheque especial ? S ou N");
            String clienteOption = entrada.nextLine();
            chequeEspecial -= valor;
            System.out.println(clienteOption.equals("S") ? "Você sacou " + valor +
                    " , sobrou no cheque especial " + chequeEspecial
                    : "Saldo insuficiente");
        }
    }

    @Override
    public void mostrarSaldo() {
        System.out.println(this.getSaldo());
    }
}
