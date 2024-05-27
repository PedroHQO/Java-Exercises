package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.As Organizações Tabajara resolveram dar um aumento de salário aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o 
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o 
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento*/

/*Para imrprimir o valor com duas casas decimais (printf("%.2f %n")) Onde %.2f limita a duas casas 
 decimais depois da virgula e %n faz o papel do println pulando uma linha depois do argumento
 */

public class exer28 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu sálario:R$ ");
		double salario = ler.nextDouble();
		
		if(salario <= 280) {
			double valor = salario * 0.20;
			double total = salario + valor;
			System.out.println("Salario antigo:R$ " + salario);
			System.out.println("Percentual de aumento aplicado foi: 20%");
			System.out.printf("O valor do aumento:R$ %.2f %n", valor);
			System.out.printf("Novo salário:R$ %.2f %n", total);
		}else if(salario > 280 && salario <= 700) {
			double valor = salario * 0.15;
			double total = salario + valor;
			System.out.println("Salario antigo:R$ " + salario);
			System.out.println("Percentual de aumento aplicado foi: 15%");
			System.out.printf("O valor do aumento:R$ %.2f %n", valor);
			System.out.printf("Novo salário:R$ %.2f %n", total);
		}else if (salario > 700 && salario <= 1500) {
			double valor = salario * 0.10;
			double total = salario + valor;
			System.out.println("Salario antigo:R$ " + salario);
			System.out.println("Percentual de aumento aplicado foi: 10%");
			System.out.printf("O valor do aumento:R$ %.2f %n", valor);
			System.out.printf("Novo salário:R$ %.2f %n", total);
		}else {
			double valor = salario * 0.05;
			double total = salario + valor;
			System.out.println("Salario antigo:R$ " + salario);
			System.out.println("Percentual de aumento aplicado foi: 5%");
			System.out.printf("O valor do aumento:R$ %.2f %n", valor);
			System.out.printf("Novo salário:R$ %.2f %n", total);
		}

	}

}
