package com.pedro.cursojava.exercicios;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/

import java.util.Scanner;

public class exer46 {

	public static void main(String[] args) {

		int nota = 0;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = ler.nextInt();
			if(nota < 0 || nota > 10) {
				System.err.println("NOTA INVÁLIDA!");
				}else {
					System.out.println("Você digitou: " + nota);
				}
		}while(nota < 0 || nota > 10);
			
	}

}
