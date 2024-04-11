package com.pedro.cursojava.exercicios;

/*Faça um programa que imprima na tela os números de 1 a 20, um 
abaixo do outro. Depois modifique o programa para que ele mostre os 
números um ao lado do outro
*/

import java.util.Scanner;

public class exer51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 20; i++) {
			//System.out.println(i);
			
			System.out.print("-"+ i);
		}

	}

}
