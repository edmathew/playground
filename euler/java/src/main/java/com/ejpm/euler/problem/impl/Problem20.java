package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import java.math.BigInteger;

/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/
public class Problem20 implements Problem {

    @Override
    public void execute() {
		BigInteger aux = factorial(100);
		System.out.println(aux);
		
		String fac = ""+aux;
		int soma = 0;
		
		for(int i = 0; i < fac.length(); i++){
			soma += Double.parseDouble(""+fac.charAt(i));
		}
		
		System.out.println("Problem20: "+soma);
    }
    
	public static BigInteger factorial (int numero){
		if(numero == 1 || numero == 0)
			return BigInteger.ONE;
		else
			return BigInteger.valueOf(numero).multiply(factorial(numero -1));
	}

}
