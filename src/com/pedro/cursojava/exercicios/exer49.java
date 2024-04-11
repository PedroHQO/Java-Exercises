package com.pedro.cursojava.exercicios;

/*Supondo que a população de um país A seja da ordem de 80000 
habitantes com uma taxa anual de crescimento de 3% e que a 
população de B seja 200000 habitantes com uma taxa de crescimento 
de 1.5%. Faça um programa que calcule e escreva o número de anos 
necessários para que a população do país A ultrapasse ou iguale a 
população do país B, mantidas as taxas de crescimento*/

public class exer49 {

	public static void main(String[] args) {
		
		double a = 80000, b = 200000;
		
			for(int i = 1; ; i++) {
				
				a = a * 1.03;
				b = b * 1.015;
				
				if(a >= b) {
					System.out.printf("Pais A: %.2f\n", a);
					System.out.printf("Pais B: %.2f \n", b);
					
					System.out.println("Anos: "+ i);
					
					break;
				}
			}
	}

}
