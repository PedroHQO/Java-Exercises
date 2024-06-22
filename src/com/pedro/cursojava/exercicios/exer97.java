package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e 
escreva a menor e a maior idades e suas respectivas posições.*/

public class exer97 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int menor = 100;
		int maior = 0;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Posi_"+ i + " Digite sua idade: ");
			vetorA[i] = ler.nextInt();
		
			if(vetorA[i] > maior) {
				maior = vetorA[i];
				posMaior = i;
			}
			if(vetorA[i] < menor) {
				menor = vetorA[i];
				posMenor = i;
			}
		}
		
		System.out.println("Maior idade: " + maior + " Posição maior idade: " + posMaior);
		System.out.println("Menor idade: " + menor + " Posição menor idade: " + posMenor);
		
	}

}
