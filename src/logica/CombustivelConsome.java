package logica;
       // Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
       // Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível,
       // desenvolva o cálculo utilizando a fórmula abaixo:

        // D=T.V
        // LU=D / 12

        //Onde:
        //D = Distância em Km
        //T = Tempo gasto na viagem
        //V = Velocidade

import java.util.Scanner;

public class CombustivelConsome {
    public static void main(String[] args) {
        float distanciaKm;
        float tempoGasto;
        float velocidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tempo de viagem: ");
        tempoGasto = entrada.nextFloat();

        System.out.println("Digite a velocidade: ");
        velocidade = entrada.nextFloat();

        distanciaKm = tempoGasto * velocidade;
        float litrosUsados = distanciaKm / 12;

        System.out.println("Foram usados " + litrosUsados + " litros de combustível");
    }
}
