package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
imprima a tabuada de cada um dos elementos do vetor A.*/

public class Exer109 {

	public static void main(String[] args) {
		
		int[] vetorA = {2, 4, 6, 8, 7};
		int mult = 0;
		
		
		System.out.print("TABUADA DOS ELEMENTOS: ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+ ", ");
		}
		System.out.println("");
		for(int i=1;i<=10;i++) {
			for(int j = 0; j< vetorA.length; j++) {
				System.out.println(i + " x " + vetorA[j] + " = " + i * vetorA[j]);
			
			}
			System.out.println("------------------");
		}
		
		
	}

}
