package aula03;
//Desafio 2
  //      Faça um programa que permita jogar o jogo Pedra-Papel-Tesoura.
import java.sql.SQLOutput;
import java.util.Scanner;

public class jokenpo {

    public static void main(String[] args) {
        // Solicitando o nome de cada jogador
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Primeiro jogador: ");
        String jogadorA = entrada.nextLine();
        System.out.println("Digite o nome do Segundo jogador: ");
        String jogadorB = entrada.nextLine();

        //Qual a opção esse jogador escolhe para
        //      //  jogar: pedra, papel ou tesoura.

        String opcaoA = "Pedra";
        String opcaoB = "Papel";
        String opcaoC = "Tesoura";

        // perguntar qual opção cada um escolhe
        // e somar pontos ao vencedor

        System.out.println(jogadorA + " qual você escolhe:" + " digite 0 para " + opcaoA + " , digite 1 para " +  opcaoB + ", digite 2 para " + opcaoC);
        int escolhaJogadorA = entrada.nextInt();
        System.out.println(jogadorB + " qual você escolhe:" + " digite 0 para " + opcaoA + " , digite 1 para " +  opcaoB + ", digite 2 para " + opcaoC);
        int escolhaJogadorB = entrada.nextInt();
        int pontosJogadorA = 0;
        int pontosJogadorB = 0;


        if (escolhaJogadorA >= 3 || escolhaJogadorA < 0 && escolhaJogadorB >=3 || escolhaJogadorB <0){
            System.out.println("Escolha um número válido");
        }else if (escolhaJogadorA == 0 && escolhaJogadorB == 2){
            pontosJogadorA++;
            System.out.println(jogadorA + " ganhou");
        }else if (escolhaJogadorB == 0 && escolhaJogadorA == 2){
            pontosJogadorB++;
            System.out.println(jogadorB + " ganhou");
        }else if (escolhaJogadorB > escolhaJogadorA){
            pontosJogadorB++;
            System.out.println(jogadorB + " ganhou");
        }else if (escolhaJogadorA > escolhaJogadorB){
            pontosJogadorA++;
            System.out.println(jogadorA +  " ganhou");
        }else if (escolhaJogadorA == escolhaJogadorB){
            System.out.println("É um empate");
        }
    }
}
