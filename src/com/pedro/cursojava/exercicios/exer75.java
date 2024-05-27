package com.pedro.cursojava.exercicios;

import java.util.Scanner;

public class exer75 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
        int cont = 0;
        double total = 0;
        double temp;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        
        System.out.println("Digite as temperaturas(Digite 's' quando quiser parar, e qualquer letra para continuar)");
        for(int i = 1; ; i++){
            System.out.print("Temperatura " + i + ": ");
            temp = ler.nextDouble();
            System.out.print("Deseja parar? ");
            String letra = ler.next().toLowerCase();
            total += temp;
            cont++;
            
            if(temp > maior){
                maior = temp;
            }
            if(temp < menor){
                menor = temp;
            }
            
            if(letra.equalsIgnoreCase("s")){
                
              double resul = total / cont;
              
              System.out.printf("M.D Temperaturas = %.1f\n", resul);
              System.out.println("Menor Temperatura: " + menor);
              System.out.println("Maior Temperatura: " + maior);
              break;
            }
        }


	}

}
