package com.pedro.cursojava.exercicios;

/*8.Ler um vetor A com 10 elementos e construir um vetor B de mesmo 
tipo e tamanho e com os mesmos elementos de A, sendo que estes 
deverão estar invertidos, ou seja, o primeiro elemento de A passa a 
ser o último de B, o segundo elemento de A passa a ser o penúltimo 
de B e assim por diante.*/

public class Exer106 {

	public static void main(String[] args) {
		
		int[] vetorA = {24, 84, 3, 6, 19, 5, 10, -2, 0};
		int[] vetorB = new int[10];
		
		System.out.print("Vetor_A: ");
		for(int j = 0; j<vetorA.length; j++) {
			System.out.print(vetorA[j]+" ");
		}
		System.out.println(" ");
		System.out.print("Vetor_B: ");
		for(int i=vetorA.length-1; i>=0; i--) {
			vetorB[i] = vetorA[i];
			System.out.print(vetorB[i]+ " ");
			
		}

	}

}
