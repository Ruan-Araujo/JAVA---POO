package modelandoClasses;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(1000);

        System.out.println("Salário: " + g.getSalario());

        System.out.println("Aumentando salário em 10%");
        g.aumentarSalarioTxFixa();

        System.out.println("Aumentando salário em 30%");
        g.aumentarSalarioTxVar(1.3);
    }
}
