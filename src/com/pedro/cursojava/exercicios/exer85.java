package com.pedro.cursojava.exercicios;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a soma dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] + B[i]*/

public class exer85 {

	public static void main(String[] args) {
		int[] vetorA = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
		int[] vetorB = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
		int[] vetorC = new int[10];
		
		for(int i=0; i<=vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.println("vetorA: " + vetorA[i] + " + " + "vetorB: " + vetorB[i] + " = vetorC: " + vetorC[i]);
		}

	}

}
