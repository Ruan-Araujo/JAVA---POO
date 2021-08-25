package logica;
// Desenvolver um programa que apresente e calcule o volume de uma caixa retangular, utilize a fórmula abaixo:

   //     V=C*L*A

     //   Onde:
       // V = Volume em cm3
       // C = Comprimento
       // L = Largura
       // A = Altura

import java.util.Scanner;

public class VolumeRetangular {
    public static void main(String[] args) {


        float volume;
        float comprimento;
        float largura;
        float altura;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento: ");
        comprimento = input.nextFloat();
        System.out.println("Digite a largura: ");
        largura = input.nextFloat();
        System.out.println("Digite a altura: ");
        altura = input.nextFloat();

        volume = comprimento * largura * altura;
        System.out.println("O volume é: " + volume + " cm³");

    }
}
