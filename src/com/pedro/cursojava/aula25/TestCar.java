package com.pedro.cursojava.aula25;

import com.pedro.cursojava.aula25.Carro;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro uno = new Carro();
		uno.marca = "Fiat";
		uno.modelo = "Uno Mille";
		uno.capCombustivel = 20;
		uno.numPassageiros = 4;
		uno.consumoCombustivel = 0.8;
		
		System.out.println("Marca: " + uno.marca);
		System.out.println("Modelo: " + uno.modelo);
		
		uno.exibirAutomia();
		
//		double autonomia = uno.obterAutonomia();//retornando método
//		System.out.println("O uno normalmente faz " + autonomia + "Km/L");
//		System.out.println("A autonomia do carro é: " + uno.obterAutonomia() + "km");
//		
//		//Dentro do parenteses quando vamos chamar o metodo recebe o nome de argumento, é o valor atribuido ao km
//		double combustivel = uno.calcularCombustivel(10);
//		double combustivel18 = uno.calcularCombustivel(18);
//		
//		System.out.println("Quantida de Combustivel gasto a 10KM = " + combustivel);
//		System.out.println("Quantida de Combustivel gasto a 18KM = " + uno.calcularCombustivel(combustivel18));
//		
	}

}
