package com.pedro.cursojava.exercicios;

import java.util.Arrays;

/*Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, 
sendo este a junção dos dois outros vetores. Os primeiros 10 
elementos de C deverão receber os elementos de A e os últimos 
elementos C deverão receber os elementos de B. Desta forma, C 
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

public class Exer107 {

	public static void main(String[] args) {
		
		int[] vetorA = {24, 84, 3, 6, 19, 5, 10, -2, 0};
		int[] vetorB = {2, 4, 6, 81, 10, 12, 14, 16, 18, 20};
		int[] vetorC = Juntar(vetorA, vetorB); // Criei um método Juntar onde dentro do Array vetorC terá (vetorA, vetorB)
		
		System.out.print(Arrays.toString(vetorC));//Após importar o método  java.util.Array, eu chamo o vetorC na classe main 
		
	}

	private static int[] Juntar(int[] vetorA, int[] vetorB) {
		int[] vetorC = new int[vetorA.length + vetorB.length]; //vetorC recebe o tamanho de vetorA + vetorB que no caso será vetorC[20]
		int cont = 0; //defino uma variavel cont
		
		for(int i=0; i<vetorA.length; i++) {
			vetorC[cont++] = vetorA[i];//a variavel cont recebe os valores de vetorA[i] conforme for avançando e guardando dentro de cont++ que está em vetorC
	}
		
		for(int i=0; i<vetorB.length; i++) { 
			vetorC[cont++] = vetorB[i];//a variavel cont recebe os valores de vetorB[i] conforme for avançando e guardando dentro de cont++ que está em vetorC
		}
		return vetorC;//Eu peço para retornar todo esse método para vetorC
	}

}
