package modelandoClasses;

public class TestarClienteECartao {

    public static void main(String[] args) {
        // Criando os objetos
        Cliente cliente = new Cliente("Ruan", 23455464);
        CartaoCredito cartaoCredito = new CartaoCredito(234534, "27/10");

        // Ligando os Objetos - agregação
        cartaoCredito.cliente = cliente;

        // Imprimindo os dados
        System.out.println(cartaoCredito.getNumero());
        System.out.println(cartaoCredito.cliente.getNome());
    }
}
