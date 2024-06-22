package com.pedro.letscode;

public class Peixe extends Animal {//Implementando Herança, Peixe é classe filha de Animais
	
	public Peixe(String nome, String cor, double peso) {
		super(nome, cor, peso);
	
	}

	static int contPeixe;

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("CONTINUE A NADAR NADAR NADAR");
	}

	
	
	
	
}
