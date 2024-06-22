package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 
quando Ai for ímpar.*/

public class Exer103 {

	public static void main(String[] args) {
		
		int[] vetorA = {21, 4, 30, 9, 10, 1, 17, 19, 18, 20};
		int[] vetorB = new int [10];
		int cont = 0;
		
		System.out.print("VetorB = ");
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[i] += 1;
			}else {
				vetorB[i] += 0;
			}
			System.out.print(vetorB[i]+ " ");
		}
		
	}

}
