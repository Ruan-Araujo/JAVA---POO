package logica;
//Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

  //      A = piR2

    //    Onde:
      //  A representa a área do círculo
       // pi= 3.141592654
       // R = Raio do círculo (deve ser fornecido pelo usuário)

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double A;
        double pi = 3.141592654;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        A = pi * (raio * raio);
        System.out.println(A);
    }
}
