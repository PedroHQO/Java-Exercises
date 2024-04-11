package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*. Faça um programa que leia 5 números e informe a soma e a média 
dos números.*/

public class exer53 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		double media = 0;

		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "° num:");
			num = ler.nextInt();
			
			soma = soma + num;
			media = soma / 5;
			
			
		}
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da média: " + media);
	}

}
