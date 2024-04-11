package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um medida em metros: ");
		double medida = scan.nextDouble();
		
		System.out.println(medida+" metros = " + medida*100 + " centimetros");

	}

}
