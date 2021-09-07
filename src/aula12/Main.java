package aula12;

public class Main {

    public static void main(String[] args) {

        Conta contacorrente = new ContaCorrente(0, 500);

        Cliente cliente = new Cliente("12321", "Jo", "Soares", "25423525",
                contacorrente);

        cliente.getTipoConta().depositar(200);
        cliente.getTipoConta().sacar(300);
    }
}
