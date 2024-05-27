package com.pedro.cursojava.exercicios;

/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class exer47 {

	public static void main(String[] args) {
		
		String nome, senha;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite seu nome de usuário: ");
			nome = scan.next();
			
			System.out.println("Digite sua senha: ");
			senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome)){
				System.out.println("SENHA NÃO PODE SER IGUAL NOME DE USUÁRIO!");
			}
		}while(senha.equalsIgnoreCase(nome));

	}

}
