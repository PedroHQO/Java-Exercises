package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Capture do teclado valores para preenchimento de uma matriz M 
3x3. Após a captura imprima a matriz criada e encontre a 
quantidade de números pares, a quantidade de números ímpares*/

public class Exer112 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int qtdPar = 0;
		int qtdImpar = 0;
		int[][] matrizM = new int[3][3];
		
		for(int i=0; i<matrizM.length; i++){
			for(int j=0; j<matrizM[i].length; j++){
				System.out.print("Digite posição da Linha_" + i + "; Coluna_ " + j + ":");
				matrizM[i][j] = ler.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Gerando Matriz...");
		
		for(int i=0; i<matrizM.length; i++){
			for(int j=0; j<matrizM[i].length; j++){
				System.out.print(matrizM[i][j] + " ");
				
				if(matrizM[i][j] % 2 == 0) {
					qtdPar++;
				}else {
					qtdImpar++;
				}
			}
			System.out.println();
		}
		System.out.println("Quantidade num Par: " + qtdPar);
		System.out.println("Quantidade num Impar: " + qtdImpar);

	}

}
