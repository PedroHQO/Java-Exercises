package com.pedro.cursojava.aula33.labs;

public class Calculadora {
	private static int resultado = 1;
	
	public static int soma(int num1, int num2) {
		System.out.print(num1 + " + " + num2 + " = ");
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		System.out.print(num1 + " - " + num2 + " = ");
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		System.out.print(num1 + " x " + num2 + " = ");
		return num1 * num2;
	}
	
	public static int dividir(int num1, int num2) {
		System.out.print(num1 + " / " + num2 + " = ");
		return num1 / num2;
	}
	
	public static double potencia(int num1, int num2) {
		System.out.print(num1 + " ^ " + num2 + " = ");
		return Math.pow(num1, num2);
	}
	
	public static int fatorial(int num1) {
		System.out.print(num1 + "! ");
		for(int i=num1; i>0; i--) {
			resultado *= i;
			System.out.print(i + "." );
		}
		System.out.print(" = ");
		return resultado;
	}

}
