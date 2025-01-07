package com.pedro.cursojava.aula35.labs;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da Agenda: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite ano da Agenda: ");
		int ano = scan.nextInt();
		
		Agenda agenda = new Agenda(nome, ano);
		System.out.println("____________________");
	
		
		Contato[] contatos = new Contato[3];
		for(int i = 0; i<3; i++) {
			System.out.println("Preencha as informações do contato " + (i+1) + ": ");
			Contato c = new Contato();
			
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o E-mail: ");
			String email = scan.nextLine();
			c.setEmail(nome);
			
			System.out.println("Digite o Telefone: ");
			String telefone = scan.nextLine();
			c.setTel(telefone);
			
			contatos[i] = c;
			
			System.out.println("____________________");
		}
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
			
		}

	}

}
