package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa para armazenar em uma matriz os 
compromissos de uma agenda pessoal. Cada dia do mês deve 
conter 24 horas, onde para cada uma destas 24 horas podemos 
associar um tarefa específica (compromisso agendado). O 
programa deve ter um menu onde o usuário indica o dia do mês 
que deseja alterar e a hora, entrando em seguida com o 
compromisso, ou então, o usuário pode também consultar a 
agenda, fornecendo o dia e a hora para obter o 
compromisso armazenado.*/

public class AgendaBasic {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][] agenda = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		
		
		
		System.out.println("------------------------------");
		System.out.println("        AGENDA PESSOAL        ");
		System.out.println("------------------------------");
		
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao = ler.nextByte();
			
			boolean diaValido = false;
			int dia = 0;
			
			if(opcao == 1) {//adicionando compromisso
				
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
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
					System.out.println("Entre com a hora do dia");
					hora = ler.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValido = true;
					}else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso: ");
				agenda[dia][hora] = ler.next();
				
			}else if(opcao == 2) {//verificar compromisso
				
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
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
					System.out.println("Entre com a hora do dia");
					hora = ler.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValido = true;
					}else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				
				
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(agenda[dia][hora]);
				
				
			}else if(opcao == 0) {
				System.out.println("Saindo...");
				sair = true;
			}else {
				System.out.println("Opção inválida, digite novamente");
			
				}
		
			
		}
		
		
	}

}
