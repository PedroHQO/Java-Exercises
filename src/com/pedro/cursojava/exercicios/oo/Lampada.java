package com.pedro.cursojava.exercicios.oo;

/*Escreva	uma classe para	representar	uma	lâmpada	que	está	à	venda	em	
um	supermercado.*/

public class Lampada {
	
	String tipLamp;
	String volts;
	double preco;
	int tempVida;
	int pot;
	
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		lamp.pot = 85;
		lamp.tipLamp = "Incandecente";
		lamp.tempVida = 5000;
		lamp.preco = 9.7;
		lamp.volts = "127/220";
		
		System.out.println("Tipo de Lâmpada: " + lamp.tipLamp);
		System.out.println("Potência W: " + lamp.pot);
		System.out.println("Volt's: " + lamp.volts);
		System.out.println("Tempo de Vida : " + lamp.tempVida + "hrs");
		System.out.println("Preço: R$" + lamp.preco);
		
		System.out.println("-------------------------------------");
		
		Lampada incande = new Lampada();
		
		incande.pot = 45;
		incande.tipLamp = "Incandecente";
		incande.tempVida = 1000;
		incande.preco = 4.7;
		incande.volts = "127";
		
		System.out.println("Tipo de Lâmpada: " + incande.tipLamp);
		System.out.println("Potência W: " + incande.pot);
		System.out.println("Volt's: " + incande.volts);
		System.out.println("Tempo de Vida : " + incande.tempVida + "hrs");
		System.out.println("Preço: R$" + incande.preco);
		
	}

}
