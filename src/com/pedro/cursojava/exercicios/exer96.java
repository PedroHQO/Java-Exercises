package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35 
anos.*/

public class exer96 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int idade = 0;
		int cont = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(i + " idade: " );
			vetorA[i] = ler.nextInt();
			
			if(vetorA[i] > 35) {
				cont++;
			}
			
		}
		System.out.println("Total de idade acima de 35: " + cont);

	}

}
