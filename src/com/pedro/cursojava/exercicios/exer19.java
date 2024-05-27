package com.pedro.cursojava.exercicios;

/*Faça um Programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo.*/

import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("O valor " + valor + " é positivo!");
		}else if(valor < 0) {
			System.out.println("O valor " + valor + " é negativo!");
		}else {
			System.out.println("O valor é nulo");
		}
		

	}

}
