package com.pedro.cursojava.exercicios;


/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se 
para implementar um programa que determine o percentual de 
números 0's e 1's existentes no vetor A.*/

public class exer100 {

	public static void main(String[] args) {
		double cont1 = 0;
		double cont0 = 0;
		double percent1 = 0;
		double percent0 = 0;
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length;i++) {
		/*
		 * Math.random(): Esta função gera um número aleatório entre 0 (inclusive) e 1 (exclusivo). 
		 Ou seja, pode gerar números como 0.0, 0.1, 0.5, etc.
		 * Math.random() * 1: Multiplicar o resultado de Math.random() por 1 não altera o valor, 
		 pois qualquer número multiplicado por 1 permanece o mesmo. Isso é feito para manter o 
		 intervalo entre 0 e 1, logo se eu quisesse alterar o intervalo entre 0 e 10, eu 
		 precisaria multiplicar por 10 (Math.random()*10, isso deixaria meu intervalo entre
		 0 até 9,999999).
		 * (int)Math.round(...): Aqui, o valor resultante da multiplicação é arredondado para o 
		 inteiro mais próximo usando Math.round(...). Isso garante que o número aleatório gerado 
		 seja arredondado para 0 ou 1.
		 * A[i] = ...: Finalmente, o valor arredondado é atribuído ao índice i do array A.
		 */
			vetorA[i] = (int)Math.round(Math.random() * 1);
			System.out.println(vetorA[i]);
			
			if(vetorA[i] == 1) {
				cont1++;
			}
			if(vetorA[i] == 0){
				cont0++;
			}
			
			percent0 = (cont0 / 10)* 100;
			percent1 = (cont1 / 10)* 100;
		}
		
		System.out.println("Percentual de 1 = " + percent1 + "%");
		System.out.println("Percentual de 0 = " + percent0 + "%");
	}

}
