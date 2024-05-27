package com.pedro.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 5;
		
		resultado = resultado + 2;
		System.out.println(resultado);
		
		resultado = resultado* 3;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado - 3;
		System.out.println(resultado);
		
		System.out.println("o resultado é: ");
		
		String primeiraFrase = "Hoje foi";
		String segundaFrase = " um dia em tanto";
		String terceiraFrase = primeiraFrase + segundaFrase;
		System.out.println("Isto é uma string concatenada: " + terceiraFrase);
		
		resultado = resultado++;
		System.out.println(resultado);
		
		resultado = ++resultado;
		System.out.println(resultado);
		

	}

}
