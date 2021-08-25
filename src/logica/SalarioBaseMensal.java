package logica;
    // Elaborar um programa que leia o salário base mensal (SB) de um funcionário e
// o percentual de reajuste (PR) e calcule e apresente o novo valor de salário do funcionário.
// A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:

       // NS = SB + (SB*PR) / 100


   //     Onde:
     //   NS = Novo Salário
       // SB = Salário Base
        // PR = Percentual de Reajuste

import java.util.Scanner;

public class SalarioBaseMensal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário base: ");
        double salarioBase = entrada.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        int percentualReajuste = entrada.nextInt();

        double novoSalario = salarioBase + (salarioBase * percentualReajuste) / 100;
        System.out.println("O novo salário é: R$ " + novoSalario );
    }
}
