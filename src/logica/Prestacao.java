package logica;
// Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:

  //      P=VALOR + (VALOR * (TAXA / 100)* TEMPO)

    //    Onde P é o valor da prestação em atraso

import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        int prestacao;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = entrada.nextInt();
        System.out.println("Digite a taxa: ");
        int taxa = entrada.nextInt();
        System.out.println("Digite o tempo: ");
        int tempo = entrada.nextInt();

        prestacao = valor + (valor * (taxa / 100) * tempo);
        System.out.println("O valor da prestação é " + prestacao);
    }
}
