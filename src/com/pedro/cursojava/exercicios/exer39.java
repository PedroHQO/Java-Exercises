package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.Faça um Programa que peça um número inteiro e determine se ele é 
par ou impar. Dica: utilize o operador módulo (resto da divisão).
*/

public class exer39 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("Digite um número para saber se ele é par ou ímpar: ");
		int num = ler.nextInt();
		System.out.println("------------------------------------------");
		
		if(num == 0) {
			System.out.println("Este número é nulo!");
		}else if(num % 2 == 0) {
			System.out.println("Esté número é par!");
		}else {
			System.out.println("Esté numéro é ímpar!");
		}
		

	}

}
