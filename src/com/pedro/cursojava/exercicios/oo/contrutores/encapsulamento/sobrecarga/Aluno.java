package com.pedro.cursojava.exercicios.oo.contrutores.encapsulamento.sobrecarga;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][4];


	public Aluno(String[] nomeDisciplinas, double[][] notasDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	public Aluno(String nome, String matricula, String nomeCurso) {
	
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
	}

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


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}


	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}


	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}


	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	public void mostrarDados() {
		
		System.out.println("Nome aluno: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i = 0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
			for(int j = 0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean verificarAlunoAprovado(int indice) {
		if(calcularMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
	
	private double calcularMedia(int indice) {
		double soma = 0;
		
		for(int i = 0; i<notasDisciplinas[indice].length; i++) {	
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		return media;
	}	
	
	public void setNomeDisciplinasPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNomeDisciplinasPosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
	
}
