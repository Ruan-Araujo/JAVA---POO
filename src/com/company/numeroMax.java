package com.company;

import java.util.Scanner;

public class numeroMax {
    public static int numeroMaximo(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }else if (num2 > num1 && num2 > num3){
            return num2;
        }else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        System.out.println(numeroMaximo(numero1, numero2, numero3));
    }
}
