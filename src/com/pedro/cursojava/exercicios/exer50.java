package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as 
populações e as taxas de crescimento iniciais. Valide a entrada e 
permita repetir a operação.*/

public class exer50 {

	public static void main(String[] args) {
		
		double a = 0, b = 0, taxa1 = 0, taxa2 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a população país A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite a população país B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite a taxa (%) de crescimento do país A: ");
		taxa1 = ler.nextDouble();
		
		System.out.println("Digite a taxa (%) de crescimento do país B: ");
		taxa2 = ler.nextDouble();
		
			for(int i = 1; ; i++) {
				
				a = a * ((taxa1 / 100) + 1);
				b = b * ((taxa2 / 100) + 1);
				

				if(a >= b) {
					System.out.printf("Pais A: %.2f\n", a);
					System.out.printf("Pais B: %.2f \n", b);
						
					System.out.println("Vai demorar "+ i + " anos para o país A igualar ou superar país B");
						
					break;
				
				}
			}
	}

}
