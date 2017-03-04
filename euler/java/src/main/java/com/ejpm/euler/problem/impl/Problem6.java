package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
 
	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 1^(2) + 2^(2) + ... + 10^(2) = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)^(2) = 55^(2) = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten natural numbers
	 * and the square of the sum is 3025 - 385 = 2640.
	 * Find the difference between the sum of the squares of the first 
	 * one hundred natural numbers and the square of the sum.
	 */
public class Problem6 implements Problem {

    @Override
    public void execute() {
		long result = quadradoDaSoma(100)- somaDosQuadrados(100);
		
		System.out.println("Problem6 Resultado: "+result);
    }

	public static long somaDosQuadrados(long numero){
		assert numero > 0;
		
		long count = 1;
		long soma = 0;
		
		do{
			soma += Math.pow(count, 2);
			count ++;
		}while(count <= numero);
		
		return soma;
	}
	
	public static long quadradoDaSoma(long numero){
		assert numero > 0;
		
		long soma = 0;
		for(int count = 1; count <= numero; count ++){
			soma += count;
		}
		
		return (long) Math.pow(soma, 2);
	}
	
}
