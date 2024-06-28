package com.pedro.cursojava.exercicios.oo.classes.metodos;

/*Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.*/

import java.util.Scanner;

public class Lamppada {

	int ligar;
	int desligar;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Lamppada lampadaStatus = new Lamppada();
		lampadaStatus.ligar = 1;
		lampadaStatus.desligar = 0;
	
		
		System.out.println("Digite a ação da lampada: ");
		int acao = ler.nextInt();
		
		if(acao == lampadaStatus.ligar) {
			//lampadaLigada.ligar = acao;
			int acionarlampada = lampadaStatus.ligarLampada();
			System.out.println("Status da lampada: " + lampadaStatus.ligar);
		}else if(acao == lampadaStatus.desligar) {
			int acionarlampada = lampadaStatus.desligarLampada();
			System.out.println("Status da Lâmpada: " + lampadaStatus.desligar);
		}
		

	}
	
	int ligarLampada() {

		System.out.println("Lampada está ligada!");
		return ligar;
		
	}
	
	int desligarLampada() {

		System.out.println("Lampada está desligada!");
		return desligar;
		
	}


}
