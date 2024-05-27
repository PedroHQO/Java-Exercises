package com.pedro.cursojava.aula16;

public class Loopwhile {

	public static void main(String[] args) {

		int i = 1; //nome comuns de usar count ou cont, o 'i' é o mais comum
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		//Primeiro avalia a expressão e depois executa o bloco de código
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println(i);
		
		//Primeiro executa o bloco de código e depois avavalia expressão
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i < 13);
		
		System.out.println(i);
	}

}
