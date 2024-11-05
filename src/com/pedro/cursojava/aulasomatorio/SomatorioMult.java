package com.pedro.cursojava.aulasomatorio;

public class SomatorioMult {

	public static void main(String[] args) {
		int[] nums = {3,2,5,6};
		
		int soma = 0;
		for(int i=0; i<nums.length; i++) {
			soma+= 2* nums[i];
			System.out.println(nums[i]);
		}
		System.out.println(soma);

	}

}
