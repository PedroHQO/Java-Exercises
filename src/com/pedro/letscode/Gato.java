package com.pedro.letscode;

public class Gato extends Animal{

		static int contGato;
	
	//Construtor
	public Gato(String nome, String cor,  double peso) {
		super(nome, cor, peso);
		
	}




	@Override
	public String toString() {
		return "Gato [nome=" + nome + "]";
	}




	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("MIAU MIAU");
	}
	
	
	
	
}
