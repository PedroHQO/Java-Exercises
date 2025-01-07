package com.pedro.cursojava.aula35.labs;

public class Professor {
	private String nomeProfessor;
	private String depart;
	private String email;
	

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		return "Professor: " + nomeProfessor;
	}
}
