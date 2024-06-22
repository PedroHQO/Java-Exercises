package com.pedro.cursojava.aula24;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Carro van = new Carro();
			van.marca = "Honda";
			van.modelo = "Cinvic";
			van.capCombustivel = 20.5;
			van.numPassageiros = 15;
			van.consumoCombustivel = 9.9;
			
			System.out.println("Marca: " + van.marca);
			System.out.println("Modelo: " + van.modelo);
			System.out.println("Capacidade Tanque: " + van.capCombustivel);
			System.out.println("Consumo por KM: " + van.consumoCombustivel);
			System.out.println("Qtd Passageiro: " + van.numPassageiros);
			
			System.out.println("-----------------------------");
			
			Carro uno = new Carro();
			uno.marca = "Fiat";
			uno.modelo = "Uno Mille";
			uno.capCombustivel = 20;
			uno.numPassageiros = 4;
			uno.consumoCombustivel = 12;
			
			System.out.println("Marca: " + uno.marca);
			System.out.println("Modelo: " + uno.modelo);
			System.out.println("Capacidade Tanque: " + uno.capCombustivel);
			System.out.println("Consumo por KM: " + uno.consumoCombustivel);
			System.out.println("Qtd Passageiro: " + uno.numPassageiros);
			
	}

}
