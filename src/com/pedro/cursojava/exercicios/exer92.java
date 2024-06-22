package com.pedro.cursojava.exercicios;

/*.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que determine a soma dos elementos armazenados neste vetor que 
são múltiplos de 5*/

public class exer92 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {2, 4, 6, 10, 5, 18, 15, 25, 30, 32};
		int soma = 0;
		
		for(int i = 0;i < vetorA.length; i++) {
			
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		System.out.println("Soma total dos elementos múltiplos de 5: " + soma);
	}

}
