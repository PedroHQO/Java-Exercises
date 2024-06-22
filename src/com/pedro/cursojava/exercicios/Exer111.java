package com.pedro.cursojava.exercicios;

import java.util.Random;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre 
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e 
qual é o maior e o menor valor da coluna 7.*/

public class Exer111 {

	public static void main(String[] args) {
		Random aleatory = new Random();//instanciando a classe random
		
		int[][] matriz = new int[10][10];
		int maiorLinha = Integer.MIN_VALUE;
		int menorLinha = Integer.MAX_VALUE;
		int maiorColuna = Integer.MIN_VALUE;
		int menorColuna = Integer.MAX_VALUE;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = aleatory.nextInt(10);//atribuindo minha matriz ao random, para gerar num aleatorios
				
				System.out.print(matriz[i][j] + " ");
				
				if(i == 5) {
					if(matriz[i][j] > maiorLinha) {
						maiorLinha = matriz[i][j];
					}
					 if(matriz[i][j] < menorLinha) {
						menorLinha = matriz[i][j];
					}
				}
				
				if(j == 7) {
					if(matriz[i][j] > maiorColuna) {
						maiorColuna = matriz[i][j];
					}
					 if(matriz[i][j] < menorColuna) {
						 menorColuna = matriz[i][j];
					}
				}
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Maior valor linha (5) = " + maiorLinha + "; ");
		System.out.print("Menor valor linha (5) = " + menorLinha);
		System.out.print("\nMaior valor Coluna (7) = " + maiorColuna + "; ");
		System.out.print("Menor valor Coluna (7) = " + menorColuna );

	}

}
