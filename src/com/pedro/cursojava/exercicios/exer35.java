package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um Programa que peça uma data no formato dd/mm/aaaa e 
determine se a mesma é uma data válida.*/

public class exer35 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa, exemplo 01/01/2001");
		
		System.out.println("Digite dia: ");
		int dia = ler.nextInt();
		
		System.out.println("Digite mes: ");
		int mes = ler.nextInt();
		
		System.out.println("Digite ano: ");
		int ano = ler.nextInt();
		
		/*Com o método string.format defini que o dia, mes tem que ter 2 caracterer, 
		 *se digitar apenas 1 ele se auto preenchera com zero a esquerda e o mesmo 
		 *vale para o ano, porém ele se preencherá com 4 zeros a esquerda*/
		String s = String.format ("%02d/%02d/%04d", dia, mes, ano);
		
		if(dia <= 0 || dia > 31) {
			System.out.println("Data digitada: " + s);
			System.out.println("Data digitada inválida");
		}else if(mes <= 0 || mes > 12) {
			System.out.println("Data digitada: " + s);
			System.out.println("Data digitada inválida");
		}else if(ano <= 0) {
			System.out.println("Data digitada: " + s);
			System.out.println("Data digitada inválida");
		
		}else if(dia <= 0 ||dia > 29 && mes == 02) {
			System.out.println("Data digitada: " + s);
			System.out.println("Data digitada inválida");
		}else {
			System.out.println("Data digitada: " + s);
			System.out.println("Data digitada válida");
		}

	}

}
