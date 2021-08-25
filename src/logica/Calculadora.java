package logica;

import java.util.Scanner;
        //Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o resultado das
        //quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).

public class Calculadora {
    public static void calc(int num1, int num2, String operacao){
        switch (operacao){
            case "somar":
                System.out.println(num1 + num2);
                break;
            case "subtrair":
                System.out.println(num1 - num2);
                break;
            case "multiplicar":
                System.out.println(num1 * num2);
                break;
            case "dividir":
                if (num2 != 0){
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("Insira uma opção valida");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite qual operação você deseja fazer: ");
        String operacao = entrada.next();
        operacao = operacao.toLowerCase();

        calc(num1, num2, operacao);
    }
}

