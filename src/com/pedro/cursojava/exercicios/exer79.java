package com.pedro.cursojava.exercicios;

/*Faça um programa que leia dez conjuntos de dois valores, o primeiro 
representando o número do aluno e o segundo representando a sua 
altura em centímetros. Encontre o aluno mais alto e o mais baixo. 
Mostre o número do aluno mais alto e o número do aluno mais baixo, 
junto com suas alturas.*/

import java.util.Scanner;

public class exer79 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codAluno;
		int alturaAluno;
		int codAlunoBaixo = 0;
		int codAlunoAlto = 0;
		int alunoAlto = 0;
		int alunoBaixo = 300;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o código do aluno: ");
			codAluno = ler.nextInt();
			
			System.out.println("Digite a altura do aluno em centímentros: ");
			alturaAluno = ler.nextInt();
			
			if(alturaAluno > alunoAlto) {
				alunoAlto = alturaAluno;
				codAlunoAlto = codAluno;
			}
			if(alturaAluno < alunoBaixo) {
				alunoBaixo = alturaAluno;
				codAlunoBaixo = codAluno;
			}
		}
		
		System.out.print("Código do aluno mais alto: " + codAlunoAlto + " ");
		System.out.println("Altura do aluno mais alto em centímetros: " + alunoAlto);
		System.out.print("Código do aluno mais baixo: " + codAlunoBaixo + " ");
		System.out.println("Altura do aluno mais baixo em centímetros: " + alunoBaixo);

	}

}
