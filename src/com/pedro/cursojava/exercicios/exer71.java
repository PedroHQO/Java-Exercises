package com.pedro.cursojava.exercicios;

import java.util.Scanner;
/*
Faça um programa que calcule o número médio de alunos por turma. 
Para isto, peça a quantidade de turmas e a quantidade de alunos para 
cada turma. As turmas não podem ter mais de 40 alunos
*/

public class exer71{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int qtdturma;
        int soma = 0;
        double total = 0;
        
        System.out.print("Digite a quantidade de turmas: ");
        qtdturma = ler.nextInt();
        
        System.out.println("DIGITE A QUANTIDADE DE ALUNOS POR TURMA. (AS QTD DE ALUNOS NÃO PODE PASSAR 40)");
        
        for(int i = 1; i <= qtdturma; i++){
            
            System.out.print(i + "° Turma: ");
            int aluno = ler.nextInt();
            
            while(aluno > 40){
                System.out.println("AS QTD DE ALUNOS NÃO PODE PASSAR 40");
                System.out.println("Digite qantidade de aluno: ");
                aluno = ler.nextInt();
                
            }
            
            soma+= aluno;
            total = soma/qtdturma; 
            
        }
        
        System.out.print("Média de Alunos por turma = " + total);
      
    }
}