package com.pedro.cursojava.exercicios;

/*.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou 
seja: B[i] := A[i] % 2.*/

public class exer89 {

	public static void main(String[] args) {
		
		int[] vetorA = {8, 16, 4, 15, 19, 7, 27, 26, 14, 3};
		int[] vetorB = new int[10];
		
		for(int i = 0; i<=vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
			
			System.out.println("VetorA: " + vetorA[i] + " % 2 = VetorB: " + vetorB[i]);
		}

	}

}
