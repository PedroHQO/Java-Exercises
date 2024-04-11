package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*
Faça um programa que peça para n pessoas a sua idade, ao final o 
programa devera verificar se a média de idade da turma varia entre 0 e 
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta 
ou idosa, conforme a média calculada
*/

public class exer68 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean numero;
        int soma = 0;
        int cont = -1;
        
        while(numero = true){
            cont++;
            System.out.println("Digite uma idade: (Ou digite '0' para parar))");
            int idade = ler.nextInt();
            soma += idade;
            
            if(idade == 0){
                numero = false;
                
                double total = soma / cont;
                
                if(total > 0 && total <= 25){
                    System.out.println("Média das idades =" + total);
                    System.out.println("Média = turma JOVEM!");
                }else if(total > 25 && total <= 60){
                    System.out.println("Média das idades =" + total);
                    System.out.println("Média = turma ADULTA!");
                }else{
                    System.out.println("Média das idades =" + total);
                    System.out.println("Média = turma IDOSA!");
                }
                
                 break;
            }
            
            
        }
        
        
       
    }
}
