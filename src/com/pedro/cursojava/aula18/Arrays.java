package com.pedro.cursojava.aula18;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 =31.3;
		double tempDia002 =32;
		double tempDia003 =33.5;
		double tempDia004 =34;
		double tempDia005 =33;
		
		
		/*a nomeação de um array em java é desta forma.
		 * É indicado declarar o tipo do array(double, int, string) > colchetes []; nome_do_Array >
		 * = > new tipo do array > quantidade de posições dentro do colchete [365]*/
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[5] = 33;
		
		//Para imprimirmos um array
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		/*Para saber o tamanho do array, utilizamos a pripriedade length(tamanho)
		Não está voltado para quantas posições eu já setei/ocupei, mas sim para
		quantas eu posso usar (365).*/
		
		System.out.println("O tamanho do array : " + temperaturas.length);
		
		//Como imprimir todos os valores disponiveis no array?
		//através do for(mais comum), porém pode ser while; Do- while
		//independente do tipo primitivo que utilizar lembre-se, a 
		//posição inicial de um array é sempre 0
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temoeratura do dia" + (i+1) + " é:" + temperaturas[i]);
			
		}
		
		//Existe um 'for' melhorado que é bem utilizado para trabalhar com array
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
