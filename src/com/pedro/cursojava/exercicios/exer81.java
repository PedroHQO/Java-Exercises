package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho e com os elementos do vetor A multiplicados 
por 2, ou seja: B[i] = A[i] * 2*/

public class exer81 {

	public static void main(String[] args) {
		
		int[] vetorA = new int [8]; 
		int[] vetorB = new int [vetorA.length];
		
		vetorA[0] = 3;
		vetorA[1] = 6;
		vetorA[2] = 9;
		vetorA[3] = 12;
		vetorA[4] = 15;
		vetorA[5] = 18;
		vetorA[6] = 21;
		vetorA[7] = 24;
		
		
		
		for(int i = 0; i<=vetorA.length; i++) {
			
			vetorB[i] = vetorA[i]*2;
			
			System.out.println("VetorA: " + vetorA[i] + " * 2 = " + "Vetor B: " + vetorB[i]);
				
			
			
			
		}
		
		
		
		
		

	}

}
