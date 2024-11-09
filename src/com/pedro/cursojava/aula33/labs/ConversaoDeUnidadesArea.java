package com.pedro.cursojava.aula33.labs;

import java.text.DecimalFormat;

public class ConversaoDeUnidadesArea {
	private static double result = 1;
	
	public static double converterMetroPaPesQuadrados(double num1) {
		result = num1 * 10.76;
		System.out.println(num1 + "m² = " + result + "pes²");
		return result;
		  
	}
	
	public static double converterPesQuadradosPaCent(double num1) {
		result = num1 * 929;
		System.out.println(num1 + "pes² = " + result + "cm²");
		return result;
		
	}
	
	public static double converterMilhaPaAcres(double num1) {
		result = num1 * 640;
		System.out.println(num1 + "milha² = " + result + "acres");
		return result;
	}
	
	public static double converterAcrePaPesQuadrados(double num1) {
		result = num1 * 43560;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print(num1 + "acre = " + df.format(result) + "pes²" );
		return result;
	}

}
