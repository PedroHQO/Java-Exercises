package com.pedro.cursojava.exercicios.oo;

public class ContaBancaria {
	
	int agencia;
	int numConta;
	int digConta;
	double limiteConta;
	double saldo;
	String status;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.agencia = 1625;
		conta.numConta = 17573;
		conta.digConta = 0;
		conta.status = "Especial";
		conta.limiteConta = 5000;
		conta.saldo = 1697.75;
		
		System.out.println("Agência: " + conta.agencia);
		System.out.println("Número Conta: 00" + conta.numConta);
		System.out.println("Dígito da Conta: " + conta.digConta);
		System.out.println("Tipo da Conta: "+ conta.status);
		System.out.println("Limite Conta: " + conta.limiteConta);
		System.out.println("Saldo Atual: " + conta.saldo);
		

	}

}
