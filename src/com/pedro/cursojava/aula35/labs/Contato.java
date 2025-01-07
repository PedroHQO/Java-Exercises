package com.pedro.cursojava.aula35.labs;

public class Contato {
	
	private String nome;
	private String tel;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		return "Nome:  " + nome + "; \n"
				+ "E-mail: " + email + "; \n"
				+ "Tel: " + tel;
	}
}
