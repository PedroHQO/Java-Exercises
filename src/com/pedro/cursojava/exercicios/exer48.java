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
		
		String nome, sexo, estadoCivil;
		int idade;
		double sal;
		
		do {
		System.out.println("Digite seu nome com mais de 3 caracteres: ");
		nome = ler.next();
	
		if(nome.length() <= 3) {
			System.out.println("NÃO É UM NOME VÁLIDO!");
		}
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade < 1 || idade > 150) {
			System.out.println("NÃO É UMA IDADE VÁLIDA!");
		}
		
		System.out.println("Digite su sálario: ");
		sal = ler.nextDouble();
		
		if(sal <= 0) {
			System.out.println("NÃO É UM SÁLARIO VÁLIDO!");
		}
		
		System.out.println("Digite seu sexo (F/M): ");
		sexo = ler.next().toUpperCase();
		
		if(sexo.length() > 1) {
			System.out.println("NÃO É UM SEXO VÁLIDO DIGITE 'F' OU 'M'");
		}
		switch(sexo) {
		case "F":break;
		case "M":break;
		default:System.out.println("NÃO É UM SEXO VÁLIDO DIGITE 'F' OU 'M'");break;
		}
		
		System.out.println("Digite seu estado cívil (S/C/V/D): ");
		estadoCivil = ler.next().toUpperCase();
		
		if(estadoCivil.length() > 1) {
			System.out.println("NÃO É UM ESTADO CÍVIL VÁLIDO DIGITE 'S','C','V','D'");
		}
		switch(estadoCivil) {
		case "S":break;
		case "C":break;
		case "V":break;
		case "D":break;
		default:System.out.println("NÃO É UM ESTADO CÍVIL VÁLIDO DIGITE 'S','C','V','D'");break;
		}
		}while(nome.length() <= 3 || idade < 1 || idade > 150 || sal <= 0 || sexo.length() > 1 || estadoCivil.length() > 1);
	}

}
