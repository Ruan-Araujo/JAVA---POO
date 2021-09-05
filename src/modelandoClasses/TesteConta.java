package modelandoClasses;

public class TesteConta {
    public static void main(String[] args) {
        // Instanciando o objeto
        Conta conta = new Conta(1234, 123.5, 200.50);
        System.out.println(conta.getNum());
        System.out.println(conta.getLimite());
        System.out.println(conta.getSaldo());

        //utilizando o métodp
        conta.deposita(2000);
        System.out.println(conta.getSaldo());

        //Armazenando dados do método em variável

        // Saldo
        double saldoDisponivel = conta.consultarSaldoDisponivel();
        System.out.println("Saldo disponível: " + saldoDisponivel);

        // Saque
        conta.saque(2000);
    }
}
