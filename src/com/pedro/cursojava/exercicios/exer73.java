package com.pedro.cursojava.exercicios;

import java.util.Scanner;
	/*
	O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende 
	implantar a metodologia da tabelinha, que já é um sucesso na sua loja 
	de 1,99. Você foi contratado para desenvolver o programa que monta 
	a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão 
	informado pelo usuário, conforme o exemplo abaixo:
	o Preço do pão: R$ 0.18 
	o Panificadora Pão de Ontem - Tabela de preços
	o 1 - R$ 0.18 
	o 2 - R$ 0.36 
	o ... 
	o 50 - R$ 9.00
	*/

public class exer73 {
	
	    public static void main(String[] args) {
	        //Scanner ler = new Scanner(System.in);
	        
	        System.out.println("Preço de acordo com a quantidade de produtos escolhido");
	        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
	        for(int i = 1; i <= 50; i++){
	            double total = i * 0.18;
	            
	            System.out.printf(i + " - R$ %.2f\n" + total);

	        }
	        
	        
	    }
	}
