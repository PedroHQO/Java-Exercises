package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que calcule as raízes de uma equação do segundo 
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, 
b e c e fazer as consistências, informando ao usuário nas seguintes 
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é 
do segundo grau e o programa não deve fazer pedir os demais 
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes 
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas 
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais; 
informe-as ao usuário;*/

public class exer33 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("EQUAÇÃO DE SEGUNDO GRAU: ax² * bx + c = 0");
		
		System.out.println("Digite o valor 'a': ");
		int num1 = ler.nextInt();
		
		if(num1 == 0) {
			System.out.println("Não é uma equação de segundo grau. O 'a' não pode ser 0");
			return;
		}
		
		System.out.println("Digite o valor 'b': ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite o valor 'c': ");
		int num3 = ler.nextInt();
		
	
		double delta = Math.pow(num2, num2) - (4 * num1 * num3) ;
		
		if(delta < 0){
			System.out.println("Delta negativo!");
			System.out.println("A equação não possui raizes reais!");
		}else if(delta == 0) {
			System.out.println("A equação possui apenas uma raiz real!");
			double equacao = -num2/(2*num1);
			System.out.println("Resultado da raiz: " + equacao);
		}else {
			System.out.println("A equação possui duas raiz reais!");
			double equacao1 = -num2 + Math.sqrt(delta) / (2*num1);
			double equacao2 = -num2 - Math.sqrt(delta) / (2*num1);
			System.out.printf("Primeira raiz: %.2f %n", equacao1);
			System.out.printf("Segunda raiz:  %.2f %n", equacao2);
		}	

	}

}
