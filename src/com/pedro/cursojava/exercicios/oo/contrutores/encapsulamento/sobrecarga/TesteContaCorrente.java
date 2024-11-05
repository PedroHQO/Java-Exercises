package com.pedro.cursojava.exercicios.oo.contrutores.encapsulamento.sobrecarga;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(null, null, false, 0, 0);
		conta.setAgencia("1625");
		conta.setNumero("17573-0");
		conta.setEspecial(true);
		conta.setLimiteEspecial(400);
		conta.setSaldo(-10);
		
		System.out.println("Agência: " + conta.getAgencia() + " da Conta: " + conta.getNumero() + ". Saldo = R$" + conta.getSaldo());
		
		boolean saqueEfetuado = conta.sacar(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.verificarSaldo();
		}else {
			System.out.println("Operação Cancelada. Saldo Insuficiente!");
		}
		
		saqueEfetuado = conta.sacar(300);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.verificarSaldo();
		}else {
			System.out.println("Operaçãoo Cancelada. Saldo Insuficiente!");
		}
		
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.verificarSaldo();
		
		saqueEfetuado = conta.sacar(115);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.verificarSaldo();
		}else {
			System.out.println("Operaçãoo Cancelada. Saldo Insuficiente!");
		}
		conta.verificarSaldo();
		
		conta.sacar(315);
		if (conta.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
		conta.verificarSaldo();
		
		conta.sacar(300);
		conta.verificarSaldo();
		if (conta.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
		
		
	}
}
