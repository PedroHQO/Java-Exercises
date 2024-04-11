package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*A série de Fibonacci é formada pela seqüência 
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série 
até o n−ésimo termo.*/
public class exer60 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anterior = 1;
		int atual = 1;
		
		System.out.println("Digite o número de termos da sequência de FIBONNACI: ");
		int num = ler.nextInt();
		System.out.println("Resultado da seqênciaa: ");
		
		for(int i = 0; i < num; i++) {
			System.out.println(atual); // Imprime o termo atual
            
			//Executando a sequencia
            int proximo = atual + anterior; // Calcula o próximo termo da sequência
            atual = anterior; // Transforma 'atual' para anterior
            anterior = proximo; // Transforma 'anterior' para o termo seguinte na sequência que é 'proximo'
            
        }
	}

}
