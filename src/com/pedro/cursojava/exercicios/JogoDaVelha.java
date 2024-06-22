package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa para jogar o jogo da velha. O programa deve 
permitir que dois jogadores façam uma partida do jogo da velha, 
usando o computador para ver o tabuleiro. Cada jogador vai 
alternadamente informando a posição onde deseja colocar a sua 
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e 
determinar automaticamente quando o jogo terminou e quem foi o 
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa 
deve atualizar a situação do tabuleiro na tela.*/

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char[][] game = new char [3][3];
	
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		System.out.println("###########################################");
		System.out.println("             JOGO DA VELHA                 ");
		System.out.println("###########################################");
		
		while(!ganhou) {//Enquanto não ganhar vai ficar dentro do laço while
			
			if(jogada % 2 == 1) {//jogador 1
				
				System.out.println("Vez do Jogador 1: Escolha linha e coluna (1-3)");
				sinal = 'X';
				
			}else {
				
				System.out.println("Vez do Jogador 2: Escolha linha e coluna (1-3)");
				sinal = 'O';
			
			}
			
			
			boolean linhaValida = false;
			while(!linhaValida) {//Enquanto digitar linha inválida
				System.out.println("Digite a linha (1-2-3)");
				linha = ler.nextInt();
				if(linha >= 1 && linha <= 3) {
					linhaValida = true;//Se a linha escolhida for entre 1 e 3 irá sair do laço while
				}else {
					System.err.println("Linha Inválida. Digite Novamente ");
				}
			}
			
			boolean colunaValida = false;//mesmo procedimento de cima, porém para coluna
			while(!colunaValida) {
				System.out.println("Digite a culuna (1-2-3)");
				coluna = ler.nextInt();
				if(coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				}else {
					System.err.println("Coluna Inválida. Digite Novamente ");
				}
			}
			
			//Para tornar a aplicação mais intuitiva com usuário para escolher posições de 1-3 e 
			//não dê 0-2(matriz começa no 0), usa esse decrementador, quando escolher linha 1(na verdade sera 0)
			//mesmo vale para a coluna
			linha--;
			coluna--;
			
			//Aqui está reconhecendo o que foi digitado em linha e coluna e colocando dentro da matriz
			//Se digitar novamente o mesmo campo seja para X ou O, será emitido a mensagem. Reconhece automatico
			if(game[linha][coluna] == 'X' || game[linha][coluna] == 'O') {
				System.err.println("Este campo já está preenchido. Tente Novamente");
			}else {
				game[linha][coluna] = sinal;
				jogada++;
			}
			
			//imprimir tabuleiro
			for(int i = 0; i<game.length; i++) {
				for(int j = 0; j<game[i].length; j++) {
					System.out.print(game[i][j] + " | ");
					
				}
				System.out.println();
			}
			
			
			//verificando quem ganhou
			if((game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X' ) ||//linha 0
					(game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X' ) || //linha 1
					(game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X' ) ||//linha 2
					(game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X' ) ||// coluna 0
					(game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X' ) || //coluna 1
					(game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X' ) || //coluna 2
					(game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X' ) ||//diagonal L para R
					(game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X' )) { // diagola R para L
				ganhou = true;
				System.out.println("Jogador 1 Venceu!");
			}else if((game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O' ) ||//linha 0
					(game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O' ) || //linha 1
					(game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O' ) ||//linha 2
					(game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O' ) ||// coluna 0
					(game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O' ) || //coluna 1
					(game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O' ) || //coluna 2
					(game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O' ) ||//diagonal L para R
					(game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O' )) { // diagola R para L
				ganhou = true;
				System.out.println("Jogador 2 Venceu!");
			}else if(jogada > 9) {//O número máximo de jogadas é 9
				ganhou = true;//Encerro o while tranformando o boolean em true, porém ninguém ganha
				System.out.println("Ninguém ganhou. Deu Velha!");
			}
			
			
			
		}
		
	}

}
