package aula05;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(7, "Ruan");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getNumeroCliente());
        System.out.println(cliente.getDivida());
        System.out.println(cliente.aumentarDivida(2000));
        cliente.setNome("Kennedy");
        System.out.println(cliente.getNome());
    }
}
