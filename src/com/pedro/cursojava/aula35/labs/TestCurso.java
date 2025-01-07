package com.pedro.cursojava.aula35.labs;

import java.util.Scanner;

public class TestCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Curso: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o horário do Curso: ");
		String horario = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNomeCurso(nome);
		curso.setHorarioCurso(horario);
		
		System.out.println("Digite o nome do Professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.println("Digite o departamento do professor: ");
		String depProf = scan.nextLine();
		
		System.out.println("Digite o e-mail: ");
		String emailProf = scan.nextLine();
		
		Professor professor = new Professor();
		professor.setNomeProfessor(nomeProf);
		professor.setDepart(depProf);
		professor.setEmail(emailProf);
		
		System.out.println("--------Alunos--------");
		
		Aluno[] alunos = new Aluno[5];
		for(int i=0; i<5; i++) {
			
			scan.nextLine();
			
			System.out.println("Digite o nome do aluno " + (i+1) + "°: ");
			String nomeAluno = scan.nextLine();
			
			System.out.println("Digite a matricula: ");
			String matriAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++) {
				System.out.println("Digite a nota " + (j+1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriAluno);
			aluno.setNota(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAluno(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
