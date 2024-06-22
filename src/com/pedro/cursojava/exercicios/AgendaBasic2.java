package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Modifique o programa anterior de maneira a guardar os 
compromissos de todo o ano, organizados por mês, dia e hora 
(só 8 horas por dia).*/

public class AgendaBasic2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][][] agenda = new String[12][31][8];
		
		boolean sair = false;
		byte opcao;
		
		
		
		System.out.println("-----------------------------------------");
		System.out.println("        AGENDA PESSOAL        ");
		System.out.println("-----------------------------------------");
		
		while(!sair) {//Flag para a exucação manter travada até a saída for compativel com a variavel
			
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			System.out.println("-----------------------------------------");
			
			System.out.print("Qual sua escolha: ");
			opcao = ler.nextByte();
			
			boolean mesValido = false;
			boolean diaValido = false;
			int dia = 0;
			int mes = 0;
			
			switch(opcao) {
			case 1: 
				//adicionando compromisso
				
				while(!mesValido) {
					System.out.print("Entre com o número do mês: ");
					mes = ler.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				
				
				while(!diaValido) {
					System.out.print("Entre com o dia do mês: ");
					dia = ler.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while(!horaValido) {
					System.out.print("Entre com a hora do dia: ");
					hora = ler.nextInt();
					if(hora >= 0 && hora <= 8) {
						horaValido = true;
					}else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				
				dia--;
				System.out.print("Digite o compromisso: ");
				agenda[mes][dia][hora] = ler.next();
				System.out.println("-----------------------------------------");
				break;
			
			case 2:
				//verificar compromisso
				
				while(!mesValido) {
					System.out.print("Entre com o número do mês: ");
					mes = ler.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				
				
				while(!diaValido) {
					System.out.print("Entre com o dia do mês: ");
					dia = ler.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				
				 horaValido = false;
				 hora = 0;
				while(!horaValido) {
					System.out.println("Entre com a hora do dia");
					hora = ler.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValido = true;
					}else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				
				
				dia--;
				System.out.print("O compromisso agendado é: ");
				System.out.println(agenda[mes][dia][hora]);
				System.out.println("-----------------------------------------");
				break;
				
			case 0:
				System.out.println("Saindo...");
				sair = true;
				break;
				
			default:
				System.out.println("Opção inválida, digite novamente");
				
		
			
			}

		}
	}
}

