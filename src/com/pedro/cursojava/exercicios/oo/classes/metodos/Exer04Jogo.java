package com.pedro.cursojava.exercicios.oo.classes.metodos;

import java.util.Scanner;


public class Exer04Jogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			
			if(jogoDaVelha.vezJogador1()) {
			
				System.out.println("Vez do Jogador 1: Escolha linha e coluna (1-3)");
				sinal = 'X';
			
			}else {
			
				System.out.println("Vez do Jogador 2: Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Este campo já está preenchido. Tente Novamente");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')){
				ganhou = true;
				System.out.println("Jogador 1 Venceu!");
			}else if(jogoDaVelha.verificarGanhador('O')){
				ganhou = true;
				System.out.println("Jogador 2 Venceu!");
			}else if(jogoDaVelha.jogada > 9) {//O número máximo de jogadas é 9
				ganhou = true;//Encerro o while tranformando o boolean em true, porém ninguém ganha
				System.out.println("Ninguém ganhou. Deu Velha!");
			}
		}
		
	}
	
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while(!valorValida) {//Enquanto digitar linha inválida
			System.out.println("Entre com a " + tipoValor + "(1-2 ou 3)");
			valor = scan.nextInt();
			if(valor >= 1 && valor <= 3) {
				valorValida = true;//Se a linha escolhida for entre 1 e 3 irá sair do laço while
			}else {
				System.out.println("Linha Inválida. Digite Novamente ");
			}
		}
		valor--;
		return valor;
		
	}

}
