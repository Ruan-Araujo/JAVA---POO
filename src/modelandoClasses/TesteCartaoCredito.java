package modelandoClasses;

public class TesteCartaoCredito {
    public static void main(String[] args) {
        CartaoCredito cartaoCreditoI = new CartaoCredito(222222, "12/22");
        System.out.println(cartaoCreditoI.getDataValidade());
        System.out.println(cartaoCreditoI.getNumero());

        CartaoCredito cartaoCreditoII = new CartaoCredito(33333, "11/23");
        System.out.println(cartaoCreditoII.getNumero());
        System.out.println(cartaoCreditoII.getDataValidade());
    }

}
