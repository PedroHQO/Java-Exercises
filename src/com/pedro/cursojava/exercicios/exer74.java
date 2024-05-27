package com.pedro.cursojava.exercicios;

import java.util.Scanner;

/*O Sr. Manoel Joaquim expandiu seus negócios para além dos 
negócios de 1,99 e agora possui uma loja de conveniências. Faça um 
programa que implemente uma caixa registradora rudimentar. O 
programa deverá receber um número desconhecido de valores 
referentes aos preços das mercadorias. Um valor zero deve ser 
informado pelo operador para indicar o final da compra. O programa 
deve então mostrar o total da compra e perguntar o valor em dinheiro 
que o cliente forneceu, para então calcular e mostrar o valor do troco. 
Após esta operação, o programa deverá voltar ao ponto inicial, para 
registrar a próxima compra. A saída deve ser conforme o exemplo 
abaixo:
o Lojas Tabajara 
o Produto 1: R$ 2.20 
o Produto 2: R$ 5.80 
o Produto 3: R$ 0 
o Total: R$ 9.00 
o Dinheiro: R$ 20.00 
o Troco: R$ 11.00*/

public class exer74 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	
		double total = 0;
		double valor, dinheiro;
		
		
		System.out.println("Lojas Tabajara");
		System.out.println("Digite o valor dos seus produtos(Digite '0' para encerrar)");
		
		for(int i = 1; ; i++) {
			System.out.print("Produto " + i + ": ");
			valor = ler.nextDouble();
			
			total += valor;
			
			if(valor == 0) {
				System.out.println("Total: " + total);
				System.out.print("Dinheiro: \n");
				dinheiro = ler.nextDouble();
				
				while(dinheiro < total) {
					System.out.print("Pagamento menor que total compra: \n");
					dinheiro = ler.nextDouble();
				}
				
				double troco = dinheiro - total;
				System.out.printf("Troco: %.2f\n", troco);
				
			}
		}
	}

}
