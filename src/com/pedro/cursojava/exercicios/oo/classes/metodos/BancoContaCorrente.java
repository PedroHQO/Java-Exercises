package com.pedro.cursojava.exercicios.oo.classes.metodos;

import java.util.Scanner;
import java.util.Random;

/*Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um	
limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
para	testar	essa	classe*/

public class BancoContaCorrente {

	String numeroConta;
	double saldo;
	char status;
	int limiteConta;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		
		BancoContaCorrente acoes = new BancoContaCorrente();
	
		acoes.limiteConta = 700;
		
		System.out.println("Digite o número da conta: ");
		acoes.numeroConta = ler.next();
		
		System.out.println("Você é cliente especial? (S/N)");
		acoes.status = ler.next().charAt(0);
		
		
		System.out.println("-----------------------");
		System.out.println("Conta: " + acoes.numeroConta);
		if(acoes.status == 's') {
			System.out.println("Status Conta: Especial");
		}else {
			System.out.println("Status Conta: Comun");
		}
		System.out.println("-----------------------");
		
	
		boolean operacoes = false;
		while(!operacoes) {
			
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Depósito");
			System.out.println("3. Saque");
			System.out.println("4. Sair");
			
			System.out.println("Escolha a opção desejada: ");
			byte opcao = ler.nextByte();
			
			switch(opcao) {
			case 1:
				System.out.printf("Seu Saldo é: %.2f\n", acoes.consultarSaldo());
				System.out.println("__________");
				break;
				
				
			case 2:
				System.out.println("Digite o valor: ");
				double valorDeposito = ler.nextDouble();
				acoes.depositar(valorDeposito);
				System.out.println("Deposito Feito Com Sucesso");
				System.out.println("__________");
				break;
				
			case 3:
				System.out.print("Digite o Valor Que Deseja Sacar:");
				double valorSaque = ler.nextDouble();
				acoes.sacar(valorSaque);
				
				if(acoes.sacar(valorSaque)) {
					System.out.println("SAQUE REALIZADO COM SUCESSO!");
				}else {
					System.out.println("SALDO INSULFICIENTE PARA SAQUE!");
					System.out.println(" ");
					System.out.println("Deseja utilizar cheque especial: (S/N)");
					char cheque = ler.next().charAt(0);
					if(cheque == 's') {
						System.out.println("Limite para cheque especial aplicado ao saldo ");
						acoes.liberarCheque(valorSaque);
					}else {
						System.out.println("Cancelando operação!");
					}
					
				}
				System.out.println("__________");
				break;
			case 4:
			    operacoes = true;
				System.out.println("Saindo...");
				System.out.println("__________");
				break;
			default: 
				System.out.println("Opção Inválida. tente Novamente!");
				System.out.println("__________");
				break;
			}	
		}
	}
	
	double consultarSaldo() {

		return saldo ;
		
	}
	
	public void depositar(double valor) {
		if(valor > 0){
		    saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && saldo >= valor){
		    saldo = saldo - valor;
		    return true;
		}else{
		    return false;
		}
	}
	
	public void liberarCheque(double valor) {
		Random num = new Random();
		valor = num.nextDouble((700 - 100) + 1) + 100;
		saldo += valor;	
	}	
}