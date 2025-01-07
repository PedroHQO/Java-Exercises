package com.pedro.cursojava.aula35.labs;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double notas[];
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double[] getNota() {
		return notas;
	}
	
	public void setNota(double[] nota) {
		this.notas = nota;
	}
	
	
	public String obterInfo() {
		
		 String info = "Nome Aluno " + nome + ";\n";
		 info += "Matricula =" + matricula + ";\n";
		 info += "Notas: ";
		 
		 double soma = 0;
		 for(double nota : notas) {
			 soma += nota;
			 info += nota + " "; 
		 }
		 
		 double media = soma/4;
		 info += "\n " + "Media: " + media + " - "; 
		 if(media >= 7) {
			 info += "Aprovado!";
		 }else {
			 info += "Reprovado!";
		 }
		 
		 return info;
	}
	
	public double obterMedia() {
		double soma = 0;
		 for(double nota : notas) {
			 soma += nota;
		 }
		 return soma/4;
	}

}
