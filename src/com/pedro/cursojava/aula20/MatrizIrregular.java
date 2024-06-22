package com.pedro.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o com o numero de pessoas que serao entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.print("Digite o nome do " + (j+1) + "° filho: \n");

				nomesFilhos[i][j] = scan.nextLine();
			
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
				
				
			}
		}
		
		
	}

}
