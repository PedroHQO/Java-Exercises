package com.pedro.cursojava.aula29;

public class TesteCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno", 4, 10, 5);
		
		System.out.println(carro.marca);
		System.out.println(carro.obterAutonomia());
		carro.exibirAutomia();
				
		
	}
	
	
}
