package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Ler as duas notas bimestrais para um conjunto de 10 alunos. 
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do 
tipo real. Escreva um programa que calcule a média aritmética simples 
das notas informadas armazenando o resultado em um vetor “Result” 
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação 
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno 
estará “aprovado”, caso contrário, a situação do aluno será 
“reprovado”*/

public class exer98 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		double mediaAri = 0;
		
		
		for(int i=0; i<nota1.length; i++) {
			for(int j=0; j<nota2.length; j++) {
				System.out.print("Aluno_"+j);
				System.out.print("\nNota_1: ");
				nota1[i] = ler.nextDouble();
				System.out.print("Nota_2: ");
				nota2[j] = ler.nextDouble();
				
				
				result[i] = (nota1[i] + nota2[j]) / 2;
				if(result[i] > 7) {
				    System.out.println("Parabens. Aluno Aprovado!");
				    System.out.println("Nota: " + result[i]);
			    }else {
				    System.out.println("Que Pena. Aluno Reprovado!");
				    System.out.println("Nota: " + result[i]);
			    }
			    System.out.println("-----------------");
			   
		}
				
			}
			

	}

}
