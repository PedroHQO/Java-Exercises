package com.pedro.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random aleatory = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = aleatory.nextInt(10);
		}
		
		
		for(int i = 0; i<notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		 System.out.println("\nUsando FOR EACH");
		 
		 for(int nota : notas) {
			 System.out.print(nota + " ");
		 }
		
	}

}
