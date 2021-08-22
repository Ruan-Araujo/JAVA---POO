package exercicio;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 123.5, 200.50);
        System.out.println(conta.getNum());
        System.out.println(conta.getLimite());
        System.out.println(conta.getSaldo());
    }
}
