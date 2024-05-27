package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		
		double peso;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double alt = scan.nextDouble();
		
		peso = (72.7 * alt) - 58;
		
		System.out.println("Para a sua altura " + alt + "m. Seu peso ideal é = " + peso + "Kg");
	}

}
