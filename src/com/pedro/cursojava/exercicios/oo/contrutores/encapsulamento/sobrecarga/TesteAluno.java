package com.pedro.cursojava.exercicios.oo.contrutores.encapsulamento.sobrecarga;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno(null, null, null);
		
		System.out.print("Entre com o nome do aluno: ");
        aluno.setNome(scan.nextLine());
        
        System.out.print("Entre com o nome do curso: ");
        aluno.setNomeCurso(scan.nextLine());
        
        System.out.print("Entre com a matricula: ");
        aluno.setMatricula(scan.nextLine());
        
      //aluno.nomeDisciplinas = new String[3];
        for (int i=0; i<aluno.getNomeDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinasPos(i, scan.next());
        }
        
        for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNomeDisciplinasPosIJ(i, j, scan.nextDouble());
            }
        }
        
        aluno.mostrarDados();
        
        for (int i=0; i<aluno.getNomeDisciplinas().length; i++){
            if (aluno.verificarAlunoAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
            }
        }
		

	}
	

}
