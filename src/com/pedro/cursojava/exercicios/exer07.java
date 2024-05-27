package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		double area, dobro;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida de um dos lados do quadrado: ");
		double lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		dobro = area * 2;
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área é: " + dobro);
		
	}
}
