package logica;

import java.util.Scanner;

// Elaborar um programa que realize a conversão de US$ para R$, o programa deve saber qual
  //o valor da cotação do dólar e fazer a conversão.
public class DolarParaReal {
    public static void main(String[] args) {

        System.out.println("Digite quantos doláres vc quer converter: ");
        Scanner input = new Scanner(System.in);
        double dolar = input.nextDouble();

        double valorDolarReal = 5.21;

        double reais = dolar * valorDolarReal;
        System.out.println(dolar + " dolares são " + reais + " reais");

    }
}
