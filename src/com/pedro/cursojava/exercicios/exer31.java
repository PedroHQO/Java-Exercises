package com.pedro.cursojava.exercicios;

/*.Faça um programa que lê as duas notas parciais obtidas por um aluno 
numa disciplina ao longo de um semestre, e calcule a sua média. A 
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito 
o Entre 9.0 e 10.0 A 
o Entre 7.5 e 9.0 B 
o Entre 6.0 e 7.5 C 
o Entre 4.0 e 6.0 D 
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito 
correspondente e a mensagem “APROVADO” se o conceito for 
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		String materia = ler.next().toUpperCase();
		
		System.out.println("Digite primeira nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite segunda nota: ");
		double nota2 = ler.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media > 9 && media < 10) {
			System.out.println("Resultado da Disciplina: " + materia);
			System.out.println("Primeira Nota: " + nota1 + "; Segunda Nota: " + nota2);
			System.out.println("Sua nota final é: " + media);
			System.out.println("Seu conceito é: A");
			System.out.println("Você esta APROVADO!");
		}else if(media > 7.5 && media <= 9) {
			System.out.println("Resultado da Disciplina: " + materia);
			System.out.println("Primeira Nota: " + nota1 + "; Segunda Nota: " + nota2);
			System.out.println("Sua nota final é: " + media);
			System.out.println("Seu conceito é: B");
			System.out.println("Você esta APROVADO!");
		}else if(media > 6 && media <= 7.5) {
			System.out.println("Resultado da Disciplina: " + materia);
			System.out.println("Primeira Nota: " + nota1 + "; Segunda Nota: " + nota2);
			System.out.println("Sua nota final é: " + media);
			System.out.println("Seu conceito é: C");
			System.out.println("Você esta APROVADO!");
		}else if(media > 4 && media <= 6) {
			System.out.println("Resultado da Disciplina: " + materia);
			System.out.println("Primeira Nota: " + nota1 + "; Segunda Nota: " + nota2);
			System.out.println("Sua nota final é: " + media);
			System.out.println("Seu conceito é: D");
			System.out.println("Você esta REPROVADO!");
		}else{
			System.out.println("Resultado da Disciplina: " + materia);
			System.out.println("Primeira Nota: " + nota1 + "; Segunda Nota: " + nota2);
			System.out.println("Sua nota final é: " + media);
			System.out.println("Seu conceito é: E");
			System.out.println("Você esta REPROVADO!");
		}
	}
}
