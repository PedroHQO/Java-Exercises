package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.Faça um Programa que peça um número correspondente a um 
determinado ano e em seguida informe se este ano é ou não bissexto.*/

public class exer34 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um ano para saber se ele é bissexto ou não: ");
		int ano = ler.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O ano " + ano + " é bissexto!");
		}else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto!");
		}else {
			System.out.println("O ano " + ano + " não é bissexto!");
		}
		
	}

}
