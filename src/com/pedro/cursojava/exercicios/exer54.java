package com.pedro.cursojava.exercicios;

/*Faça um programa que imprima na tela apenas os números ímpares 
entre 1 e 50*/

public class exer54 {

	public static void main(String[] args) {
		
		System.out.println("Apenas os ÍMPARES de 1 à 50");
		for(int i = 1; i <= 50; i++) {
			if(i%2 != 0) {
				System.out.print(i + "- ");
			}
		}
		
		

	}

}
