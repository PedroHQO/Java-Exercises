package com.pedro.cursojava.aula34;

public class Calculadora {
	static int resultado = 1;
	
	public static int fatorialNaoRecursivo(int num1) {
		
		System.out.print(num1 + "! ");
		for(int i=num1; i>0; i--) {
			resultado *= i;
			System.out.print(i + "." );
		}
		System.out.print(" = ");
		return resultado;
	}
	
	//fatorial(5) = 5 * fatorial(4);
	//fatorial(4) = 4 * fatorial(3);
	//fatorial(3) = 3 * fatorial(2);
	//fatorial(2) = 2 * fatorial(1);
	//fatorial(1) = 1 * fatorial(0);
	//fatorial(0) = 1;
	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * fatorial(num - 1);
	}
}
