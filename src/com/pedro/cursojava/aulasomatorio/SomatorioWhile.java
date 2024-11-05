package com.pedro.cursojava.aulasomatorio;

public class SomatorioWhile {
	public static void main(String[] args) {
		
		int[] nums = {3,2,5,6};
		
		int soma = 0;
		int i = 0;
		
		while(i < nums.length) {
			soma += nums[i];
			System.out.println(nums[i]);
			i++;
		}
		
		System.out.println(soma);
	}
}
