package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

public class exer48 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean respCorreta = false;
		String nome, sexo, estadoCivil;
		int idade;
		double sal;
		
		respCorreta = false;
		do {
			System.out.println("Digite seu nome com mais de 3 caracteres: ");
			nome = ler.next();
		
			if(nome.length() <= 3) {
				System.err.println("NÃO É UM NOME VÁLIDO!");
			}else {
				System.out.println("Nome gravado");
				respCorreta = true;	
			}
		}while(!respCorreta);
		
		respCorreta = false;
		do {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade < 1 || idade > 150) {
				System.err.println("NÃO É UMA IDADE VÁLIDA!");
			}else {
				System.out.println("Idade gravada");
				respCorreta = true;	
			}
		}while(!respCorreta);
		
		respCorreta = false;
		do {
			System.out.println("Digite seu sálario: ");
			sal = ler.nextDouble();
			
			if(sal <= 0) {
				System.err.println("NÃO É UM SÁLARIO VÁLIDO!");
			}else {
				System.out.println("Salário gravado!");
				respCorreta = true;
			}
		}while(!respCorreta);
		
		respCorreta = false;
		do {
			System.out.println("Digite seu sexo (F/M): ");
			sexo = ler.next();
			if(sexo.length() == 1 && sexo.equalsIgnoreCase("f") || 
					sexo.equalsIgnoreCase("m")) {
				System.out.println("Sexo Gravado!");
				respCorreta = true;
			}else {
				System.err.println("NÃO É UM SEXO VÁLIDO DIGITE 'F' OU 'M'");	
			}

		}while(!respCorreta);	
		
		respCorreta = false;
		do {
			System.out.println("Digite seu estado cívil (S/C/V/D): ");
			estadoCivil = ler.next();

			if(estadoCivil.length() == 1 && estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("Estado Cívil gravado!");
				respCorreta = true;
			}else {
				System.err.println("NÃO É UM ESTADO CÍVIL VÁLIDO. DIGITE 'S','C','V','D'");
			}
		}while(!respCorreta);
	
		System.out.println("INFORMAÇÕES VALIDADAS!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + sal);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}

}
