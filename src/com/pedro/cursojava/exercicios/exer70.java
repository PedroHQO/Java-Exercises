package com.pedro.cursojava.exercicios;

import java.util.*;
/*
.Numa eleição existem três candidatos. Faça um programa que peça o 
número total de eleitores. Peça para cada eleitor votar e ao final 
mostrar o número de votos de cada candidato.
*/

public class exer70{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int eleitores;
        int cand1 = 0, cand2 = 0, cand3 = 0;
        int voto;
        
        System.out.println("ELEIÇÕES 2088");
        System.out.println("Lista de candidatos:\n 1.Borso\n 2.Bula\n 3.Padre");
        
        System.out.print("Digite a quantidade eleitores: ");
        eleitores = ler.nextInt();
        
        for(int i = 1; i <= eleitores; i++){
            
            System.out.print("Digite o número do seu candidato: ");
            voto = ler.nextInt();
            switch(voto){
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                default:
                    System.out.println("CANDIDATO ÍNVALIDO!");
                    continue;
            }
        }
        
        System.out.println("Candidato 1.Borso = " + cand1 + " votos");
        System.out.println("Candidato 2.Bula = " + cand2 + " votos");
        System.out.println("Candidato 3.Padre = " + cand3 + " votos");
        
    }
}
