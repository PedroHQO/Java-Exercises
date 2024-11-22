package com.pedro.cursojava.aula33.labs;

public class TesteContador {
	
	static void imprimirValor() {
		System.out.println(Contador.retornarIncrementador());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.somaIncrementador();
		
		imprimirValor();
		
		Contador.somaIncrementador();
		
		imprimirValor();
		
		Contador.zerarIncrementador();
		
		imprimirValor();
		
		Contador.somaIncrementador();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
		

	}

}
