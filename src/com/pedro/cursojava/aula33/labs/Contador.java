package com.pedro.cursojava.aula33.labs;

public class Contador {
	
	private static int  soma;
	
	public Contador() {
		soma++;
	}

	public static void zerarIncrementador() {
		soma = 0;
	}
	
	public static void somaIncrementador() {
		soma++;
	}
	
	public static int retornarIncrementador() {
		return soma;
	}
}
