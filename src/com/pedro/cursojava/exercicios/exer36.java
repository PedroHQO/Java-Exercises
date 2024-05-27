package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*.Faça um Programa que leia um número inteiro menor que 1000 e 
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula 
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/
public class exer36 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número menor que 1000: ");
		int num = ler.nextInt();
		int centenas = num /100;
		int dezenas = (num % 100) / 10;
		int unidades = ((num % 10) % 10);
		
		if(centenas == 1 && dezenas == 1 && unidades == 1) {
			System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidade");
		}else if(centenas == 1 && dezenas == 1 && unidades > 1) {
			System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidades");
		}else if(centenas == 1 && dezenas > 1 && unidades == 1) {
			System.out.println(centenas + " centena ," + dezenas + " dezenas e " + unidades + " unidade");
		}else if(centenas > 1 && dezenas == 1 && unidades == 1) {
			System.out.println(centenas + " centenas ," + dezenas + " dezena e " + unidades + " unidade");
		}else if(centenas == 1 && dezenas > 1 && unidades > 1) {
			System.out.println(centenas + " centena ," + dezenas + " dezenas e " + unidades + " unidades");
		}else if(centenas > 1 && dezenas == 1 && unidades > 1) {
			System.out.println(centenas + " centenas ," + dezenas + " dezena e " + unidades + " unidades");
		}else if(centenas == 1 && dezenas == 1 && unidades > 1) {
			System.out.println(centenas + " centena ," + dezenas + " dezena e " + unidades + " unidades");
		}else if(centenas > 1 && dezenas > 1 && unidades == 1) {
			System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidade");
		}else if(centenas > 1 && dezenas > 1 && unidades > 1) {
			System.out.println(centenas + " centenas ," + dezenas + " dezenas e" + unidades + " unidades");
		}else if(centenas == 1 && dezenas == 1) {
			System.out.println(centenas + " centena e" + dezenas + " dezena");
		}else if(centenas == 1 && dezenas > 1) {
			System.out.println(centenas + " centena e" + dezenas + " dezenas");
		}else if(centenas > 1 && dezenas == 1) {
			System.out.println(centenas + " centenas e" + dezenas + " dezena");
		}else if(centenas > 1 && dezenas > 1) {
			System.out.println(centenas + " centenas e" + dezenas + " dezenas");
		}else if(centenas == 1 && unidades == 1) {
			System.out.println(centenas + " centena e" + unidades + " unidade");
		}else if(centenas == 1 && unidades > 1) {
			System.out.println(centenas + " centena e" + unidades + " unidades");
		}else if(centenas > 1 && unidades == 1) {
			System.out.println(centenas + " centenas e" + unidades + " unidade");
		}else if(centenas > 1 && unidades > 1) {
			System.out.println(centenas + " centenas e" + unidades + " unidades");
		}else if( dezenas == 1 && unidades == 1) {
			System.out.println(dezenas + " dezena e" + unidades + " unidade");
		}else if( dezenas == 1 && unidades > 1) {
			System.out.println(dezenas + " dezena e" + unidades + " unidades");
		}else if( dezenas > 1 && unidades == 1) {
			System.out.println(dezenas + " dezenas e" + unidades + " unidade");
		}else if( dezenas > 1 && unidades > 1) {
			System.out.println(dezenas + " dezenas e" + unidades + " unidades");
		}else if(centenas == 1) {
			System.out.println(centenas + " centena");
		}else if(centenas > 1) {
			System.out.println(centenas + " centenas");
		}else if(dezenas == 1) {
			System.out.println(dezenas + " dezena");
		}else if(dezenas > 1) {
			System.out.println(dezenas + " dezenas");
		}else if(unidades == 1) {
			System.out.println(unidades + " unidade");
		}else if(unidades > 1) {
			System.out.println(unidades + " unidades");
		}else {
			System.out.println("Número inválido!");
		}
		

	}

}
