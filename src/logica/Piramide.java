package logica;

import java.util.Scanner;

// Crie um programa que imprima na tela um triângulo de “*”.
public class Piramide {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos asteristicos deve ter o piso da piramide?");
        int pisos = entrada.nextInt();

        for (int i = 1; i <= pisos; i++){
            for (int j = 1; j <= pisos; j++){
                System.out.print("");
            }
            for (int k = 0; k <= i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
