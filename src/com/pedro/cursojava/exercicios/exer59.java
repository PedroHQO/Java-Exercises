package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre a 
quantidade de números pares e a quantidade de números impares.*/

public class exer59 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int num;
		
		System.out.println("Digite 10 números");
		
		for(int i = 1; i <= 10; i++) {

			System.out.print(i + "°num:");
			num = ler.nextInt();
			
			if(num % 2 == 0){
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Quantidade de número PARES: " + par);
		System.out.println("Quantidade de número ÍMPARES: " + impar);

	}

}
