package com.pedro.cursojava.aula35.labs;

public class Agenda {
	
	private String nome;
	private int ano;
	private Contato[] contatos;
	
	
	public Agenda() {
		super();
	}
	
	public Agenda(String nome, int ano) {
		super();
		this.nome = nome;
		this.ano = ano;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	
	public String obterInfo() {
		String info = "Nome: " + nome + "\n";
		
		if(contatos != null) {
			for(Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
	
	

}
