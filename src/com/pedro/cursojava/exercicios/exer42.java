package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que faça 5 perguntas para uma pessoa sobre um 
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir 
uma classificação sobre a participação da pessoa no crime. Se 
a pessoa responder positivamente a 2 questões ela deve ser 
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 
como "Assassino". Caso contrário, ele será classificado como 
"Inocente"*/

public class exer42 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = ler.next().toUpperCase();
		
		System.out.println("Olá Sr(a) " + nome + ", vou te fazer algumas perguntas "
				+ ", preciso que diga apenas SIM ou NÃO, vamos começar: ");
		
		System.out.println("Telefonou para a vítima?");
		String resp1 = ler.next().toUpperCase();
		System.out.println("Esteve no local do crime?");
		String resp2 = ler.next().toUpperCase();
		System.out.println("Mora perto da vítima?");
		String resp3 = ler.next().toUpperCase();
		System.out.println("Devia para a vítima?");
		String resp4 = ler.next().toUpperCase();
		System.out.println("Já trabalhou com a vítima?");
		String resp5 = ler.next().toUpperCase();
		
		
		if(resp1.equals("SIM")&&resp2.equals("SIM")&&resp3.equals("SIM")&&resp4.equals("SIM")&&resp5.equals("SIM")){
			System.out.println("Sua classificação é...");
			System.out.println("ASSASINO!");
		}else if(resp1.equals("SIM") && resp2.equals("SIM") && resp3.equals("SIM") && resp4.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM") && resp2.equals("SIM") && resp3.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM") && resp3.equals("SIM") && resp4.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM") && resp2.equals("SIM") && resp4.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp2.equals("SIM") && resp3.equals("SIM") && resp4.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp2.equals("SIM")&&resp3.equals("SIM")){
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp2.equals("SIM")&&resp4.equals("SIM")){
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp2.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp3.equals("SIM")&&resp4.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp3.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp4.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp2.equals("SIM")&&resp3.equals("SIM")&&resp4.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp2.equals("SIM")&&resp3.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp3.equals("SIM")&&resp4.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("CUMPLICE!");
		}else if(resp1.equals("SIM")&&resp2.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp1.equals("SIM") && resp3.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp1.equals("SIM") && resp4.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp1.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp2.equals("SIM")&&resp3.equals("SIM")){
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp2.equals("SIM") && resp4.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp2.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp3.equals("SIM")&&resp4.equals("SIM") || resp3.equals("SIM") && resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else if(resp4.equals("SIM")&&resp5.equals("SIM")) {
			System.out.println("Sua classificação é...");
			System.out.println("SUSPEITA!");
		}else {
			System.out.println("Sua classificação é...");
			System.out.println("INOCENTE!");
		}
	}

}
