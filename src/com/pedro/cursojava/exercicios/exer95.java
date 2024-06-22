package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Escrever um programa 
que calcule e escreva: a) a soma de elementos armazenados neste 
vetor que são inferiores a 15; b) a quantidade de elementos 
armazenados no vetor que são iguais a 15; e c) a média dos 
elementos armazenados no vetor que são superiores a 15.*/

public class exer95 {

	public static void main(String[] args) {
		
		int[] vetorA = {1, 3, 5, 9, 12, 15, 18, 21, 15, 27};
		int soma = 0;
		int cont = 0;
		double media = 0;
		double soma2 = 0;
		double cont2 = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] < 15) {
				soma += vetorA[i];
			}
			if(vetorA[i] == 15) {
				cont ++;
			}
			if(vetorA[i] > 15) {
				soma2 += vetorA[i];
				cont2++;
			}
			media = soma2/cont2;
		}
		
		System.out.println("Soma Total de inferiores a 15: " + soma);
		System.out.println("Qtd de elemntos iguais a 15: " + cont);
		System.out.println("Média dos elemntos superiores a 15: " + media);
	}

}
