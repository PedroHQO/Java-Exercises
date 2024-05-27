package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que, dado um conjunto de N números, determine o 
menor valor, o maior valor e a soma dos valores.*/

public class exer63 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String letra;
		int num = 0;
		int resultado = 0;
		int menor = Integer.MAX_VALUE; //inicia a variavel com o maior valor disponivel
		int maior = Integer.MIN_VALUE;//inicia a variavel com o menor valor disponivel
		
		System.out.println("DIGITE UMA SEQUÊNCIA DE NUMEROS");
		
		do{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
		
			resultado += num;
		
			//Atualiza o menor valor
			if(num < menor ) {
				menor = num;
				
			}//Atualiza o maior valor 
			if(num > maior) {
				maior = num;
			}
			System.out.println("Deseja parar: ('s' para continuar 'n' para sair)");
			letra = ler.next();
			}while(letra.equalsIgnoreCase("s"));
		
		System.out.println("Soma: " + resultado);
		System.out.println("Maior num: " + maior);
		System.out.println("Menor num: " + menor);

	}

}
