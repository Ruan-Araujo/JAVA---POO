package aula05;

public class Main {
    public static void main(String[] args) {
        Jogo player1 = new Jogo("Senhor 1", "Mr.1");
        System.out.println(player1.getNickname() + " " + player1.aumentarPontuacao(1));
        System.out.println(player1.bonus(2));
        System.out.println(player1.getNickname() + " " + player1.subirNivel(2));

        Jogo player2 = new Jogo("Senhor 2", "Mr.2");
        System.out.println(player2.getNickname() + " " + player2.aumentarPontuacao(2));
        System.out.println(player2.bonus(2));
        System.out.println(player2.getNickname() + " " + player2.subirNivel(3));
    }
}
