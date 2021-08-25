package logica;
//Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F).
  //      Utilize a fórmula abaixo:

    //    F = ( 9 * C) /5

import java.util.Scanner;

public class CelsiusFahren {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos graus celsius deseja converter: ");
        double celsius = entrada.nextInt();

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " graus celsius " + "convertido para graus fahrenheit é igual a: " + fahrenheit + " graus");

    }
}
