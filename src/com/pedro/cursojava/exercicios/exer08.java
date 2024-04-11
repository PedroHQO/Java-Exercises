package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		double salario;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você recebe por hora: ");
		double valorHora = calc.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		double hora = calc.nextDouble();
		
		salario = valorHora*hora;
		
		System.out.println("Seu salário total é: R$" + salario);
		

	}

}
