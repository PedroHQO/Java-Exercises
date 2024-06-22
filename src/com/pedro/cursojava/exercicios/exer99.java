package com.pedro.cursojava.exercicios;

/*0.Implementar um programa que obtenha a cotacao do dolar (U$) em 
relacao ao real (R$) e a seguir armazene em vetor A com 20 
elementos as seguintes conversoes:
21.A[i] = cotacao do dolar * i, para todo i variando de 1 ate 20.
*/

public class exer99 {

	public static void main(String[] args) {
		
		double[] vetorA = new double[20];
		double cotacaoDolar = 5.11;
		
		for(int i = 1; i<vetorA.length; i++){
		    vetorA[i] = cotacaoDolar * i;
		    System.out.print(cotacaoDolar + "$ Dolares para " + i + " Reais = R$ "); 
		    System.out.printf(" %.2f\n", vetorA[i]);
		}
	}

}
