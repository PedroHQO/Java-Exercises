package com.pedro.cursojava.aulasomatorio;

public class SomatorioMP {

	public static void main(String[] args) {
		double[] valores = {4.5,3.2,5.8};
		double[] pesos = {2,3,1};
		double vp =0;
		int passos = 0;
		double p  =0;
		
		if(valores.length != pesos.length) {
			System.out.println("Valores e pesos diferentes");
			return;
		}
		
		for(int i = 0; i < pesos.length; i++) {
			passos++;
			vp += pesos[i] * valores[i];
			p += pesos[i];
		}
		
		double res = vp/p;
		
		System.out.println(passos);
		System.out.println(res);
	}
	
	
}
