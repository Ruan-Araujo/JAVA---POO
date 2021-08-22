package exercicio;

public class TestandoCliente {
    public static void main(String[] args) {
        Cliente clienteI = new Cliente("Ronaldo", 1);
        Cliente clienteII = new Cliente("Ryan", 2);
        System.out.println(clienteI.getNome());
        System.out.println(clienteI.getCodigo());
        System.out.println(clienteII.getNome());
        System.out.println(clienteII.getCodigo());
    }
}
