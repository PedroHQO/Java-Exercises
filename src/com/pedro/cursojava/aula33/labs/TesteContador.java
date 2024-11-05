package com.pedro.cursojava.aula33.labs;

public class TesteContador {

	public static void main(String[] args) {
		
		Contador.soma = -10;
		
		System.out.println(Contador.zerarIncrementador());
		
		System.out.println(Contador.somaIncrementador());
		
		System.out.println(Contador.somaIncrementador());
		
		System.out.println(Contador.somaIncrementador());
		
		System.out.println(Contador.retornarIncrementador());
		
		System.out.println(Contador.zerarIncrementador());

	}

}
