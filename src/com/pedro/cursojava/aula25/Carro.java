package com.pedro.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutomia() {//boas praticas sempre começa com nome de verbo
		

		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Chamando método obter autonomia!");
		return capCombustivel * consumoCombustivel;
	}
	
	//metodo que vai calcular o consumo de combustivel para determinado kilometragem
	double calcularCombustivel(double km) {
		//não tenho a informação km na classe logo eu uso um metodo com parâmetro
		double qtdCombustivel =  km/consumoCombustivel;
		return qtdCombustivel;
	}

}
