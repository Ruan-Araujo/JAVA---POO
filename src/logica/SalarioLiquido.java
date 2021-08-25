package logica;
//Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

  //      SB = HT * VH
    //    TD = (PD / 100) * SB
      //  SL = SB  - TD

        //Onde:
       // SB =  Salário Base
        //HT = Horas Trabalhadas
        //VH = Valor Hora de trabalho
        //TD = Total de Descontos
        //PD = Percentual de Desconto
        //SL = Salário Líquido


import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {

        double salarioBase;
        int horasTrabalhadas;
        double valorHoraTrabalho;
        double totalDescontos;
        double percentualDesconto;
        double salarioLiquido;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();
        System.out.println("Digite o valor da hora de trabalho: ");
        valorHoraTrabalho = entrada.nextDouble();
        salarioBase = (double)horasTrabalhadas * valorHoraTrabalho;
        System.out.println("Digite o percentual de desconto: ");
        percentualDesconto = entrada.nextDouble();
        totalDescontos = (percentualDesconto / 100) * salarioBase;
        salarioLiquido = salarioBase - totalDescontos;
        System.out.println("O salario liquido e: " + salarioLiquido);

    }
}
