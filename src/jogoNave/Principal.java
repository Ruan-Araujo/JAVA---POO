package jogoNave;

public class Principal {
    public static void main(String[] args) {

        Nave nave = new Nave(2, 4, 'N', 2000, 1000);
        Asteroide asteroide = new Asteroide(1, 3, 'S', 5000);

        System.out.println("A nave está na direção X: " + nave.getPosX());
        System.out.println("E na direção Y: " + nave.getPosY());
        System.out.println("No sentido: " + nave.getDirecao());

        System.out.println("O asteroide está na direção X: " + asteroide.getPosX());
        System.out.println("E na direção Y: " + asteroide.getPosY());
        System.out.println("No sentido: " + asteroide.getDirecao());

        System.out.println("==================================================================================================================================");
        nave.irA(1, 2, 'N');
        System.out.println("A nave está mudando de rota, direçaoX: " + nave.getPosY() + " direção y: " + nave.getPosY() + " sentido: " + nave.getDirecao());

        asteroide.irA(1, 2, 'N');
        System.out.println("O asteroide muda de sentido, direção x:  " + asteroide.getPosY() + " direção y: " + asteroide.getPosY() + " sentido: " + asteroide.getDirecao());
        System.out.println("===================================================================================================================================");

        if (nave.getPosX() == asteroide.getPosX() && nave.getPosY() == asteroide.getPosY()){
            System.out.println("Kabumm, a nave já era");
            System.out.println("A nave recebeu: " + nave.restaVida(asteroide.danos()) + " de dano");
        }
    }
}
