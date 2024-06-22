package com.pedro.cursojava.exercicios;

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
*/


public class exer82 {

	public static void main(String[] args) {
		int[] vetorA = {4,8,12,16,20,24,28,32,36,40,48,52,56,60,64};
        int[] vetorB = new int[15];
        
        for(int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
            
            System.out.println("Veto A = " + vetorA[i] + " ^2 = Vetor B: " + vetorB[i]);
            
        }


	}

}
