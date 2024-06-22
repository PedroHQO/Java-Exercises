package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer 
inteiro que será digitado pelo usuário, mas a tabuada não deve 
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final 
devem ser informados também pelo usuário, conforme exemplo 
abaixo:
o Montar a tabuada de: 5 
o Começar por: 4 
o Terminar em: 7 
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
o 5 X 4 = 20 
o 5 X 5 = 25 
o 5 X 6 = 30 
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor 
que o inicial*/

public class exer76 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("-----TABUADA-----");
		
		System.out.print("Monstrar a tabuada de: \n");
		int num = ler.nextInt();
		
		System.out.print("Começar por: \n");
		int numIni = ler.nextInt();
		
		System.out.print("Terminar em: \n");
		int numFini = ler.nextInt();
		
		while(numIni > numFini) {
			
			System.err.println("VOCÊ DIGITOU O FINAL MENOR QUE O INICIO");
			
			
			System.out.println("Começar por: \n");
			numIni = ler.nextInt();
			
			System.out.println("Terminar em: \n");
			numFini = ler.nextInt();
		}
		
		for(int i = numIni; i <= numFini; i++)
		{
			
			System.out.println(num + " x " + i + " = " + (i * num));
		}		

	}

}
