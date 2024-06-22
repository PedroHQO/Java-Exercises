package com.pedro.cursojava.exercicios;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a multiplicação dos 
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i].*/

public class exer87 {

	public static void main(String[] args) {
		
		
		int[] vetorA = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
		int[] vetorB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] vetorC = new int[10];
		
		for(int i = 0; i<=vetorA.length; i++) {
			vetorC[i] = vetorA[i]*vetorB[i];
			
			System.out.println("VetorA: " + vetorA[i] + " x " + " VetorB: " + vetorB[i] + " = VetorC: " + vetorC[i]);
			
			
			
			}
		}
	
	}


