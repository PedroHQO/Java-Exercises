package com.pedro.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		int idade = 20;
		String nome = "Pedro";
		String nomeDoMeuCachorro = "Pantera";
		String ano2023 = "vinte 23";
		
		//aceito, mas não utilizada
		int _idade = 15;
		int $idade = 53;
		
		//Não é convenção Java
		String nome_do_meu_cachorro = "Pantera";
		String NomeDoMeuCachorro = "Spike";
		//String nomeDoMeucachorro;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Nome = " + $idade);
		System.out.println("Nome = " + _idade);
		System.out.println("Nome = " + ano2023);
		System.out.println("Nome = " + nome_do_meu_cachorro);
		System.out.println("Nome = " + nomeDoMeuCachorro);
		System.out.println("Nome = " + NomeDoMeuCachorro);


	}

}
