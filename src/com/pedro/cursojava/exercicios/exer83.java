package com.pedro.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).*/

public class exer83 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite o valor da posição_" + i + ": ");
			vetorA[i] = ler.nextInt(); 
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("VetorA:");
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("VetorB: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + "; ");
		}
		System.out.println();
	}

}
