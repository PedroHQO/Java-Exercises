package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*Faça um Programa que peça os 3 lados de um triângulo. O programa 
deverá informar se os valores podem ser um triângulo. Indique, caso 
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer 
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
*/

public class exer32 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para saber se forma um TRIÂNGULO: ");
		double lado1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor para saber se forma um TRIÂNGULO: ");
		double lado2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor para saber se forma um TRIÂNGULO: ");
		double lado3 = ler.nextDouble();
		
		if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1) && lado1 == lado2 && lado2 == lado3) {
			System.out.println("Os valores digitados formam um TRIÂNGULO!");
			System.out.println("Parabéns, seu TRIÂNGULO é Equilátero");
		}else if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)&& lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Os valores digitados formam um TRIÂNGULO!");
			System.out.println("Parabéns, seu TRIÂNGULO é Isósceles");
		}else if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1) && lado1 != lado2 && lado1 != lado2 && lado2 != lado3) {
			System.out.println("Os valores digitados formam um TRIÂNGULO!");
			System.out.println("Parabéns, seu TRIÂNGULO é Escaleno");
		}else{
			System.out.println("Os valores digitados não formam um TRIÂNGULO!");
		}
		

	}

}
