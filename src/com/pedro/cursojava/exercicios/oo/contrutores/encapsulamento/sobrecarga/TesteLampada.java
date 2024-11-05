package com.pedro.cursojava.exercicios.oo.contrutores.encapsulamento.sobrecarga;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada estado = new Lampada("Oled", "220V", 27, "Branco", "LED", 10, args, true, false);
		
		estado.setCor("Amarelo");
		System.out.println("Cor da Lampada é " + estado.getCor());
		System.out.println("Tensão da Lampada é " + estado.getTensao());
		
		estado.mudarEstado();
		
		estado.desligarLampada();
		
		estado.ligarLampada();
		
		estado.desligarLampada();
		
		

	}

}
