package com.pedro.cursojava.exercicios;

/*Faça um Programa que verifique se uma letra digitada é vogal ou 
consoante.*/

import java.util.Scanner;

public class exer21 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		//Using next().charAt(0) to Accept Char Input
		//Using .toUpperCase in middle phrase cód. for change letter to upper
		//char letra = ler.next().toUpperCase().charAt(0);
		
		String letra = ler.next().toUpperCase();
		System.out.println("A letra digitada foi: " + letra);
		
		//Essa expressao .length() > 1, quer dizer que se a entrada for maior que 1 caracter, ele não vai aceitar mais do 1 letra
		// Esse procedimento pode ser usado para teste.
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		}else {
			switch (letra){
			case "A":
				System.out.println("Vogal");
				break;
			case "E":
				System.out.println("Vogal");
				break;
			case "I":
				System.out.println("Vogal");
				break;
			case "O":
				System.out.println("Vogal");
				break;
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
			}

		}
	}

}
