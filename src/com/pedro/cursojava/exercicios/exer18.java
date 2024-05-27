package com.pedro.cursojava.exercicios;

/*Faça um Programa que peça dois números e imprima o maior deles*/

import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " é maior que "  + num2);
		}else {
			System.out.println(num2 + " é maior que " + num1);
		}
		

	}

}
