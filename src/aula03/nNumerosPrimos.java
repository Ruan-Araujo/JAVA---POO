package aula03;
//Desafio 1
        //Implemente um programa que nos permita exibir os primeiros números primos pelo
        //console, onde n é um valor numérico inserido pelo console. Por exemplo: Com n = 7, o
        //que o programa deve retornar é os primeiros 7 números primos são: 2, 3, 5, 7, 11, 13, 17

import java.util.Scanner;

public class nNumerosPrimos {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int inicio, fim, primo = 0;
        System.out.println("Digite o número inicial: ");
        inicio = entrada.nextInt();
        System.out.println("Digite o número final: ");
        fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    primo++;
                }
            }
            if (primo == 2){
                System.out.println("O número " + i + " é primo");
            }
            primo = 0;
        }
        entrada.close();
    }
}
