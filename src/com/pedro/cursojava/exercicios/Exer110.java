 package com.pedro.cursojava.exercicios;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/
public class Exer110 {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int[][] matrizBidimensional = new int [4][4];
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		
		for(int i=0; i<matrizBidimensional.length; i++) {
			for(int j=0; j<matrizBidimensional[i].length; j++) {
				matrizBidimensional[i][j] = generator.nextInt(10);//Determino que os numeros aleatorios serão gerados de 0 a 9 na matriz[i][j]
				System.out.print(matrizBidimensional[i][j] + "-");
				
				if(matrizBidimensional[i][j] > maior) {
					maior = matrizBidimensional[i][j];
					linha = i; //variavel linha vai receber i(linha) do numero maior na matriz
					coluna = j;//variavel coluna vai receber j(coluna) do numero maior na matriz
				
				}
			}
			System.out.println();
			
		}
		
		System.out.println("Maior número é: " + maior);
		System.out.println("Sua linha é: " + linha);
		System.out.println("Sua coluna é: " + coluna);
	}

}
