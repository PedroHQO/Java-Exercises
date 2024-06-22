package com.pedro.cursojava.exercicios.oo;

public class InfoLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		LivroLivraria informacoes = new LivroLivraria();
		LivroBiblioteca biblioteca = new LivroBiblioteca();
		
		livro.autor = "Pedro Henrique";
		livro.titulo = "Arte do Milhão";
		livro.anoLanca = 2023;
		livro.qtdPag = 110;
		
		informacoes.preco = 28.99;
		informacoes.nivelEdicao = "1° Edição";
		
		biblioteca.nome = "Lucas Gabriel";
		biblioteca.dia = 18;
		biblioteca.mes = 8;
		biblioteca.ano = 2024;
		biblioteca.devolucao = 49;
		
		
		System.out.println("Título Livro: " + livro.titulo);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Ano Lançamento: " + livro.anoLanca);
		System.out.println("Quantidade Páginas: " + livro.qtdPag);
		System.out.println("Edição do Livro: " + informacoes.nivelEdicao);
		System.out.println("Preço: R$" + informacoes.preco);
		System.out.println("Biblioteca Pública");
		System.out.println("Nome do Responsável: " + biblioteca.nome );
		System.out.println("Dia que pegou o livro: " + biblioteca.dia );
		System.out.println("Mês que pegou o livro: " + biblioteca.mes );
		System.out.println("Ano que pegou o livro: " + biblioteca.ano );
		System.out.println("Devolverá em quantos dias: " + biblioteca.devolucao );
		
		

	}

}
