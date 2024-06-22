package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a quantidade de elementos armazenados neste 
vetor que são pares.*/

public class exer90 {

	public static void main(String[] args) {
		int[] vetorA = {25, 4, 17, 13, 6, 401, 26, 721, 28, 1};
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i< vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				par++;	
				
			}
			
		}
		System.out.println("Qtd PARES: " + par);
		
		

	}

}
