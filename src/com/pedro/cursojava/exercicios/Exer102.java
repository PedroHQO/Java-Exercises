package com.pedro.cursojava.exercicios;

/*Números palíndromos são aqueles que escritos da direita para a 
esquerda têm o mesmo valor quando escritos da esquerda para a 
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um 
programa que verifique se um dado vetor A de 10 elementos inteiros é 
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao 
último, se o segundo elemento do vetor é igual ao penúltimo e assim 
por diante até verificar todos os elementos ou chegar a conclusão que 
o vetor não é um palíndromo.*/

public class Exer102 {

	public static void main(String[] args) {


		int[] vetorA = {2, 3, 4, 6, 8, 8, 6, 4, 3, 2};
		
		for(int i=0; i<vetorA.length; i++) {
			for(int j= 9; j>vetorA.length; j--) {
				
				if(vetorA[i] == vetorA[j]){
					System.out.println("Este vetor é um PALINDROMO");
					
				}else {
					System.out.println("Este vetor NAO é um PALINDROMO");
				
				}
			
		}
		
		
	}

	}
}
