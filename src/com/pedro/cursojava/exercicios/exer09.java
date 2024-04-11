package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		double celcius;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus °F: ");
		double faren = calc.nextDouble();
		
		celcius = (5 * (faren - 32 ) / 9);
		
		System.out.println("Esta temperatura equivale a °C: " + celcius);

	}

}
