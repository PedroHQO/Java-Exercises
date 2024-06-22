package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a média aritmética simples dos elementos 
ímpares armazenados neste vetor.*/

public class exer93 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {10, 4, 27, 5, 29, 27, 17, 4, 91, 5};
		int cont = 0;
		int soma = 0;
		double mediaAritmetica = 0;
		for(int i = 0; i<vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 1) {
				
				soma += vetorA[i];
				cont++;
				
				mediaAritmetica = soma / cont;
			}
		}

		System.out.printf("Média Aritmetica = %.2f", mediaAritmetica);
	}

}
