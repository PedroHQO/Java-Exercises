package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Altere o programa de cálculo do fatorial, permitindo ao usuário calcular 
o fatorial várias vezes e limitando o fatorial a números inteiros positivos 
e menores que 16.*/

public class exer62 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int resu = 1;
		String letra = null;
		
		
		while(true) {
			System.out.println("Digite um numero: ");
			int num = ler.nextInt();

			
			if(num < 0 || num > 16) {
				System.out.println("NÚMERO INVÁLIDO!");
				System.out.println("Digite um numero INTEIRO POSITIVO E MENOR QUE '16': ");
				num = ler.nextInt();
				continue;
			}
			
			
			System.out.print(num + "!= ");
			
			for(int i = num; i>0; i--) {
				resu *= i;
				
				System.out.print(i + ".");
			}
			System.out.println(" = " + resu);
			resu = 1;
		}
			
		
	}

}
