package com.pedro.cursojava.exercicios;

/*Faça um Programa que leia três números e mostre-os em ordem 
decrescente.*/

import java.util.Scanner;

public class exer26 {

	public static void main(String[] args) {
		
		Scanner decrescente = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = decrescente.nextInt();
		
		System.out.println("Digite um segundo número: ");
		int num2 = decrescente.nextInt();
		
		System.out.println("Digite um terceiro número: ");
		int num3 = decrescente.nextInt();
		
		System.out.println("Ordem descrescente...");
		
		if(num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println(num1 + "," + num2 + "," + num3);			
		}else if(num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println(num1 + "," + num3 + "," + num2);			
		}else if(num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println(num2 + "," + num1 + "," + num3);			
		}else if(num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println(num2 + "," + num3 + "," + num1);			
		}else if(num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println(num3 + "," + num2 + "," + num1);			
		}else {
			System.out.println(num3 + "," + num1 + "," + num2);
		}
		

	}

}
