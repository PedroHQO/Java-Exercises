package com.pedro.cursojava.exercicios;

/*.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
que defina o percentual de elementos pares e ímpares, 
respectivamente, armazenados neste vetor.*/

public class exer94 {

	public static void main(String[] args) {
		
		int[] vetorA = {15, 1, 285, 39, 14, 295, 6903, 682, 241, 5};
		double contPar = 0;
		double contImpar = 0;
		double percenPar = 0;
		double percenImpar = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				contPar++;
				
			}
			
			if(vetorA[i] % 2 == 1) {
				contImpar++;
			}
			percenPar = (contPar / 10) * 100;
			percenImpar = (contImpar / 10) * 100;
		}
		System.out.println("Percentual de Pares no vetor: " + percenPar + "%");
		System.out.println("Percentual de Impares no vetor: " + percenImpar + "%");
		
	}

}
