package com.pedro.letscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();
		
		LocalDate today = LocalDate.now();//Definindo parametro responsavel por mostrar data
		
		System.out.println("data: " + today);
		
		Locale brasil = new Locale("pt", "BR");//Definindo parametro responsavel por mostrar no formato PTBr
		System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));//Imprimindo dia da semana formato brasil
		String diaSemana = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		String saudacao = " ";
		LocalDateTime hora = LocalDateTime.now(); //Definindo parametro responsavel por mostrar hora
		if(hora.getHour() >= 0 && hora.getHour() <= 12) {
			saudacao = "Bom-Dia";
		}else if(hora.getHour() > 12 && hora.getHour() < 18) {
			saudacao = "Bom-Tarde";
		}else if(hora.getHour() >= 18 && hora.getHour() <= 24) {
			saudacao = "Boa-Noite";
		}
		
		System.out.println("Bem-vindo: " + nome + ". Hoje é: " + today + ". E às horas são: " + hora + ". " + saudacao);
		
		System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
		//esses %s, são marcações para representar o uso de STRINGS.
		
	}

}
