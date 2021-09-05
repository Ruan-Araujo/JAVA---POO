package aula12;

public class ClienteBanco extends Cliente{

    public ClienteBanco(String numeroCliente, String nome, String rg, String cpf, String tipoConta) {
        super(numeroCliente, nome, rg, cpf, tipoConta);
    }

    ClienteBanco cliente0 = new ClienteBanco("777", "godofredo", "7689", "993", "Poupança");

    ClienteBanco cliente1 = new ClienteBanco("9999", "Josualdo", "343242", "41141412414", "Corrente");

}
