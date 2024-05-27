package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um programa que calcule o mostre a média aritmética de N 
notas*/

public class exer69{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean numero;
        double soma = 0;
        double cont = -1;
        
        while(numero = true){
            cont++;
            System.out.println("Digite uma nota:)");
            double nota = ler.nextInt();
            soma += nota;
            
            if(nota == 0){
                numero = false;
                
                double total = soma / cont;
                System.out.println("M.A =" + total);
                 break;
            }
            
            
        }
        
        
       
    }
}
