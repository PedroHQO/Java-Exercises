package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Um funcionário de uma empresa recebe aumento salarial anualmente: 
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de 
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre 
correspondem ao dobro do percentual do ano anterior. Faça um 
programa que determine o salário atual desse funcionário. Após 
concluir isto, altere o programa permitindo que o usuário digite o 
salário inicial do funcionário.*/

public class exer78 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//double salario = 1000;
		int mult = 2;
		double porce = 1.5;
		
		System.out.print("Digite o sálario do funcionário: ");
		double salario = ler.nextDouble();
		
		System.out.println("Ano 1995 Salario: " + salario);
		for(int i = 1996; i <= 2000; i++ ) {
			
			double aumento = salario * (1 + (porce / 100));
			porce *= 2;
			
			System.out.print("Ano " + i + " Salario antigo: R$" + salario + ". ");
			System.out.printf("Novo Salário: R$ %.2f\n", aumento);
			
		}

	}

}
