package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um Programa que leia 2 números e em seguida pergunte ao 
usuário qual operação ele deseja realizar. O resultado da operação 
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.*/

public class exer41 {

	public static void main(String[] args) {
		double resultado = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		double num1 = ler.nextDouble();
		System.out.println("Digite um segundo número qualquer: ");
		double num2 = ler.nextDouble();
		System.out.println("  ");
		System.out.println("###########################");
		System.out.println("1. SOMA");
		System.out.println("2. SUBTRAÇÃO");
		System.out.println("3. MULTIPLICAÇÃO");
		System.out.println("4. DIVISÃO");
		System.out.println("###########################");
		System.out.println("Escolha uma operação: ");
		int opcao = ler.nextInt();
		boolean valida = true;//Essa linha se chama 'flag'
		switch(opcao) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (resultado = num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (resultado = num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (resultado = num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (resultado = num1 / num2));
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			valida = false;/*Colocamos a 'flag' aqui, sendo assim se a opção for invalida 
			o programa vai parar logo aqui sem executar o que esta abaixo*/
		}
		
		//Só será executado o que está aqui dentro se a opção do 'switch' for válida
		if(valida) {
			if(resultado%2 == 0){
				System.out.println("Seu número é PAR");
			}else {
				System.out.println("Seu número é ÍMPAR");
			}
				if(resultado < 0){
					System.out.println("Seu número é NEGATIVO");
				}else {
					System.out.println("Seu número é POSITIVO");
				}
					if(resultado%1 != 0 ){
						System.out.println("Número arredondado: " + Math.round(resultado));
						System.out.println("Seu número é DECIMAL");
					}else {
						System.out.println("Seu número é INTEIRO");
					}
		}
		
	}

}
