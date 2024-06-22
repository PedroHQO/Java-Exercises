package com.pedro.cursojava.exercicios;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a divisão dos respectivos 
elementos em A e B, ou seja:
*/

public class exer88 {

	public static void main(String[] args) {
		int[] vetorA = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120};
		int[] vetorB = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
		int[] vetorC = new int[10];
		
		for(int i = 0; i <= vetorA.length; i++) {
			vetorC[i] = vetorA[i]/vetorB[i];
			
			System.out.println("VetorA: " + vetorA[i] + " / " + " VetorB: " + vetorB[i] + " = VetorC: " + vetorC[i]);
		}
	}

}
