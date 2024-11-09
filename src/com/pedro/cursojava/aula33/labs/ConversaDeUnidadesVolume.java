package com.pedro.cursojava.aula33.labs;

import java.text.DecimalFormat;

public class ConversaDeUnidadesVolume {
	
private static double result = 1;
	
	public static double converterLitroCentimetrosCubi(double num1) {
		result = num1 * 1000;
		DecimalFormat df = new DecimalFormat();
		System.out.println(num1 + "L = " + df.format(result) + "cm³");
		return result;
		  
	}
	
	public static double converterMetroCubicoLitro(double num1) {
		result = num1 * 1000;
		DecimalFormat df = new DecimalFormat();
		System.out.println(num1 + "m³ = " + df.format(result) + "L");
		return result;
		
	}
	
	public static double converterMetroCubPesCub(double num1) {
		result = num1 * 35.32;
		DecimalFormat df = new DecimalFormat();
		System.out.println(num1 + "m³ = " + df.format(result) + "pes³");
		return result;
	}
	
	public static double converterGalaoAmePoleCub(double num1) {
		result = num1 * 231;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(num1 + "galAme = " + df.format(result) + "pol³" );
		return result;
	}
	
	public static double converterGalaoAmeLitros(double num1) {
		result = num1 * 3.78;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(num1 + "galAme = " + df.format(result) + "L" );
		return result;
	}

}
