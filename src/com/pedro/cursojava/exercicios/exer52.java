package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*. Faça um programa que leia 5 números e informe o maior número.*/

public class exer52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int maior = 0;
		int num = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "° num:");
			num = ler.nextInt();
			
			if(num >= maior) {
				maior = num;
				
			}
			
		}
		System.out.println("O maior número digitado é: " + maior);

	}

}
