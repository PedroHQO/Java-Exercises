package com.pedro.cursojava.aula17;

//Comum iniciar contador com 0 (inicialização)
//Colocamos a expressão boolena que será avalida
//Temos o incremento ou decremento para a parte da atualização
//A variavel i, só é válida e reconhecida dentro do bloco for, se tentar acessar por fora vai dar erro

public class Loopfor {

	public static void main(String[] args) {
		
		for(int i=0; i< 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		// Podemos também iniciar duas váriaveis trata-las em "conjunto"
		for(int i=0, j=10 ; i < j ; i++, j-- ) {
			System.out.println("i é: " + i + " ; j é: " + j);
		}
		
		//for com partes faltantes
		int count = 0;
		
		for(; count < 5; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		//loop infinito for(; ; );
		
		
		

	}

}
