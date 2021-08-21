package aula04;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhaoNovo = new Caminhao("Ford", "AB XXX CD");
        Caminhao.mudarPrecoCombustivel(2.40);
        System.out.println("Gasto em combustivel " + caminhaoNovo.gastoCombustivel(40) + " Reais");
    }
}
