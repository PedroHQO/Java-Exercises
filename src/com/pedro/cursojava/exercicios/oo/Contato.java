package com.pedro.cursojava.exercicios.oo;

public class Contato {

	String nome;
	String numero;
	int ddd;
	String tipoNumero;
	
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.nome = "Vidah";
		contato.numero = "99239969";
		contato.ddd = 35;
		contato.tipoNumero = "Celular";
		
		System.out.println("Add Contato");
		System.out.println("Nome: " + contato.nome);
		System.out.println("Número + DDD: " + contato.ddd +" " +  contato.numero);
		System.out.println("Tipo de Contato: " + contato.tipoNumero);

	}

}
