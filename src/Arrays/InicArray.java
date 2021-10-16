package Arrays;

import java.util.Arrays;

public class InicArray {

    public static void main(String[] args) {

        // Criando um array com capacidade para 100 valores do tipo int
        int[] numeros = new int[100];

        //Modificando o conteúdo das posições 0 e 99
        numeros[0] = 27;
        System.out.println(numeros[0]);

        numeros[99] = 99;
        System.out.println(numeros[99]);

        int [] nume= {100 ,87};
        System.out.println ( numeros [1]) ;
        System.out.println ( numeros [2]) ;

        // Percorrendo Array

        for (int i = 0; i < 100; i++){
            System.out.println(numeros[i] = i);
        }

       // for ( int i = 0; i < numeros . length ; i ++) {
         //   System.out.println( numeros [ i ]) ;
        //}

        for (int numero : numeros){
            System.out.println("Número " + numero);
        }

        // Método sort

        String[] nomes = {"Ruan", "Araújo", "Cibelle", "Malcher"}; // Inicializando um array de Strings
        Arrays.sort(nomes);
        for (String nome : nomes){
            System.out.println(nome);
        }

        // copyOf
        String[] nomesDuplicados = Arrays.copyOf(nomes, 4);
        for (String nom : nomesDuplicados){
            System.out.println(nom);
        }

        //fill
        int[] nu = new int[10];
        Arrays.fill(nu, 5);
        for (int n : nu){
            System.out.println(n);
        }
    }
}
