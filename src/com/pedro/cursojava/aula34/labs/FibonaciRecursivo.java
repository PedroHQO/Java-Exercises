package com.pedro.cursojava.aula34.labs;

public class FibonaciRecursivo {
	
	public static int fibonaci(int num) {
		
		if(num == 0 || num == 1) {
			return num;
		}
		
		else {
			return fibonaci(num - 2) + fibonaci(num - 1);
		}
		
	}
	
}
