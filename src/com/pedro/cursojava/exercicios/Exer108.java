package com.pedro.cursojava.exercicios;

/*Ler um vetor A com 20 elementos. Separar os elementos pares e 
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início 
do vetor B armazene os elementos pares de A e nas posições 
restantes do vetor B armazene os elementos de A que são ímpares.*/

public class Exer108 {

	public static void main(String[] args) {
		
		int[] vetorA = {6, 3, 7, 10, 25, 14, 18, 9, 18, 1, 81, 19, 72, 4, 81, 6, 99, 13, 21, 82, 77};
		int[] vetorB = new int[20];
		int cont = 0;
		
		for(int i=0, j=19; i<vetorA.length; i++) {
		
			if(vetorA[i] % 2 == 0) {
				vetorB[cont++] = vetorA[i];
				
			}
			if(vetorA[i] % 2 == 1){
				vetorB[j--] = vetorA[i];
				//j--;
			}
			
				
			
		}
		
		for(int i=0; i<vetorB.length; i++) {
			if(i<cont) {
				System.out.print(vetorB[i]+ " ");
	        } else {
	            System.out.print(" " + vetorB[i] + " ");
	        
			}
		}
		

	}

}
