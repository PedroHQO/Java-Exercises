package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os 
números inteiros que estão no intervalo compreendido por eles.*/

public class exer55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int inicio = 0;
		int fim = 0;
		
		System.out.println("Digite número para iniciar a contagem: ");
		inicio = ler.nextInt();
		
		System.out.println("Digite número para terminar a contagem: ");
		fim = ler.nextInt();
		
		System.out.println("Números no intervalo entre: " + inicio + " e " + fim);
		
		for(int i = inicio + 1; i < fim; i++) {
			System.out.print(i + "-");
		}
		
		
	}

}
