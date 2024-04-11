package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento, 
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
a empresa que deposita). O Salário Líquido corresponde ao Salário 
Bruto menos os descontos. O programa deverá pedir ao usuário o 
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela 
as informações, dispostas conforme o exemplo abaixo.*/

public class exer29 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.printf("Digite o valor da sua hora:R$ %n");
		double hora = ler.nextDouble();
		
		System.out.printf("digite a quantidade de horas trabalhadas no mês: %n");
		int horasTotal = ler.nextInt();
		double salarioBruto = hora * horasTotal;
		double descoSindicato = salarioBruto * 0.1;
		double descoFgts = salarioBruto * 0.11;
		
		if(salarioBruto <= 900) {
			System.out.println("Salário Bruto:R$ " + salarioBruto);
			System.out.println("Isento do IR");
			System.out.println("Valor descontado do INSS (10%):R$ " + descoSindicato);
			System.out.println("Valor do FGTS (11%):R$ " + descoFgts);
			System.out.println("Total de descontos:R$ " + descoSindicato);
			System.out.println("Salário Líquido:R$ " + (salarioBruto - descoSindicato));	
		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("Salário Bruto:R$ " + salarioBruto);
			double descoIr = salarioBruto * 0.05;
			System.out.println("Valor descontado do IR (5%):R$ " + descoIr);
			System.out.println("Valor descontado do INSS (10%):R$ " + descoSindicato);
			System.out.println("Valor do FGTS (11%):R$ " + descoFgts);
			System.out.println("Total de descontos:R$ " + (descoIr + descoSindicato));
			System.out.println("Salário Líquido:R$ " + (salarioBruto - descoSindicato - descoIr));	
		}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("Salário Bruto:R$ " + salarioBruto);
			double descoIr = salarioBruto * 0.10;
			System.out.println("Valor descontado do IR (10%):R$ " + descoIr);
			System.out.println("Valor descontado do INSS (10%):R$ " + descoSindicato);
			System.out.println("Valor do FGTS (11%):R$ " + descoFgts);
			System.out.println("Total de descontos:R$ " + (descoIr + descoSindicato));
			System.out.println("Salário Líquido:R$ " + (salarioBruto - descoSindicato - descoIr));;	
		}else {
			System.out.println("Salário Bruto:R$ " + salarioBruto);
			double descoIr = salarioBruto * 0.20;
			System.out.println("Valor descontado do IR (20%):R$ " + descoIr);
			System.out.println("Valor descontado do INSS (10%):R$ " + descoSindicato);
			System.out.println("Valor do FGTS (11%):R$ " + descoFgts);
			System.out.println("Total de descontos:R$ " + (descoIr + descoSindicato));
			System.out.println("Salário Líquido:R$ " + (salarioBruto - descoSindicato - descoIr));;
		}
		
	}

}
