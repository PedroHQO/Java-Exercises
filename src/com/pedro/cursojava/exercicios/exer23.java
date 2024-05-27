package com.pedro.cursojava.exercicios;

/*Faça um Programa que leia três números e mostre o maior deles*/

import java.util.Scanner;

public class exer23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		int num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número foi o primeiro digitado que é: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior número foi o segundo digitado que é: " + num2);
		}else{
			System.out.println("O maior número foi o terceiro digitado que é: " + num3);
		}

	}

}
