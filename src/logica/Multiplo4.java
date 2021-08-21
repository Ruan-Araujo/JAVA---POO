package logica;

public class Multiplo4 {
    public static void main(String[] args) {
        //Faça um programa que percorra todos os número de 1 até 100. Para os números múltiplos de 4,
          //      imprima a palavra “PI”, e para os outros, imprima o próprio número.
        for (int i = 1; i <=100; i++){
            if (i % 4 == 0){
                System.out.println("PI");
            }else {
                System.out.println(i);
            }
        }
    }
}
