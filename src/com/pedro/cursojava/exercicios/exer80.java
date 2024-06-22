package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/

public class exer80 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] elementosA = new int[5];
		int[] elementosB = new int[5];
		int cont = 0;
		
		for(int i = 0; i<elementosA.length; i++) {
				System.out.print("Digite o valor da posição_" + i + ": ");
				elementosA[i] = ler.nextInt();

		}
		System.out.print("VetorA: ");
		for(int i = 0; i<elementosA.length; i++) {
			elementosB[i] = elementosA[i];
			System.out.print(elementosA[i] + " ");
		
		}
		System.out.println();
		System.out.print("VetorB: ");
		for(int i = 0; i<elementosB.length; i++) {
			System.out.print(elementosB[i] + " ");
		
		}
	
	
		
			
		
	}

}
