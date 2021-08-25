package logica;
        //Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado,
        //ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.

import java.util.Scanner;

public class Ao2Ao3Ao10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inteiro: ");
        int valor = entrada.nextInt();

        double aoQuadrado = Math.pow(valor, 2);
        System.out.println("O valor elevado ao quadrado é: " + aoQuadrado);

        double aoCubo = Math.pow(valor, 3);
        System.out.println("O valor ao cubo é: " + aoCubo);

        double aDecima = Math.pow(valor, 10);
        System.out.println("Elevado a 10 é: " + aDecima);
    }
}
