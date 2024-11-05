package com.pedro.cursojava.exercicios.oo.contrutores.encapsulamento.sobrecarga;

public class JogoDaVelha {
	
	private char[][] game ;
	private int jogada ;
	
	
	public JogoDaVelha() {
		this.game = new char [3][3];
		this.jogada = 1;
	}


	public char[][] getGame() {
		return game;
	}


	public void setGame(char[][] game) {
		this.game = game;
	}


	public int getJogada() {
		return jogada;
	}


	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	
	public boolean validarJogada(int linha, int coluna, char sinal) {
		
		if(game[linha][coluna] == 'X' || game[linha][coluna] == 'O') {
			return false;
			
		}else {
			game[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	
	public void imprimirTabuleiro() {
		for(int i = 0; i<game.length; i++) {
			for(int j = 0; j<game[i].length; j++) {
				System.out.print(game[i][j] + " | ");
				
			}
			System.out.println();
		}
	}
	
	public boolean verificarGanhador(char sinal ) {
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
	
	public boolean vezJogador1() {
		if(jogada % 2 == 1) {
			return true;
		}
		return false;
	}
}
