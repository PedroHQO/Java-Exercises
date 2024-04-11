package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*6.Um posto está vendendo combustíveis com a seguinte tabela de 
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um 
algoritmo que leia o número de litros vendidos, o tipo de 
combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente 
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço 
do litro do álcool é R$ 1,90.*/

public class exer43 {

	public static void main(String[] args) {
		double litros, desco, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("BEM_VINDO AO POSTO ABASTECER");
		System.out.println("------------------------------");
		System.out.println("Segue nossa tabela de preços:");
		System.out.println("Álcool -> R$ 1,90/L, até 20 litros, desconto de 3% por litro");
		System.out.println("Acima de 20 litros, desconto de 5% por litro.");
		System.out.println("Gasolina -> R$ 2,50/L, até 20 litros, desconto de 4% por litro");
		System.out.println("Acima de 20 litros, desconto de 6% por litro.");
		System.out.println(" ");
		System.out.println("Digite para abastecer: 'A' para ÁLCOOL ou 'G' para GASOLINA: ");
		//char letra = ler.next().toUpperCase().charAt(0);
		String letra = ler.next().toUpperCase();
		switch(letra) {
		case "A": 
			System.out.println("Você escolheu abastecer com ÁLCOOL");
			System.out.println("Digite qtd litros deseja: ");
			litros = ler.nextDouble();
			if(litros <= 20) {
				total = litros * 1.9;
				desco = total - (total * 0.03);
				System.out.println(litros + "L ÁLCOOL fica no total de R$ " + desco);
			}else {
				total = litros * 1.9;
				desco = total - (total * 0.05);
				System.out.println(litros + "L ÁLCOOL fica no total de R$ " + desco);
			}
			break;
		case "G":
			System.out.println("Você escolheu abastecer com GASOINA");
			System.out.println("Digite qtd litros deseja: ");
			litros = ler.nextDouble();
			if(litros <= 20) {
				total = litros * 2.5;
				desco = total - (total * 0.04);
				System.out.println(litros + "L de GASOLINA fica no total de R$" + desco);
			}else {
				total = litros * 2.5;
				desco = total - (total * 0.06);
				System.out.printf(litros + "L GASOLINA fica no total de R$" + desco);
			}
			break;
		default:
			System.out.println("OPÇÃO ÍNVALIDA!");
		}
	}

}
