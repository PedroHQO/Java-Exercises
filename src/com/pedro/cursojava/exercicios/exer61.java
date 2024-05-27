/**
 * 
 */
package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/**
 A série de Fibonacci é formada pela seqüência 
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até 
que o valor seja maior que 500.
 */
public class exer61 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int limite = 500;
		int atual = 1;
		int anterior = 1;
		System.out.println("SEQUÊNCIA DE FIBONACCI:");
		
		do {
			System.out.println(atual);
			
			int proximoTermo = atual + anterior;
			atual = anterior;
			anterior = proximoTermo;
			
		}while(atual <= 500);
		
		System.out.println(atual);

	}

}
