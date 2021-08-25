package logica;
//Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.


import java.util.Scanner;

//    Onde:
      //  V = Volume
       // pi = 3.141592654
       // R = Raio da circunferência da lata
        //A = Altura da lata
        //OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
//      V = pi * R2 * A
public class Volume {
    public static void main(String[] args) {
        double volume;
        double pi = 3.14;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a circuferência da lata: ");
        double raioCircun = entrada.nextDouble();
        System.out.println("Digite a altura da lata: ");
        double alturaLata = entrada.nextDouble();

        volume = pi * (raioCircun * raioCircun) * alturaLata;
        System.out.println("O volume é " + volume + "cm ³");
    }
}
