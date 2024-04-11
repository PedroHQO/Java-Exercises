package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um Programa para um caixa eletrônico. O programa deverá 
perguntar ao usuário a valor do saque e depois informar quantas notas 
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 
reais. O programa não deve se preocupar com a quantidade de notas 
existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa 
fornece duas notas de 100, uma nota de 50, uma nota de 5 e 
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa 
fornece três notas de 100, uma nota de 50, quatro notas de 10, 
uma nota de 5 e quatro notas de 1*/

public class exer38 {

	public static void main(String[] args) {
		int centena;
		int dezena;
		int unidade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("As notas disponíveis para saque são as de 1$, 5$, \r\n"
				+ "10$, 50$ e 100$ reais."); 
		System.out.println(" Valor mínimo para saque é de 10 reais e o máximo de 600 reais.");
				
		
		System.out.println("Digite o valor do seu saque: ");
		int valor = ler.nextInt();
		
		if(valor < 10 || valor > 600) {
			System.out.println("Valor para saque INVÁLIDO.");
			return;
		}
		
		System.out.println("Serão entregues as seguintes notas:");
		if(valor >= 100) {
			centena = valor/100;
			System.out.println(centena + " nota(s) de cem");
			dezena = (valor%100)/10;
			if(dezena > 5 && dezena < 10){
				int resto = dezena - 5;
				System.out.println("1 nota(s) de 50 reais");  
				System.out.println(resto + " nota(s) de 10 reais.");
			}else if(dezena < 5) {
				System.out.println(dezena + " nota(s) de 10 reais.");
			}else {
				System.out.println(" 1 nota de 50 reais.");
			}
			unidade =((valor%10)%10);
			if(unidade > 5 && unidade < 10){
				int resto = unidade - 5;
				System.out.println(" 1 nota(s) de 5 reais e " + resto + " nota(s) de 1 real.");
			}else if(unidade < 5) {
				System.out.println(unidade + " nota(s) de 1 reais.");
			}else {
				System.out.println(" 1 nota de 5 reais.");
			}	
		}else if(valor > 10 && valor < 100) {
			dezena = (valor%100)/10;
			if(dezena > 5 && dezena < 10) {
				int resto = dezena - 5;
				System.out.println("1 nota de 50 reais e " + resto + " nota(s) de 10 reais.");
			}else if(dezena < 5) {
				System.out.println(dezena + " nota(s) de 10 reais.");
			}else {
				System.out.println(" 1 nota de 50 reais.");
			}
			unidade =((valor%10)%10);
			if(unidade > 5 && unidade < 10){
				int resto = unidade - 5;
				System.out.println(" 1 nota(s) de 5 reais e " + resto + " nota(s) de 1 real.");
			}else if(unidade < 5) {
				System.out.println(unidade + " nota(s) de 1 reais.");
			}else {
				System.out.println(" 1 nota de 5 reais.");
			}
		}
		
		
		

	}

}
