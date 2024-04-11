package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		double convert;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °C: ");
		double celcius = calc.nextDouble();
		
		convert = (celcius * 1.8) + 32;
		
		System.out.println(celcius + "°C é igual a: " + convert + "°F");
		

	}

}
