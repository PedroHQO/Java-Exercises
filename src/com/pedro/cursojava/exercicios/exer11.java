package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		double result, result2, result3, expoente;
		
		expoente = 3;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num1 = calc.nextInt();
		
		System.out.println("Digite mais um número inteiro: ");
		int num2 = calc.nextInt();
		
		System.out.println("Digite um número real: ");
		double num3 = calc.nextDouble();
		
		result = (2 * num1) * num2/2;
		result2 = (3 * num1) + num3;
		result3 = Math.pow(num3, expoente);
		
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + result);
		System.out.println("A soma do triplo do primeiro com terceiro: " + result2);
		System.out.println("O terceiro elevado ao cubo: " + result3);
		

	}

}
