package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		
		double salario, salarioLiq, valorPago, valorPago1, valorPago2;
		
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Taxas: 11% Imposto de renda; 8% INSS; 5% Sindicato\n");
		
		System.out.println("Digite o valor que você recebe por hora: ");
		double valorHora = calc.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas no mês: \n");
		double hora = calc.nextDouble();
		 
		salario = valorHora*hora;
		valorPago = salario * 0.08;
		valorPago1 = salario * 0.05;
		valorPago2 = salario * 0.11;
		salarioLiq = salario - valorPago - valorPago1 - valorPago2 ;
		
		System.out.println("Seu salário bruto total é: R$" + salario);
		System.out.println("Valor pago para o INSS: R$" + valorPago);
		System.out.println("Valor pago para o sindicato: R$" + valorPago1);
		System.out.println("Valor pago para o IR: R$" + valorPago2);
		System.out.println("Seu salário líquido total é: R$" + salarioLiq);

	}

}
