package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg 
Morango R$ 2,50 por Kg R$ 2,20 por Kg 
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de 
10% sobre este total. Escreva um algoritmo para ler a 
quantidade (em Kg) de morangos e a quantidade (em Kg) de 
maças adquiridas e escreva o valor a ser pago pelo cliente.
*/

public class exer44 {

	public static void main(String[] args) {
		double peso, total, desco, morango, maca, valor1, valor2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("BEM-VINDO A QUITANDA FRUTFREE");
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("SEGUE NOSSA PROMOÇÂO DO DIA...");
		System.out.println("Até 5Kg -> Morango R$ 2,50 por Kg | Acima de 5Kg -> R$ 2,20 por Kg");
		System.out.println("Até 5Kg -> Maçã R$ 1,80 por Kg | Acima de 5Kg -> R$ 1,50 por Kg");
		System.out.println("Comprando mais de 8kg ou valor da compra maior do que R$25,00 terá desconto de 10%!!!");
		System.out.println("Digite '1' para Morango e '2' para Maçã ou '3' para Ambas ");
		int opcao = ler.nextInt();

		switch(opcao) {
		case 1:
			System.out.println("Você escolheu MORANGOS");
			System.out.println("Digite quantos Kilos de morango irá querer: ");
			peso = ler.nextDouble();
			if(peso <= 5) {
				total = peso * 2.5;
				System.out.println(peso + "Kg de morango fica no total de R$ " + total);
			}else if(peso > 5) {
				total = peso * 2.2;
				System.out.println(peso + "Kg de morango fica no total de R$ " + total);
				if(peso > 8 || total > 25) {
					desco = total - (total * 0.1);
					System.out.println("Com 10% de desconto: "+ peso + "Kg de morango fica no total de R$ " + desco);
				}
			}
			break;
		case 2:
			System.out.println("Você escolheu Maçã");
			System.out.println("Digite quantos Kilos de maçã irá querer: ");
			peso = ler.nextDouble();
			if(peso <= 5) {
				total = peso * 1.8;
				System.out.println(peso + "Kg de maçã fica no total de R$ " + total);
			}else if(peso > 5) {
				total = peso * 1.5;
				System.out.println(peso + "Kg de maçã fica no total de R$ " + total);
				if(peso > 8 || total > 25) {
					desco = total - (total * 0.1);
					System.out.println("Com 10% de desconto: "+ peso + "Kg de maçã fica no total de R$ " + desco);
				}
			}
			break;
		case 3:
			System.out.println("Você escolheu Ambas");
			System.out.println("Digite quantos Kilos de morango irá querer: ");
			morango = ler.nextDouble();
			System.out.println("Digite quantos Kilos de maçã irá querer: ");
			maca = ler.nextDouble();
			peso = morango + maca;
			if(peso <= 5) {
				valor1 = morango * 2.5;
				valor2 = maca * 1.8;
				total = valor1 + valor2;
				System.out.println(morango + "Kg de Morango + " + maca + "Kg de Maçã fica no total de R$ " + total);
			}else if(peso > 5) {
				valor1 = morango * 2.2;
				valor2 = maca * 1.5;
				total = valor1 + valor2;
				System.out.println(morango + "Kg de Morango + " + maca + "Kg de Maçã fica no total de R$ " + total);
				if(peso > 8 || total > 25) {
					desco = total - (total * 0.1);
					System.out.println("Com 10% de desconto: " + morango + "Kg de Morango + " + maca + "Kg de Maçã fica no total de R$ " + desco);
				}
			}
			break;
		default:
		{
			System.out.println("OPÇÃO ÍNVALIDA!!!!");
		}
		}
	}

}