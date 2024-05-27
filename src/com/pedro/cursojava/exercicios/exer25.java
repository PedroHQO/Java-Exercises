package com.pedro.cursojava.exercicios;

/*Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre 
pelo mais barato1*/

import java.util.Scanner;

public class exer25 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		double valor1 = ler.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double valor2 = ler.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double valor3 = ler.nextDouble();
		
		if(valor1 < valor2 && valor1 < valor3) {
			System.out.println("Compre o produto de valor: " + valor1 + " é o mais barato");
		}else if(valor2 < valor1 && valor2 < valor3) {
			System.out.println("Compre o produto de valor: " + valor2 + " é o mais barato");
		}else {
			System.out.println("Compre o produto de valor: " + valor3 + " é o mais barato");
		}
		

	}

}
