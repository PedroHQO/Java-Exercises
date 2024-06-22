package com.pedro.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] matrizTridimensional = new int[3][3][3];
		//Indices linhas; colunas; produndidade
		
		for(int i=0; i<matrizTridimensional.length; i++) {
			for(int j= 0; j<matrizTridimensional[i].length; j++) {
				for(int k=0; k<matrizTridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					
					matrizTridimensional[i][j][k] = i + j + k;
					 
				}
			}
		}
		
		
		int soma =0;
		int somPares = 0;
		int somImpares = 0;
		for(int i=0; i<matrizTridimensional.length; i++) {
			for(int j= 0; j<matrizTridimensional[i].length; j++) {
				for(int k=0; k<matrizTridimensional[i][j].length; k++) {
					soma += matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 ==0) {
						somPares += matrizTridimensional[i][j][k];
					}else {
						
						somImpares += matrizTridimensional[i][j][k];
					}
					 
				}
			}
		}
		
		System.out.println("Soma Total da Matriz = " + soma);
		System.out.println("Soma Total Pares da Matriz = " + somPares);
		System.out.println("Soma Total Pares da Matriz = " + somImpares);
		
	}

}
