package com.pedro.cursojava.exercicios;

/*Faça um Programa para leitura de três notas parciais de um aluno. O 
programa deve calcular a média alcançada por aluno e presentar:
. A mensagem "Aprovado", se a média for maior ou igual a 7, 
com a respectiva média alcançada;
a. A mensagem "Reprovado", se a média for menor do que 7, com 
a respectiva média alcançada;
b. A mensagem "Aprovado com Distinção", se a média for igual a 
10*/

import java.util.Scanner;

public class exer37 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double media;
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = ler.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media > 7 && media < 9.9) {
			System.out.println("Média = " + media);
			System.out.println("Parabéns você foi aprovado");	
		}else if(media < 7) {
			System.out.println("Média = " + media);
			System.out.println("Mais sorte da próxima, você foi reprovado");
		}else if(media == 10) {
			System.out.println("Média = " + media);
			System.out.println("Parabéns, você foi aprovado com Distinção");
		}

	}

}
