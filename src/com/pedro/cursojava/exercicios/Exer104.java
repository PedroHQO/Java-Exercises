package com.pedro.cursojava.exercicios;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes 
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi; 
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 
quando Ai for menor que Bi*/

public class Exer104 {

	public static void main(String[] args) {
		
		int[] vetorA = {2, 4, 6, 8, 10, 23, 71, 18, 20, 26};
		int[] vetorB = {3, 7, 6, 1, 14, 23, 63, 19, 13, 26};
		int[] vetorC = new int[10];
		
		System.out.print("VetorC = ");
		for(int i=0; i<vetorC.length; i++) {
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] += 1;
			}else if(vetorA[i] == vetorB[i]) {
				vetorC[i] += 0;
			}else {
				vetorC[i] += -1;
			}
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
