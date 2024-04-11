package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = calculo.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = calculo.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double nota3 = calculo.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		double nota4 = calculo.nextDouble();
		
		System.out.println("Para este bimestre sua média é: " + (nota1+nota2+nota3+nota4) / 4);
		
		

	}

}
