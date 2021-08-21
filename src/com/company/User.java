package com.company;

import java.util.Scanner;

public class User {

    public static String dataNasc(String dia, String mes, String ano){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }

    public static void main(String [] args){
    // Public = pode ser acessado por todos os métodos, pode ser acessado por todos
    // Static = ele vai se comportar/ ser executado sempre do mesmo jeito para todas as classes
    // Void = Diz que ele nao retorna valor algum no método
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua data de nascimento:");
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println(nome + " " + sobrenome);

        System.out.println(inicialN + "" + inicialS);

        System.out.println(dataNasc(dia, mes, ano));
    }
}
