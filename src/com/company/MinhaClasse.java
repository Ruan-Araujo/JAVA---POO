package com.company;

import java.util.Scanner;

public class MinhaClasse {
    public static void main(String [] args){
        System.out.println("Bem vindo ao mundo java");
        int inteiro1 = 3;
        int inteiro2 = 5;

        for ( int i = 1; i <= 30; i ++){
            if (i % inteiro1 == 0 && i % inteiro2 == 0) {
                System.out.println("Divisivel por 3 e por 5");
            } else if (i % inteiro1 == 0) {
                System.out.println("Divisivel por 3");
            } else if (i % inteiro2 == 0){
                System.out.println("Divisivel por 5");
            } else {
                System.out.println(i);
            }
        }


        String caracteres = "Então quer dizer que em terra de Java, classe é rei.";
        String caractere = "ENTÃO QUER DIZER QUE EM TERRA DE Java, CLASSE É REI";
        System.out.println(caracteres.equals(caractere));

        int num = 2;
        int nume = 3;
        boolean comparar = nume == num;
        System.out.println(comparar);
        String nome= "Ruan";
        String sobrenome = "Araújo";
        String junto = nome + " " + sobrenome;
        System.out.println(junto);
    }
}
