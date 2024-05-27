package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		//double pi = 3.14;
		double area;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = calc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é = " + area);
	}

}
