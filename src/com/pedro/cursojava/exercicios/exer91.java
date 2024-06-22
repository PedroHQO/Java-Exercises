package com.pedro.cursojava.exercicios;

/*2.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a soma de todos os elementos armazenados 
neste vetor.*/

public class exer91 {

	public static void main(String[] args) {
		int[] vetorA = {9, 12, 13, 8, 7, 14, 15, 67, 27, 26};
		int cont = 0;
		
		System.out.println("Somando as Posições do vetor");
		for(int i = 1; i< vetorA.length; i++) {
			
			cont += vetorA[i];
			
		}
		System.out.println("Soma do Array: " + cont);
	

	}

}
