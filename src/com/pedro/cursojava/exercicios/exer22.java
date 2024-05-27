package com.pedro.cursojava.exercicios;

/*Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a 
dez.*/

import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double media;
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media > 7 && media < 9.9) {
			System.out.println("Parabéns você foi aprovado");
		}else if(media < 7) {
			System.out.println("Mais sorte da próxima, você foi reprovado");
		}else if(media == 10) {
			System.out.println("Parabéns, você foi aprovado com Distinção");
		}

	}

}
