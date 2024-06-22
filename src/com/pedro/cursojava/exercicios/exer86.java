package com.pedro.cursojava.exercicios;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a subtração dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] – B[i].*/

public class exer86 {

	public static void main(String[] args) {
		int[] vetorA = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
		int[] vetorB = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
		int[] vetorC = new int[10];
		
		for(int i=0; i<=vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			
			System.out.println( "VetorA: " + vetorA[i] + " - " + "vetorB: " + vetorB[i] + " = VetorC: " + vetorC[i]);
		}
		
		
	}

}
