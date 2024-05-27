package com.pedro.cursojava.exercicios;

/*0.Faça um Programa que pergunte em que turno você estuda. Peça 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inválido!", conforme o caso.*/

import java.util.Scanner;

public class exer27 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("M(Matutino), V(Vespertino) ou N(Noturno)");
		System.out.println("Digite a letra referente ao turno que você estuda:");
		
		char letra = ler.next().toUpperCase().charAt(0);
		System.out.println("A letra digitada foi: " + letra);
		
		switch (letra){
		case 'M':
			System.out.println("Bom dia! Bons estudos.");
			break;
		case 'V':
			System.out.println("Boa tarde! Bons estudos.");
			break;
		case 'N':
			System.out.println("Boa noite! Bons estudos.");
			break;
		default:
			System.out.println("Valor Inválido!");
			
		}
	}

}
