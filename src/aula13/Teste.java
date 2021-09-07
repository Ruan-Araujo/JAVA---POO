package aula13;

public class Teste {

    public static void main(String[] args) {
        Pimentao p1 = new Pimentao();
                 p1.setPeso(20);
                 p1.setCor("Amarelo");
        Pimentao p2 = new Pimentao();
                 p2.setCor("Vermelho");
                 p2.setPeso(15);

        if (p1.compareTo(p2) > 0){
            System.out.println("O pimentão amarelo é maior que o vermelho");
        }else if (p1.compareTo(p2) < 0){
            System.out.println("O pimentão vermelho é maior que o amarelo");
        }else {
            System.out.println("O pimentão vermelho é igual ao amarelo");
        }
    }
}
