package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que peça um número inteiro e determine se ele é 
ou não um número primo. Um número primo é aquele que é divisível 
somente por ele mesmo e por 1.*/

public class exer65 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		boolean numPrimo ;
		
		System.out.println("NÚMERO PRIMO?");
		System.out.println("Digite um número: ");
		int num = ler.nextInt();
		
		if(num < 2) { // Número menor que 2 não é primo
			numPrimo = false; 
		}else if(num == 2) {//Se digitar 2 é primo
			numPrimo = true;
		}else if(num % 2 == 0) {//Qualquer número par que seja dividido por 2 não é primo
			numPrimo = false;
		}else {
			numPrimo = true;
			
			for(int i = 3; i < num; i += 2) {// a ideia é testar apenas os impares, visto que os pares já foram verificados
				if(num % i == 0) {
					numPrimo = false;
					
					break;// Encerro o for aqui dentro 
				}
			}
		}
		
		if(numPrimo) {
			System.out.println(num + " é NÚMERO PRIMO!");
		}else {
			System.out.println(num + " não é NÚMERO PRIMO!");
			for(int n = num; n < 1000; n+= num)
				System.out.println("Números divísiveis por " + num + " = " + n);
			
		}
		
		
	}

}
