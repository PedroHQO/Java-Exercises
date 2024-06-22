package com.pedro.cursojava.exercicios;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
que verifique se "todos" os elementos do vetor A são pares. Se pelo 
menos um elemento do vetor não for par o processo de repetição para 
percorrer os elementos do vetor deve ser encerrado, como sugestão: 
utilize uma variável do tipo flag para atingir este propósito.*/

public class exer101 {

	public static void main(String[] args) {
		
		boolean pares = true;
		int naoPar = 0;
		int[] vetorA = {2, 4, 6, 81, 10, 12, 14, 16, 18, 20};
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Pos_"+i+" = " + vetorA[i]);
			
			/*if(vetorA[i] % 2 == 1){
				System.out.println("Não é par: " + vetorA[i]);
				break;
			}*/
			
			pares = true;
			if(vetorA[i] % 2 == 0) {
				
			}else {
				naoPar += vetorA[i];
				pares = false;
				break;
			}
			
		}
		System.out.println("Não é par: " + naoPar);
	}

}
