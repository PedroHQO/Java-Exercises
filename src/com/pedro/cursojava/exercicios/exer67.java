package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que calcule o mostre a média aritmética de N 
notas.*/

public class exer67 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota = 0;
		int cont = 1; 
		double soma = 0;
		double total = 0;
		while(nota != 10) {

			System.out.println("Digite uma nota: ");
			nota = ler.nextDouble();
			cont ++;
			soma += nota;
		
			
			total = soma / cont;
			
		}
		
	

		System.out.print("MÉDIA ARITIMÉTICA = " + total);
		
	}

}
