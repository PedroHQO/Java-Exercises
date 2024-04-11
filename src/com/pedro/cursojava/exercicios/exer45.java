package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*O Hipermercado Tabajara está com uma promoção de carnes que é 
imperdível. Confira:
o Até 5 Kg 					Acima de 5 Kg 
o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg 
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg 
o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar 
apenas um dos tipos de carne da promoção, porém não há 
limites para a quantidade de carne por cliente. Se compra for 
feita no cartão Tabajara o cliente receberá ainda um desconto 
de 5% sobre o total a compra. Escreva um programa que peça 
o tipo e a quantidade de carne comprada pelo usuário e gere 
um cupom fiscal, contendo as informações da compra: tipo e 
quantidade de carne, preço total, tipo de pagamento, valor do 
desconto e valor a pagar.*/

public class exer45 {

	public static void main(String[] args) {
		double quilo, desco, total;
		int num, tipoPag;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("BEM - VINDO AO MERCADO TABAJARA!");
		System.out.println("Veja nossas Promoções: ");
		System.out.println("Até 5 Kg 				Acima de 5 Kg ");
		System.out.println("File Duplo R$ 4,90 por Kg 		R$ 5,80 por Kg ");
		System.out.println("Alcatra R$ 5,90 por Kg 			R$ 6,80 por Kg  ");
		System.out.println("Picanha R$ 6,90 por Kg 			R$ 7,80 por Kg ");
		System.out.println(" ");
		System.out.println("Digite (1) para Filé Duplo, (2) para Alcatra, (3) para Picanha: ");
		num = ler.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("Quantos Kg será de Filé Duplo: ");
			quilo = ler.nextDouble();
			if(quilo < 5) {
				total = quilo * 4.90;
				
			}else {
				total = quilo * 5.80;
			}
			System.out.println("Qual será o tipo de pagamento: ");
			System.out.println("4. para Dinheiro");
			System.out.println("5. para Cartão Débito");
			System.out.println("6. para Cartão Crédito");
			System.out.println("7. para Cartão Tabajara (5% de Desconto)");
			tipoPag = ler.nextInt();
			switch(tipoPag) {
			case 4:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de filé Duplo");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: DINHEIRO");
				System.out.println("----------------------------------");
				break;
			case 5:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de filé Duplo");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO DEB.");
				System.out.println("----------------------------------");
				break;
			case 6:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de filé Duplo");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO CRÉD.");
				System.out.println("----------------------------------");
				break;
			case 7:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				desco = total - (total * 0.05);
				System.out.println(quilo + "Kg de filé Duplo");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO TABAJARA");
				System.out.println("Preço a pagar com 5% de Desconto: R$ " + desco);
				System.out.println("----------------------------------");
				break;
			default:
				System.out.println("OPÇÂO ÍNVALIDA!! ");
				break;
			}
		break;
		case 2:
			System.out.println("Quantos Kg será de Alcatra: ");
			quilo = ler.nextDouble();
			if(quilo < 5) {
				total = quilo * 5.90;
				
			}else {
				total = quilo * 6.80;
			}
			System.out.println("Qual será o tipo de pagamento: ");
			System.out.println("4. para Dinheiro");
			System.out.println("5. para Cartão Débito");
			System.out.println("6. para Cartão Crédito");
			System.out.println("7. para Cartão Tabajara (5% de Desconto)");
			tipoPag = ler.nextInt();
			switch(tipoPag) {
			case 4:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Alcatra");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: DINHEIRO");
				System.out.println("----------------------------------");
				break;
			case 5:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Alcatra");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO DEB.");
				System.out.println("----------------------------------");
				break;
			case 6:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Alcatra");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO CRÉD.");
				System.out.println("----------------------------------");
				break;
			case 7:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				desco = total - (total * 0.05);
				System.out.println(quilo + "Kg de Alcatra");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO TABAJARA");
				System.out.println("Preço a pagar com 5% de Desconto: R$ " + desco);
				System.out.println("----------------------------------");
				break;
			default:
				System.out.println("OPÇÂO ÍNVALIDA!! ");
				break;
			}
		break;
		case 3:
			System.out.println("Quantos Kg será de Picanha: ");
			quilo = ler.nextDouble();
			if(quilo < 5) {
				total = quilo * 6.90;
				
			}else {
				total = quilo * 7.80;
			}
			System.out.println("Qual será o tipo de pagamento: ");
			System.out.println("4. para Dinheiro");
			System.out.println("5. para Cartão Débito");
			System.out.println("6. para Cartão Crédito");
			System.out.println("7. para Cartão Tabajara (5% de Desconto)");
			tipoPag = ler.nextInt();
			switch(tipoPag) {
			case 4:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Picanha");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: DINHEIRO");
				System.out.println("----------------------------------");
				break;
			case 5:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Picanha");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO DEB.");
				System.out.println("----------------------------------");
				break;
			case 6:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				System.out.println(quilo + "Kg de Picanha");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO CRÉD.");
				System.out.println("----------------------------------");
				break;
			case 7:
				System.out.println(" ");
				System.out.println("---------- NOTA FISCAL ----------");
				desco = total - (total * 0.05);
				System.out.println(quilo + "Kg de Picanha");
				System.out.println("Preço a pagar: R$ " + total);
				System.out.println("Tipo de pagamento: CARTÃO TABAJARA");
				System.out.println("Preço a pagar com 5% de Desconto: R$ " + desco);
				System.out.println("----------------------------------");
				break;
			default:
				System.out.println("OPÇÂO ÍNVALIDA!! ");
				break;
			}
		break;
		default:
			System.out.println("OPÇÂO ÍNVALIDA!!");
			break;
		}
		
	}

}
