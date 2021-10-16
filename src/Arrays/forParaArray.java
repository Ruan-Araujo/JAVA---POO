package Arrays;

import java.util.Scanner;

public class forParaArray {

    public static void main(String[] args) {

        int[] numero = new int[5];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++){
            System.out.println("Entre com o número " + (i + 1) + ": ");
            numero[i] = entrada.nextInt();
        }
        // Exibindo e somando
        for (int cont : numero){
            soma += cont;
        }

        System.out.println("A soma dos números que vc digitou é " + soma);
    }
}
