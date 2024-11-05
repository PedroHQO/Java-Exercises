package com.pedro.cursojava.aula33.labs;

public class Contador {
	
	static int  soma;

	public static int zerarIncrementador() {
		return soma * 0;
	}
	
	static int somaIncrementador() {
		return soma++;
	}
	
	public static int retornarIncrementador() {
		return soma;
	}
}
