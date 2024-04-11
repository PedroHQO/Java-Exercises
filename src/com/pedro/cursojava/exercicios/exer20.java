//Descobrindo genero pela a letra digitada
package com.pedro.cursojava.exercicios;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra para saber o seu gênero (F ou M): ");
		char letra = ler.next().toUpperCase().charAt(0);
		/*Caso use o String no lugar de char, poderia como opção usar ler.equalsIgnoreCase("")
		Com aquele método, é possivel focar na letra independente se o usuario entrar com 'f' ou 'F'*/
		System.out.println("A letra digitada foi: " + letra);
		switch(letra) {
		case 'F':
			System.out.println("Feminino!");
			break;
		case 'M':
			System.out.println("Masculino!");
			break;
		default:
			System.out.println("Sexo Inválido!");
		}
		

	}

}
