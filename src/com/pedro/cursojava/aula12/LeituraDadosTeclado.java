package com.pedro.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();//Para ler a linha inteira
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome primeiro nome: ");
		String primeiroNome = scan.next();//Um unico tipo
		System.out.println("Seu nome completo é: " + primeiroNome);*/
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();//Um unico tipo
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();//Um unico tipo
		System.out.println("Sua altura é: " + altura);

	}

}
