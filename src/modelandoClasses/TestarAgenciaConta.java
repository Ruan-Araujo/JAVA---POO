package modelandoClasses;

public class TestarAgenciaConta {

    public static void main(String[] args) {
        Agencia agencia = new Agencia(23454);
        Conta conta = new Conta(23455, 2000, 3000);

        conta.agencia = agencia;
        System.out.println(conta.agencia.getNumero());
    }
}
