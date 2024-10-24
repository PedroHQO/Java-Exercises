package com.pedro.cursojava.exercicios.oo.classes.metodos;


public class JogoDaVelha {
	
	char[][] game = new char [3][3];
	int jogada = 1;
	
	boolean validarJogada(int linha, int coluna, char sinal) {
		
		if(game[linha][coluna] == 'X' || game[linha][coluna] == 'O') {
			return false;
			
		}else {
			game[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		for(int i = 0; i<game.length; i++) {
			for(int j = 0; j<game[i].length; j++) {
				System.out.print(game[i][j] + " | ");
				
			}
			System.out.println();
		}
	}
	
	boolean verificarGanhador(char sinal ) {
		if((game[0][0] == sinal && game[0][1] == sinal && game[0][2] == sinal ) ||//linha 0
				(game[1][0] == sinal && game[1][1] == sinal && game[1][2] == sinal ) || //linha 1
				(game[2][0] == sinal && game[2][1] == sinal && game[2][2] == sinal ) ||//linha 2
				(game[0][0] == sinal && game[1][0] == sinal && game[2][0] == sinal ) ||// coluna 0
				(game[0][1] == sinal && game[1][1] == sinal && game[2][1] == sinal ) || //coluna 1
				(game[0][2] == sinal && game[1][2] == sinal && game[2][2] == sinal ) || //coluna 2
				(game[0][0] == sinal && game[1][1] == sinal && game[2][2] == sinal ) ||//diagonal L para R
				(game[0][2] == sinal && game[1][1] == sinal && game[2][0] == sinal )) { // diagola R para L
			return true;
		}
		return false;	
	}
	boolean vezJogador1() {
		if(jogada % 2 == 1) {
			return true;
		}
		return false;
	}
	
}
