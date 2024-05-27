package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {

		double litros, latas, valorPag;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
		double metros = scan.nextDouble();
		
		System.out.println("Cobertura da tinta é 1L para cada 3m quadrados");
		System.out.println("Cada lata contêm 18L");
		System.out.println("Cada lata custa 80,00R$");
		
		litros = metros / 3;
		latas = litros / 18;
		valorPag = latas * 80;
		
		System.out.println("Você vai precisar de " + latas + ". Latas de tinta!");
		System.out.println("Valor total à pagar é: " + valorPag + "R$");
		
		
		

	}

}
