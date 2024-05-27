package com.pedro.cursojava.exercicios;

/*Faça um Programa que leia três números e mostre o maior e o menor 
deles.*/

import java.util.Scanner;

public class exer24 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = ler.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número foi o primeiro digitado que é: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior número foi o segundo digitado que é: " + num2);
		}else{
			System.out.println("O maior número foi o terceiro digitado que é: " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
				System.out.println("O menor número foi o primeiro digitado que é: " + num1);
		}else if(num2 < num1 && num2 < num3) {
				System.out.println("O menor número foi o segundo digitado que é: " + num2);
		}else{
				System.out.println("O menor número foi o terceiro digitado que é: " + num3);
			}
	}

}
