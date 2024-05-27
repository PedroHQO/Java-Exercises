package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um Programa que leia um número e exiba o dia correspondente 
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
aparecer valor inválido.*/

public class exer30 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número para saber a qual dia ele corresponde: ");
		int num = ler.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor Inválido!!");
		}

	}

}
