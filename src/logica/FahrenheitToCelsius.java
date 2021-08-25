package logica;
//Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C).
  //      Utilize a fórmula abaixo:

import java.util.Scanner;

//    C = (( F - 32) *  5)/9
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos graus Fahrenheit (F) deseja converter para celsius ?");
        double fah = input.nextInt();

        double celsius = (fah - 32) / 1.8;

        System.out.println("São " + celsius + " graus celsius");
    }
}
