package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer64 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 0;
		int menor = 1000;
		int maior = 0;
		int resultado = 0;
		String letra;
		
		System.out.println("DIGITE UMA SEQUÊNCIA DE NÚMEROS");
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			resultado += num;
			
			if(num < 0 || num > 1000) {
				System.out.println("Digite números entre 0 e 1000");
				break;
			}
			
			if(maior <= num) {
				maior = num;
			}
			
			if(menor >= num) {
				menor = num;
			}
			
			System.out.println("Deseja para: ('s' para continuar ou 'n' para parar)");
			letra = ler.next();
		}while(letra.equalsIgnoreCase("s"));
		
		System.out.println("Soma: " + resultado);
		System.out.println("Maior num: " + maior);
		System.out.println("Menor num: " + menor);
		
		

	}

}
