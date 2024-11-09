package com.pedro.cursojava.aula33;

public class TesteCalculadora {
	
	static int resultadoSoma;
	
	public static void main(String[] args) {
		
		resultadoSoma = MinhaCalculadora.soma(5, 4);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(3, 2);
		
		System.out.println(MinhaCalculadora.soma(5, 4));
		
		System.out.println(soma2Valore(86, 55));
		
	}
	
	static int soma2Valore(int num1, int num2) {
		return(MinhaCalculadora.soma(num1, num2));
	}
	
}
