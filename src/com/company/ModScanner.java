package com.company;

import java.util.Scanner;

public class ModScanner {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Insira um primeiro número: ");
        int num1;
        num1 = scanner.nextInt();

        System.out.println("Insira um segundo número: ");
        int num2;
        num2 = scanner.nextInt();

        System.out.println("Insira um número quebrado: ");
        float coeficiente;
        coeficiente = scanner.nextFloat();

        System.out.println("Insira um nome");
        String nome;
        nome = scanner.next();

        char inicial;
        inicial = nome.charAt(0);
        System.out.println(inicial);
    }
}
