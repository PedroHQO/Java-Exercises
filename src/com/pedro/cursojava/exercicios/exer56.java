package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.Altere o programa anterior para mostrar no final a soma dos números.*/

public class exer56 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int inicio = 0;
		int fim = 0;
		int soma = 0;
		
		System.out.println("Digite número para iniciar a contagem: ");
		inicio = ler.nextInt();
		
		System.out.println("Digite número para terminar a contagem: ");
		fim = ler.nextInt();
		
		System.out.println("Números no intervalo entre: " + inicio + " e " + fim);
		
		for(int i = inicio + 1; i < fim; i++) {
			System.out.print(i + "-");
			//System.out.print(" ");
			
			soma = i + soma;
		}
		System.out.println("\nA soma dos números é: " + soma);
		
	}

}
