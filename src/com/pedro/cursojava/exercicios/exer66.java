package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que mostre todos os primos entre 1 e N sendo N 
um número inteiro fornecido pelo usuário. O programa deverá mostrar 
também o número de divisões que ele executou para encontrar os 
números primos. Serão avaliados o funcionamento, o estilo e o número 
de testes (divisões) executados.*/

public class exer66 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		boolean numPrimo;
		
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		
		for(int i = 2; i <= num; i++){
			
		    if(i == 2 || i == 3 || i == 5 || i == 7){
		        numPrimo = true;
		    }else if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
		        numPrimo = false;
		        continue;
		  }else if(i % Math.sqrt(i) == 0) {
		    	numPrimo = false;
		        continue;
		    }
			
		    System.out.println(i);
		
		}	
	}

}
