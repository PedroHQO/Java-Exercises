package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.Faça um Programa que peça um número e informe se o número é 
inteiro ou decimal. Dica: utilize uma função de arredondamento.*/

public class exer40 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = ler.nextDouble();
		
		if(num % 1 != 0) {
			System.out.println("O número digitado é decimal");
			System.out.println("O número digitado arredondando foi: " + Math.round(num));
		}else {
			System.out.println("O número digitadado não é decimal");
		}
	}

}
