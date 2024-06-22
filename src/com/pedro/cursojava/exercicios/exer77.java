package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Uma academia deseja fazer um senso entre seus clientes para 
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para 
isto você deve fazer um programa que pergunte a cada um dos 
clientes da academia seu código, sua altura e seu peso. O final da 
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no 
campo código. Ao encerrar o programa também deve ser informados 
os códigos e valores do clente mais alto, do mais baixo, do mais gordo 
e do mais magro, além da média das alturas e dos pesos dos clientes*/

public class exer77 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		double peso;
		double altu;
		//int cont = 0;
		int cod;
		double totalAltu = 0;
		double totalPeso = 0;
		double mediaAltu;
		double mediaPeso;
		double menorPeso = Integer.MAX_VALUE;
		double maiorPeso = Integer.MIN_VALUE;
		double menorAltura = Integer.MAX_VALUE;
		double maiorAltura = Integer.MIN_VALUE;
		int menorCodPeso = 0;
		int maiorCodPeso = 0;
		int maiorCodAltura = 0;
		int menorCodAltura = 0;
		
		
			for(int i = 1; ; i++) {
				
				System.out.println("Digite seu código: (Se quiser parar digite '0')");
				 cod = ler.nextInt();
				 
				
				 if(cod == 0) {
					 i--;
					  
					 mediaAltu = totalAltu / i;
						
					 mediaPeso = totalPeso / i;
					 break;
					}
				 
				 
				System.out.println("Digite seu peso: ");
				peso = ler.nextDouble();
				
				System.out.println("Digite sua altura: ");
				altu = ler.nextDouble();
				
				totalAltu += altu;
				
				totalPeso += peso;
				
				if(peso < menorPeso) { //Comparo peso para saber se é o menor e assim o separo
					menorPeso = peso;
					menorCodPeso = cod; //Após separar menor peso eu também atribui uma variável para
										//Separar o código do menor peso, e assim por diante.
				}
				
				if(peso > maiorPeso) {
					maiorPeso = peso;
					maiorCodPeso = cod;
					
				}
				
				if(altu < menorAltura ) {
					menorAltura = altu;
					menorCodAltura = cod;
				}
				
				if(altu > maiorAltura ) {
					maiorAltura = altu;
					maiorCodAltura = cod;
				}
					
					
			}
			
			System.out.print("Código da maior altura: " + maiorCodAltura + " ");
			System.out.println("Maior Altura = "+ maiorAltura + "Kg");
			System.out.print("Código da menor altura: " + menorCodAltura + " ");
			System.out.println("Menor Altura = "+ menorAltura + "Kg");
			System.out.print("Código do menor peso: " + menorCodPeso + " ");
			System.out.println("Menor Peso = "+ menorPeso + "Kg");
			System.out.print("Código do maior peso: " + maiorCodPeso + " ");
			System.out.println("Maior Peso = "+ maiorPeso + "Kg");
			System.out.printf("Média Altura = %.2f\n",  mediaAltu, "m");
			System.out.printf("Média Peso = %.2f\n", mediaPeso, "Kg");
					
	}

}
