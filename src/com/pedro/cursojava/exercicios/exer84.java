package com.pedro.cursojava.exercicios;

/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).*/

public class exer84 {

	public static void main(String[] args) {
		
		int[] vetorA = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
			
			System.out.println("VetorA: " + vetorA[i] + " x " + i + " = VetorB: " + vetorB[i]);
		}

	}

}
