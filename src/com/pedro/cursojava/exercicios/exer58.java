package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*3.Faça um programa que peça dois números, base e expoente, calcule e 
mostre o primeiro número elevado ao segundo número. Não utilize a 
função de potência da linguagem.*/

public class exer58 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int resul = 1;// resul = 1, pois se for 0, qualquer coisa * 0, é sempre = 0
		
		System.out.println("Digite a base: ");
		int base = ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		int exp = ler.nextInt();
		
		for(int i = 1; i <= exp; i++) {
			
			// resul = resul * base
			resul *= base;
		}
		System.out.println("Resultado:" + base + "^" + exp + " = " + resul);

	}

}
