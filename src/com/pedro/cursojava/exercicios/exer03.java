package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = leitura.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = leitura.nextInt();
		
		System.out.println("A soma dos dois numeros é: " + (num1 + num2));
	}

}
